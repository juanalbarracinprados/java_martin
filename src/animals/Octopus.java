package animals;

public class Octopus extends Animal implements IMovable, IHeartable {
    private Heart[] hearts = {new Heart(50), new Heart(50) ,new Heart(50)};
    
    Octopus(String name, int[] size) {
        super(name, Race.OCTOPUS, size);
    }

    @Override
    public int getBpm() {
        int bpm = 0;
        for(Heart heart : this.hearts)
            bpm += heart.bpm;
        return bpm;
    }

    @Override
    public String toString(){
        return super.toString() + String.format(" (%s heartbeats)", this.getBpm());
    }

    

    
}
