all:
	mvn package
tools:
	sudo add-apt-repository ppa:webupd8team/java
	sudo apt-get -y update
	sudo apt-get install -y maven
	sudo apt-get install -y oracle-java8-installer
	sudo apt-get install -y openjdk-8-jdk
	export JAVA_HOME=/usr/lib/jvm/java-1.8.0-openjdk-amd64
deploy:
	export JAVA_HOME=/usr/lib/jvm/java-1.8.0-openjdk-amd64
	sudo mvn spring-boot:run
