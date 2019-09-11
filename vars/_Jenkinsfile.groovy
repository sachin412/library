#!/usr/bin/env groovy

def call(String buildStatus = 'STARTED'){
 
  pipeline {
    agent any
    stages {        
        stage ('pre-build') {
            steps {
                     sh 'npm install'     
            }
        }
        stage('eslint') {
            steps {                    
                    _eslintcommand()                            
            }
        }
     stage ('test') {
            steps {
                    _testrun()         
            }
        }
      stage ('sonarqube') {
            steps {
                     _sonarqube()                    
            }
        }    
    }   

post {
   failure {
      email()
      }
  success {
      _cobertura()
      
      }
   always {       
       _sidebar()  
       _eslint()
       _sonar()
   } 
  }
 }

}
