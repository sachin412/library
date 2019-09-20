#!/usr/bin/env groovy

def call(){  
 sh 'git log -1 | grep Author | awk "{print $2}" > name.txt'
 usrname = sh ' cut -d " " -f 2 name.txt '
 
 addBadge icon: 'folder.gif', id: '', link: 'https://github.com/sachin412/newnode.git', text: ''
 addShortText background: 'yellow', borderColor: '', color: '', link: '', text: '${usrname}'

 }
