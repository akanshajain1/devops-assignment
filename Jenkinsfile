stage 'Load a file from GitHub'
def helloworld = fileLoader.fromGit('fileloader/jenkinsfile', 
        'https://github.com/akanshajain1/devops-assignment.git', 'master', null, '')

stage 'Run method from the loaded file'
helloworld.printHello()
