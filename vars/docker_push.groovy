def call(String Project, String ImageTag, String dockerhubuser){
  withCredentials([usernamePassword(crendentialsId:'dockerHubCred',
  passwordVariable:'dockerHubPass', usernameVaribale: 'dockerHubuser')])
  sh "docker login -u ${dockerhubuser} -p ${dockerhubpass}"
}
sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"
}
