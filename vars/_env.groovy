#!/usr/bin/env groovy

def call(){
   sh 'cd /var/lib/jenkins/workspace/'
  sh(script: echo 'git show -s --pretty=%an', returnStdout: true)
}
