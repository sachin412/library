#!/usr/bin/env groovy

def call(String buildStatus = 'STARTED'){

emailext attachLog: true, body: '''Hello,

your current build status is failed. please check the status here.  

thanks''', compressLog: true, subject: 'build is failed. please check the log from link', to: 'sachin.pavar@volansys.com'

}
