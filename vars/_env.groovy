#!/usr/bin/env groovy

def call(){
  withEnv(['GIT_AUTHOR_NAME  = \'git show -s --pretty=%an\'', 'EMAIL_TO = \'abc@xyc.com\''])
}
