#!/usr/bin/env groovy

def call(){  

    
   sh 'echo "${git show -s --pretty=%an}"'
 
}
