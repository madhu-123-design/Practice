pipeline {

    agent any

    environment {

        GIT_CREDENTIALS = 'jenkins-git-creds'   // ID from Jenkins Credentials

    }

    stages {

        stage('Checkout') {

            steps {

                checkout scm

            }

        }

        stage('Code Quality Check') {

            steps {

                echo "Running static code analysis / Sonar..."

                // sh 'sonar-scanner'

            }

        }

        stage('Build') {

            steps {

                echo "Running Maven Build"

                sh 'mvn clean package -DskipTests=false'

            }

        }

        stage('Unit Tests') {

            steps {

                sh 'mvn test'

            }

        }

        stage('Merge to Main') {

            when {

                branch pattern: "feature/.*", comparator: "REGEXP"

            }

            steps {

                script {

                    echo "Merging ${env.BRANCH_NAME} into main..."

                    sh """

                        git config user.email "jenkins@example.com"

                        git config user.name "Jenkins CI/CD"

                        git checkout main

                        git pull origin main

                        git merge ${env.BRANCH_NAME}

                        git push https://${GIT_USERNAME}:${GIT_PASSWORD}@github.com/your-repo-url.git main

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
 
