#!/usr/bin/env groovy

def call(){
   sh 'cd /var/lib/jenkins/workspace/'
  sh(script: name='git show -s --pretty=%an', returnStdout: true)
   sh 'echo "$name"'
}
