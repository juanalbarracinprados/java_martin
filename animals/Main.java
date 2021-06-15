package animals;

public class Main {
    public static void main(String[] args) {
        Octopus o1 = new Octopus("Juan", new int[] {5,5});
        Person p2 = new Person("Paco", new int[] {2,2});
        o1.move(3, 3);
        p2.move(3, 3);
        System.out.println(o1);
        System.out.println(p2);
        System.out.println("Have collisioned: " + o1.hasCollisioned(p2));
    }
}
