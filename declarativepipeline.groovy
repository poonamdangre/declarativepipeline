pipeline{
    agent any
    stages{
        stage('PULL'){
            steps{
                git branch: 'master', url: 'https://github.com/poonamdangre/atulyw-java-tomcat-maven-example.git'
           echo 'pull completed'
            }
        }

        stage('build'){
            steps{
                
                sh'/opt/apache-maven-3.9.4/bin/mvn clean  package'
             echo'build completed'
            }
        }
    }
}
        
        stage('test completed'){
         steps{   
        
    
    
/opt/apache-maven3.9.4/bin/mvn sonar:sonar   -Dsonar.projectKey=freshproject   -Dsonar.host.url=http://3.88.116.75:9000   -Dsonar.login=dd7078997393eb564843e5e2089d2c403f3a6e16


            echo 'test completed'
             
        }
        }
        /*
        stage('deploy'){
            steps{
                echo 'deploy complete'
            }
        } 
    }
}
*/