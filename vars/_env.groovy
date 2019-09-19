#!/usr/bin/env groovy

def call(){
     git 'https://github.com/sachin412/library.git'
    
    withEnv(['name={git show -s --pretty=%an}']) {
    sh 'cd /var/lib/jenkins/workspace/api-testing'
    sh 'eval "$name"'
  }
}
