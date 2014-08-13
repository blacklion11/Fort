all: core

core: $(wildcard src/*.java)  $(wildcard src/states/*.java) $(wildcard src/world/*.java)
	javac -d bin -cp jar/slick.jar $(wildcard src/*.java)  $(wildcard src/states/*.java) $(wildcard src/world/*.java)
