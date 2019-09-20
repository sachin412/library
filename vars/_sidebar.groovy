#!/usr/bin/env groovy

def call(){  
 name=${'git log -1 | grep Author | awk "{print $2}"'}
 addBadge icon: 'folder.gif', id: '', link: 'https://github.com/sachin412/newnode.git', text: ''
 addBadge icon: 'folder.gif', id: '', link: '', text: '${'git log -1 | grep Author | awk "{print $2}"'}'
// addShortText background: 'yellow', borderColor: '', color: '', link: '', text: 'sachin412'
 sh 'echo (git log -1 | grep Author | awk "{print $2}" > name.txt)'
 sh 'cat name.txt'
 }
