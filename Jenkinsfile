
pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/madhu-123-design/Practice.git'
            }
        }

        stage('Build') {
            steps {
                echo 'Building the project...'
                // Add build commands here, e.g., mvn clean install or npm install
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
                // Add test commands here
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying application...'
                // Add deployment steps here
            }
        }
    }
}
