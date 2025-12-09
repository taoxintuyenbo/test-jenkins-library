def call(){
  stage('Test'){
    try {
        sh "${MAVEN_HOME}/bin/mvn test"
    }
    finally{
        junit '**/target/surefire-reports/TEST-*.xml'
    }
  }
}
