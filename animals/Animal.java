package animals;

abstract class Animal {
    Race race;
    String name;
    private int[] position = {0,0};
    private int[] size;

    Animal(String name, Race race, int[] size) {
        this.race = race;
        this.size = size;
        this.name = name;
    }
    
    public int[] getPosition() {
        return this.position;
    }
    
    public int[] getSize() {
        return this.size;
    }

    public void setPosition(int x, int y) {
        this.position[0] = x;
        this.position[1] = y;
    }

    @Override
    public String toString() {
        return this.name + " is " + this.race + ", position: " + this.position[0] + ", " + this.position[1];
    }
}
