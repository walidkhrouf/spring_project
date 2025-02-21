pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }
       stage('Sonar Analysis') {
            steps {
                sh 'mvn sonar:sonar'
            }
        }
    }
}