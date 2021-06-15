package animals;

public final class Person extends Animal implements IMovable, IHeartable {
    private Heart heart;
    Person(String name, int[] size) {
        super(name, Race.HUMAN, size);
        this.heart = new Heart(65);
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" (%s heartbeats)", this.getBpm());
    }

    @Override
    public int getBpm() {
        return this.heart.bpm;
    }
}
