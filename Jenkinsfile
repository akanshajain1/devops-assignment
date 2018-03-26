stage 'Load a file from GitHub'
node{
def directory = pwd()
        dir('/var/lib/jenkins/workspace/new_job/libLoader'){
                sh 'ls -l'
        }

def helloworld = fileLoader.fromGit('fileloader/jenkinsfile', 
        'https://github.com/akanshajain1/devops-assignment.git', 'master', null, '')

stage 'Run method from the loaded file'
helloworld.printHello()

}
