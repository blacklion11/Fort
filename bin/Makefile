all: core states

core: Main.java Core.java Window.java
	javac -cp ../jar/slick.jar Main.java Core.java Window.java
	
states: states/States.java states/GameState.java
	javac -cp ../jar/slick.jar states/States.java states/GameState.java