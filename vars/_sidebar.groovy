#!/usr/bin/env groovy

def call(){   
 addBadge icon: 'folder.gif', id: '', link: 'https://github.com/sachin412/newnode.git', text: ''
 addShortText background: 'yellow', borderColor: '', color: '', link: '', text: '$(git log -1 | grep Author | awk "{print $2}")'
 }
