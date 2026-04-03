class Car {
    int modelYear;
    String modelName;

    public Car (String modelName) {
        this(2020, modelName);
    }

    public Car (int modelYear, String modelName) {
        this.modelYear = modelYear;
        this.modelName = modelName;
    }

    public void displayInfo () {
        System.out.println(modelName + " " + modelYear);
    }
}
    public class MyCar {
        public static void main(String[] args) {

    
    Car car = new Car("Mustang");
    Car car2 = new Car(2020, "Ford");

    car.displayInfo();
    car2.displayInfo();
}
}

// Use of this() keyword