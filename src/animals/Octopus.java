package animals;

public class Octopus extends Animal implements IMovable, ICollisionable {
    Heart[] hearts = {new Heart(50), new Heart(50) ,new Heart(50)};
    
    Octopus(String name, int[] size) {
        super(name, Race.OCTOPUS, size);
    }
    
}
