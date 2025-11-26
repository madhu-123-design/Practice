
pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        } 
        stage('Build') {
            steps {
                echo "Running Maven Build"
               bat 'mvn clean package -DskipTests=true'
            }
        }
        stage('Merge main into master') {
            when {
                branch 'main'
            }
            steps {               
               script {
                   
withCredentials([usernamePassword(credentialsId:'github-pat', usernameVariable: 'GIT_USER', passwordVariable: 'GIT_TOKEN')]) {

      bat 'rmdir /S /Q merge-work || echo "No folder to delete"' 
    bat """
  git clone  https://${GIT_USER}:${GIT_TOKEN}@github.com/madhu-123-design/Practice.git merge-work
   bat"""
        cd merge-work        
        git checkout master 
        git pull origin master
    git config merge.ours.driver true
         git merge -s ours origin/main --no-edit
        git push https://${GIT_USER}:${GIT_TOKEN}@github.com/madhu-123-design/Practice.git master
    """
}
                }
            }
        }
    }

    post {
        failure {
            echo "Build failed. Merge skipped."
        }
        success {
            echo "Build success!"
        }
    }
}
