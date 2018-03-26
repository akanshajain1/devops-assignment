stage 'Load a file from GitHub'
node{

def helloworld = fileLoader.fromGit('fileloader/jenkinsfile', 
        'https://github.com/akanshajain1/devops-assignment.git', 'master', null, '')

stage 'Run method from the loaded file'
def test = ''
        test = helloworld.printHello()
        echo test

}
