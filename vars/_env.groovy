#!/usr/bin/env groovy

def call(){  

    sh ' git log -1 | grep Author | awk "{print $2}"'
    
   sh 'echo "${git show -s --pretty=%an}"'
 
}
