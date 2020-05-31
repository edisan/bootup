# Copyright (c) 2020, Ed Sananikone. All rights reserved.
#
# This program is free software; you can redistribute it and/or modify
# it under the terms of the GNU General Public License as published by
# the Free Software Foundation; version 2 of the License.
#
# This program is distributed in the hope that it will be useful,
# but WITHOUT ANY WARRANTY; without even the implied warranty of
# MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
# GNU General Public License for more details.
#
# You should have received a copy of the GNU General Public License
# along with this program; if not, write to the Free Software
# Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301 USA
FROM oraclelinux:7-slim

# Maintainer
LABEL maintainer="ed@ukuplao.com"

# Environment variables
ENV BOOTUP_HOME=/u01/bootup \
    JAVA_HOME=/u01/jdk \
    OWNER=bootup \
    BOOTUP_JAR=bootup-0.0.1-SNAPSHOT.jar

# Install tar
RUN yum install -y tar gzip

# Create directories
RUN mkdir -p $JAVA_HOME $BOOTUP_HOME \
  && useradd -b /u01 -m -s /bin/bash $OWNER \
  && chown $OWNER:$OWNER -R /u01

# Change to user bootup
USER $OWNER

# Copy bootup springboot deploy jar
COPY $BOOTUP_JAR $BOOTUP_HOME

# Copy jdk tar ball for install, NOTE: Download JDK from otn.oracle.com into
# same directory as Dockerfile
COPY jdk-8u251-linux-x64.tar.gz /u01/bootup/jdk.tgz

# Install JDK
RUN tar zxvf ~/jdk.tgz -C ~/ \
    && rm ~/jdk.tgz \
    && mv ~/jdk*/* $JAVA_HOME

# Expose port, use either -P or -p 8080:8080 when running image
EXPOSE 8080

# Start up bootup rest service on port 8080
CMD ["/bin/bash", "-c", "$JAVA_HOME/bin/java -jar $BOOTUP_HOME/$BOOTUP_JAR"]

