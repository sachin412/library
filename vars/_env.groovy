#!/usr/bin/env groovy

def call(){
    withEnv(['name={git show -s --pretty=%an}']) {
    git branch: 'test-lib', url: 'https://github.com/sachin412/newnode.git'
    sh 'eval "$name"'
  }
}
