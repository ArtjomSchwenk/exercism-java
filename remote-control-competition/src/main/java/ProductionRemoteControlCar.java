class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar>{
    private int distanceTravelled;
    private int numberOfVictories;

    public void drive() {
        distanceTravelled += 10;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar arg0) {
       // return Integer.compare(arg0.numberOfVictories, this.numberOfVictories); 
       if(this.numberOfVictories > arg0.numberOfVictories) return -1;

       else if(this.numberOfVictories < arg0.numberOfVictories) return 1;

       return 0;
    }
}
