#!/usr/bin/env groovy

def call(){
 user='git show -s --pretty=%an'
 addBadge icon: 'folder.gif', id: '', link: 'https://github.com/sachin412/newnode.git', text: ''
 addShortText background: 'yellow', borderColor: '', color: '', link: '', text: '$user'
 
}
