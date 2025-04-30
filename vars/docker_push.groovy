def call(String Project, String ImageTag, String dockerhubuser){
  withCredentials([usernamePassword(crendentialsId:'dockerHubCred',
  passwordVariable:'dockerhubpass', usernameVaribale: 'dockerhubuser')])
  sh "docker login -u ${dockerhubuser} -p ${dockerhubpass}"
}
sh "docker push ${dockerhubuser}/${ImageTag}"
}
