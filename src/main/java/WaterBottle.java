
public class WaterBottle {

        private int volume;


        public WaterBottle(int volume) {
            this.volume = volume;
        }

    public int getVolume() {
        return this.volume;

        }

    public void drink() {
        this.volume = this.volume - 10;

    }

    public void all() {
        this.volume = this.volume - 100;

    }
    public void up() {
        this.volume = this.volume = 100;

    }

}
