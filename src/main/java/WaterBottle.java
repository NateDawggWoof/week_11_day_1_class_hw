public class WaterBottle {

    private int volumeCapacity;
    private  int currentVolume;

    public WaterBottle(int volumeCapacity){
        this.volumeCapacity = volumeCapacity;
        this.currentVolume = volumeCapacity;
    }

    public int getVolume(){
        return this.currentVolume;
    }


    public int drink() {
        return this.currentVolume-10;
    }

    public int empty() {
        return this.currentVolume - this.currentVolume;
    }

    public int refill(){
        this.currentVolume = this.volumeCapacity;
                return this.currentVolume;
    }
}
