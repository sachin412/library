#!/usr/bin/env groovy

def call(){
 
withSonarQubeEnv('sonarqube') {
                sh 'node sonar-project.js'
                   }
 
}
