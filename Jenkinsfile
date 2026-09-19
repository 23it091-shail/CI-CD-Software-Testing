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
                sh 'mvn clean package'
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -t hospital-app .'
            }
        }

        stage('Run Docker Container') {
            steps {
                sh 'docker run --rm hospital-app'
            }
        }

        stage('Run Selenium Tests') {
            steps {
                sh 'mvn test'
            }
        }
    }

    post {
        always {
            junit '**/target/surefire-reports/*.xml'
        }

        success {
            echo 'Build Successful'
        }

        failure {
            echo 'Build Failed'
        }
    }
}