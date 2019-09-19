#!/usr/bin/env groovy

def call(){  

  name = sh(script: 'git show -s --pretty=%an' , returnStdout: true)
 echo $name
}
