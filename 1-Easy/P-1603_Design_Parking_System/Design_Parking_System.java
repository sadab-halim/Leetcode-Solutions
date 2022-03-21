class ParkingSystem {

    private final int[] space;
    
    public ParkingSystem(int big, int medium, int small) {
        this.space = new int[] {big, medium, small};
    }

    public boolean addCar(int carType) {
        return --this.space[carType - 1] >= 0;
    }
}