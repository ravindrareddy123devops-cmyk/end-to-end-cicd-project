
pipeline {

    agent any

    options {
        timestamps()
        disableConcurrentBuilds()
        skipDefaultCheckout(true)
    }

    stages {

        stage('Checkout Source Code') {
            steps {
                echo 'Downloading source code from GitHub'
                checkout scm
            }
        }

        stage('Check Environment') {
            steps {
                sh 'java -version'
                sh 'mvn -version'
            }
        }

        stage('Maven Build') {
            steps {
                echo 'Building Java application using Maven'
                sh 'mvn -B clean package'
            }
        }

        stage('Archive Artifact') {
            steps {
                archiveArtifacts(
                    artifacts: 'target/*.jar',
                    fingerprint: true
                )
            }
        }
    }

    post {
        success {
            echo 'CI PIPELINE SUCCESSFUL!'
        }

        failure {
            echo 'CI PIPELINE FAILED! Check Jenkins console output.'
        }

        always {
            echo 'Pipeline execution completed.'
        }
    }
}

