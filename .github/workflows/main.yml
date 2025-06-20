pipeline {
    agent any // Specifies that the pipeline can run on any available Jenkins agent

    tools { // Defines the tools to be used in the pipeline
        maven "MAVEN" // Ensure "MAVEN" is the name in Manage Jenkins > Global Tool Configuration
        jdk "JAVA"   // Ensure "JAVA" is the name in Manage Jenkins > Global Tool Configuration
    }

    stages { // Defines the different stages of the pipeline
        stage('Checkout') { // Stage to check out the code
            steps {
                git branch: 'main', url: 'https://github.com/kartik-paliwa1/Maven-Project-with-Jenkins'
            }
        }
        stage('Compile') { // Stage to compile the code
            steps {
                sh "mvn compile"
            }
        }
        stage('Test') { // Stage to run tests
            steps {
                sh "mvn test"
            }
        }
        stage('Package') { // Stage to package the application
            steps {
                sh "mvn package"
            }
        }
        stage('Deploy') { // Stage for deployment (currently a placeholder)
            steps {
                echo 'deploy successfully'
            }
        }
    }
}
