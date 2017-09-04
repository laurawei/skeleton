skeleton
============
A super simple foundation for building a scalable RESTful HTTP servers

To build and run with docker:

Run ./gradlew distTar this tells gradle to make a .tar file containing the java application code and all dependencies
Run docker build -t myapp . this runs the Dockerfile, and builds an image tagged with myapp. See all images with docker images
Run docker run -p 80:8080 myapp this runs the myapp image, routing port 80 on Your Machine to port 8080 in the container
