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
                sh 'mvn sonar:sonar -Dsonar.login=squ_8b4818ca5ba20be1809f1d7419b9c1a7fc550de8'
            }
        }
    }
}