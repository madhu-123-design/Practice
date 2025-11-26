
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
    bat """
        git config user.email "jenkins@example.com"
        git config user.name "Jenkins CI/CD"
        git fetch origin master
        git reset --hard
        git clean -fd
        git checkout master || git checkout -b master origin/master
        git pull origin master
        git merge main --no-edit
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
