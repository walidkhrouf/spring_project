pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }
        stage('Sonar Analysis') {
        sh 'mvn sonar:sonar'
    }
    }
}