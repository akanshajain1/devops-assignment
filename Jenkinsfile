stage 'Load a file from GitHub'
node{
def directory = pwd()
        sh 'ls -l'
dir (directory){
        println "dir chane"
        sh 'ls -l'
def helloworld = fileLoader.fromGit('fileloader/jenkinsfile', 
        'https://github.com/akanshajain1/devops-assignment.git', 'master', null, '')

stage 'Run method from the loaded file'
helloworld.printHello()
}
}
