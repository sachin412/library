#!/usr/bin/env groovy

def call(){
   sh 'cd /var/lib/jenkins/workspace/'
   name=`$(git show -s --pretty=%an)`
  sh(script: "$name" , returnStdout: true)
   //sh 'echo "$name"'
}
