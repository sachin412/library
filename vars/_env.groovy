#!/usr/bin/env groovy

def call(){  

   sh(script: 'git show -s --pretty=%an' , returnStdout: true)
  echo ${git show -s --pretty=%an}
}
