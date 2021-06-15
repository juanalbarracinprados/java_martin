package animals;

public class Person extends Animal implements IMovable, ICollisionable {
    Heart heart;
    Person(String name, int[] size) {
        super(name, Race.HUMAN, size);
        this.heart = new Heart(65);
    }
    
}
