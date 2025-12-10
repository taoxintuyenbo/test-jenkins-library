def call () {
  stage ('Check with SonarQube') {
    withSonarQubeEnv(env.SONARQUBE_SERVER){
      sh "${MAVEN_HOME}/bin/mvn sonar:sonar -Dsonar.projectName=${PROJECT_NAME}-${BRANCH_NAME} -Dsonar.projectKey=${PROJECT_NAME}-${BRANCH_NAME}"
    }
  }
}
