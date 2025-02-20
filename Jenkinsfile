pipeline {
    agent any
    stages {
        stage('Compile and Analyze') {
            steps {
                withSonarQubeEnv(installationName: 'sq1') {
                    sh "mvn clean package sonar:sonar"
                }
            }
        }
    }
}