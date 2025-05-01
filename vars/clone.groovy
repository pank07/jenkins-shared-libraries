def call(String gitUrl, String gitBranch) {
    echo "Cloning repository: ${gitUrl} on branch: ${gitBranch}"
    checkout([
        $class: 'GitSCM',
        branches: [[name: "*/${gitBranch}"]],
        userRemoteConfigs: [[
            url: "https://github.com/pank07/django-notes-app.git",
            credentialsId: 'github_PAT'
        ]]
    ])
}
