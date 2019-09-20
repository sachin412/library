#!/usr/bin/env groovy

def call(){  
 
 addBadge icon: 'folder.gif', id: '', link: 'https://github.com/sachin412/newnode.git', text: ''
 addBadge icon: 'folder.gif', id: '', link: '', text: 'sachin412'}'
// addShortText background: 'yellow', borderColor: '', color: '', link: '', text: 'sachin412'
 sh 'git log -1 | grep Author | awk "{print $2}" > name.txt'
 
 }
