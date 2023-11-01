def cloneProjectRepo(repoUrl, branch) {
    sh "git clone -b ${branch} ${repoUrl}"
}

def repoUrl = 'https://github.com/vyadav5/ansible-newRelic.git' 
def branch = 'main'  
cloneProjectRepo(repoUrl, branch)
