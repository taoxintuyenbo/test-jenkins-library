def call () {
  stage ('Check with SonarQube') {
    withSonarQubeEnv(env.SONAR_SERVER){
      sh "${MAVEN_HOME}/bin/mvn clean verify sonar:sonar -Dsonar.projectName=${PROJECT_NAME}-${BRANCH_NAME} -Dsonar.projectKey=${PROJECT_NAME}-${BRANCH_NAME}"
    }
  }
}
