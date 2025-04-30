def call(String url, String branch) {
  git credentialsId: 'Github PAT', url: "${url}", branch: "${branch}"
}
