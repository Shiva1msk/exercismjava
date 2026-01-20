class NeedForSpeed {
    int speed;
    int batteryDrain;
    int meter;
    int battery=100;
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed=speed;
        this.batteryDrain=batteryDrain;
    }

    public boolean batteryDrained() {
        return battery<batteryDrain;
    }

    public int distanceDriven() {
        return meter;
    }

    public void drive() {
        if(battery<batteryDrain){
            return;
        }else{
       meter+=speed;
            battery-=batteryDrain;

        }
    }
    public static NeedForSpeed nitro() {
              return new  NeedForSpeed(50,4);
    }
}

class RaceTrack {
    int distance;
    RaceTrack(int distance) {
       this.distance=distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
int maxBattery=100/car.batteryDrain;
        int maxDistance=car.speed*maxBattery;
        return maxDistance>=distance;
    

}
}
