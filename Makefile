`all: core

worldgen:= $(wildcard src/world/gen/*.java)

core: $(wildcard src/fort/*.java)  $(wildcard src/fort/states/*.java)  $(wildcard src/fort/world/*.java)  $(wildcard src/fort/world/gen/*.java) $(wildcard src/fort/input/*.java)
	javac -d bin -cp jar/slick.jar $(wildcard src/fort/*.java)  $(wildcard src/fort/states/*.java)  $(wildcard src/fort/world/*.java)  $(wildcard src/fort/world/gen/*.java) $(wildcard src/fort/input/*.java)