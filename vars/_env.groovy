#!/usr/bin/env groovy

def call(){
   sh 'cd /var/lib/jenkins/workspace/'
   name=$(git show -s --pretty=%an)
  name = sh(script: " echo git show -s --pretty=%an" , returnStdout: true)
   sh 'echo "$name"'
}
