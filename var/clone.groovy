def call(String url,String branch){
    echo "cloning code from GitHub...."
    git url: "${url}", branch: "${branch}"
    echo "successfully cloned the code...."
}
