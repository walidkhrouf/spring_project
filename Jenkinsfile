pipeline {
    agent any
    stages {
        stage('Compile Stage') {
            steps {
                withSonarQubeEnv(installationName: 'sq1') {
                sh "mvn clean sonar:sonar"
                }
            }
        }
    }
}