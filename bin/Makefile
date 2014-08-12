all: core states world

core: Main.java Core.java Window.java
	javac -cp ../jar/slick.jar Main.java Core.java Window.java
	
states: states/States.java states/GameState.java
	javac -cp ../jar/slick.jar states/States.java states/GameState.java
	
world: world/World.java world/TileMap.java world/Tile.java world/Tileset.java
	javac -cp ../jar/slick.jar world/World.java world/TileMap.java world/Tile.java world/Tileset.java