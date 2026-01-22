class ProductionRemoteControlCar implements RemoteControlCar,Comparable<ProductionRemoteControlCar>{
int distance=0;
    int NumberOfVictories=0;
    public void drive() {
distance+=10;
    }

    public int getDistanceTravelled() {
return distance;
    }
     @Override
public int compareTo(ProductionRemoteControlCar other) {
    return Integer.compare(
            other.getNumberOfVictories(),
            this.getNumberOfVictories()
    );
}

    public int getNumberOfVictories() {
       return NumberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.NumberOfVictories=numberOfVictories;
    }
}
