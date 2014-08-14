all: core

worldgen:= $(wildcard src/world/gen/*.java)

core: $(wildcard src/*.java)  $(wildcard src/states/*.java)  $(wildcard src/world/*.java)  $(wildcard src/world/gen/*.java)
	javac -d bin -cp jar/slick.jar $(wildcard src/*.java)  $(wildcard src/states/*.java) $(wildcard src/world/*.java)  $(wildcard src/world/gen/*.java)