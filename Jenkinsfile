
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
                    withCredentials([usernamePassword(credentialsId: 'github-pat', usernameVariable: 'GIT_USER', passwordVariable: 'GIT_TOKEN')]) {
                        bat """
                            REM Clean up old folder
                            rmdir /S /Q merge-work || echo "No folder to delete"

                            REM Clone repository
                            git clone https://${GIT_USER}:${GIT_TOKEN}@github.com/madhu-123-design/Practice.git merge-work
                            cd merge-work

                            REM Configure Git user
                            git config user.name "jenkins"
                            git config user.email "jenkins@example.com"

                            REM Checkout master and pull latest changes
                            git checkout master
                            git pull origin master --rebase

                            REM Fetch main branch and merge into master
                            git fetch origin main
                            git merge origin/main

                            REM Push updated master branch
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
