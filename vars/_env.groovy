#!/usr/bin/env groovy

def call(){
withEnv(['name=git show -s --pretty=%an']) {
    sh 'echo "$name"'
  }
}
