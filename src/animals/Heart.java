package animals;

final class Heart {
    public int bpm;
    Heart(int bpm) {
        this.bpm = bpm;
    }
    void beat() {
        this.bpm++;
    }
}