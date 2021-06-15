package animals;

interface IMovable {
    void setPosition(int x, int y);
    default void move(int x, int y) {
        this.setPosition(x, y);
    }
}