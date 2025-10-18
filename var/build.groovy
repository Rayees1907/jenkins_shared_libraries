def call(String imageName, String tagName) {
    echo "Building the image..."
    sh "docker build -t ${imageName}:${tagName} ."
    echo "Successfully built the image."
}
