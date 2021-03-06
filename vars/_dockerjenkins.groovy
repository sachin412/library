#!/usr/bin/env groovy

def call(){ 
  pipeline {
    agent {
        docker { image 'node'
               args '-u 0' }
    }
    options { buildDiscarder(logRotator(numToKeepStr: '3')); timestamps() }    
    stages {       
        stage ('pre-build') {           
            steps {
                     sh 'npm install'     
                     _env()
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

