def call(String credID, String imageName, String tagName){
    withCredentials([usernamePassword(
        credentialsId: credID,
        usernameVariable: 'dockerHubUser',
        passwordVariable: 'dockerHubPass'
    )]) {
        sh "echo \$dockerHubPass | docker login -u \$dockerHubUser --password-stdin"
        sh "docker tag ${imageName}:${tagName} ${dockerHubUser}/${imageName}:${tagName}"
        sh "docker push ${dockerHubUser}/${imageName}:${tagName}"
    }
}
