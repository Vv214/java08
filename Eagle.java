public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    public void setAltitude(int altitude) {
        this.altitude = this.altitude + altitude;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        System.out.printf("%s takes off in the sky.\n", this.getName());
    }

    @Override
    public void ascend(int altitude) {
        setAltitude(altitude);
        System.out.printf("%s flies upward, altitude: %d.\n", this.getName(), this.altitude);
    }

    @Override
    public void glide() {
        System.out.printf("glides into the air. \n");
    }

    @Override
    public void descend(int altitude) {
        setAltitude(-altitude);
        System.out.printf("%s flies downward, altitude: %d.\n", this.getName(), this.altitude);
    }

    @Override
    public void land() {
        if (this.altitude > 9) {
            System.out.printf("%s is too high, it can't land. \n", this.getName());
        } else {
            System.out.printf("%s lands on the ground.\n", this.getName());
        }
    }
}
