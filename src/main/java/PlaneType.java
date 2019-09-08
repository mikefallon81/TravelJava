public enum PlaneType {

    BOEING737(5, 10.00),
    BOEING747(2, 5.00);


    private final int capacity;
    private final double weight;


    PlaneType(int capacity, double weight){
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public double getWeight(){
        return this.weight;
    }
}
