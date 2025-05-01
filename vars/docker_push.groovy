def call(String Project, String ImageTag, String dockerhubuser){
  withCredentials([usernamePassword(credentialsId:'DockerHubCred',
  passwordVariable:'dockerHubPass', usernameVariable: 'dockerHubuser')])
  {
  sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
  sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"
}
}
