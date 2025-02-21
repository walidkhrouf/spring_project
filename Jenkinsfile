pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Sonar Analysis') {
            steps {
                sh 'mvn sonar:sonar'
            }
        }
    }
}