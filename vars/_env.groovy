#!/usr/bin/env groovy

def call(){
    withEnv(['name={git show -s --pretty=%an}']) {
    git 'https://github.com/sachin412/library.git'
    sh 'eval "$name"'
  }
}
