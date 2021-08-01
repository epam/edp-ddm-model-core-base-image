FROM nexus-docker-registry.apps.cicd2.mdtu-ddm.projects.epam.com/maven:3.8.1-jdk-11-slim
WORKDIR /app
COPY pom.xml settings.xml ./
COPY src src
RUN mvn install --settings settings.xml -DskipTests=true -Dartifactory.baseUrl=https://nexus-public-mdtu-ddm-edp-cicd.apps.cicd2.mdtu-ddm.projects.epam.com -Dartifactory.groupPath=edp-maven-group -Dartifactory.releasePath=edp-maven-releases -Dartifactory.snapshotsPath=edp-maven-snapshots