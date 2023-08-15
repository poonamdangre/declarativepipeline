pipeline{
    agent any
    stages{
        stage('PULL'){
            steps{
                git branch: 'master', url: 'https://github.com/poonamdangre/atulyw-java-tomcat-maven-example.git'
           echo 'pull completed'
            }
        }
    }
}
        /*
        stage('build'){
            steps{
                
                sh'/opt/apache-maven-3.9.4/bin/mvn  package'
             echo'build completed'
            }
        }
        stage('test completed'){
         steps{   
            withSonarQubeEnv(installationName: 'Sonar-server', credentialsId: 'sonartoken1') {
    
    
sh'/opt/apache-maven-3.9.4/bin/mvn sonar:sonar \
  -Dsonar.projectKey=mypro'

            echo 'test completed'
            }   
        }
        }
        stage('deploy'){
            steps{
                echo 'deploy complete'
            }
        } 
    }
}