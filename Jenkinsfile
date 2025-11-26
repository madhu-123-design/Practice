
pipeline {
    agent any
    environment {
        GIT_CREDENTIALS = 'jenkins-git-creds'   // Jenkins credentials ID
        GIT_USERNAME = 'your-username'          // Or use withCredentials block
        GIT_PASSWORD = 'your-token'             // Or use withCredentials block
    }
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build') {
            steps {
                echo "Running Maven Build"
                sh 'mvn clean package -DskipTests=false'
            }
        }
        stage('Merge main into master') {
            when {
                branch 'main'   // Only run when the current branch is main
            }
            steps {
                script {
                    echo "Merging main into master..."
                    sh """
                        git config user.email "jenkins@example.com"
                        git config user.name "Jenkins CI/CD"
                        git fetch origin master
                        git checkout master
                        git pull origin master
                        git merge main --no-edit
                        git push https://${GIT_USERNAME}:${GIT_PASSWORD}@github.com/your-repo-url.git master
                    """
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
