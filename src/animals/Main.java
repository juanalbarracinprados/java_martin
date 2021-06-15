package animals;

public class Main {
    public static void main(String[] args) {
        Octopus o1 = new Octopus("Juan", new int[] {5,5});
        Person p1 = new Person("Martín", new int[] {2,2});

        o1.move(3, 3);
        p1.move(5, 3);
        
        System.out.println(o1 + " has" + (o1.hasCollisioned(p1)?"":" not") + " collisioned with " + p1);
    }
}
