public class Car implements IAggregable<Car, Integer>, IDeeplyCloneable<Car> {

    private int horsepower;

    public Car(int horsepower) {
        this.horsepower = horsepower;
    }


    public Integer aggregate(Integer accum) {
        if (accum == null) {
            return horsepower;
        }
        return horsepower +accum;
    }

    @Override
    public String toString() {
        return "Car [horsepower=" + horsepower + "]";
    }

    @Override
    public Car makeDeepCopy() {
     
        return new Car(horsepower);
    }

}