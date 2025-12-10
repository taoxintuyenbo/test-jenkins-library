def call () {
  stage ('Check with SonarQube') {
    withSonarQubeEnv(env.SONARQUBE_SERVER){
      sh "${MAVEN_HOME}/bin/mvn clean verify sonar:sonar -Dsonar.projectName=${env.PROJECT_NAME}-${env.BRANCH_NAME} -Dsonar.projectKey=${env.PROJECT_NAME}-${env.BRANCH_NAME}"
    }
  }
}
