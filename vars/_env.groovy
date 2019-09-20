#!/usr/bin/env groovy

def call(){  

    sh 'name = git log -1 | grep Author | awk "{print $2}"'
    
    
}
