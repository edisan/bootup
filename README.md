# bootup
SpringBoot samples

### sportsrest
SportsREST is a sample rest service that is a proxy to the backend REST service hosted by sportsdata.io.  Docker used to deploy the service to.  To utilize this sample, you need to do the following:

1. Obtain service key from sportsdata.io and update application.properties file with it (NBA league).
2. Build the service, ./gradlew build
3. Copy the service jar to the docker directory, ./gradlew dockerbootup
4. Obtain JDK from Oracle OTN.  You will have to modify Dockerfile to reference the jdk archive that you downloaded.
5. Use script in docker directory to build Docker image, ./build.sh
6. Run the docker image, ./run.sh
7. Use browser to go to URL, http://localhost:8080/player.  Default id value will show you result of REST call.  Specify ?id= parameter to get information on different player.
