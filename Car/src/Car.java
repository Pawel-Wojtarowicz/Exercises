public class Car {

    String manufacturer;
    int age;
    double engineCapacity;
    String model;
    String color;
    int horsePower;
    boolean hasTurbo;

    private Car(String manufacturer, int age, double engineCapacity, String model, String color, int horsePower, boolean hasTurbo) {
        this.manufacturer = manufacturer;
        this.age = age;
        this.engineCapacity = engineCapacity;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.hasTurbo = hasTurbo;
    }

    @Override
    public String toString() {
        return "Car(" +
                "manufacturer='" + manufacturer + '\'' +
                ", age=" + age +
                ", engineCapacity=" + engineCapacity +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", horsePower=" + horsePower +
                ", hasTurbo=" + hasTurbo +
                ')';
    }

    public static class Builder {
        String manufacturer;
        int age;
        double engineCapacity;
        String model;
        String color;
        int horsePower;
        boolean hasTurbo;


        public Builder setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setEngineCapacity(double engineCapacity) {
            this.engineCapacity = engineCapacity;
            return this;
        }

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setHorsePower(int horsePower) {
            this.horsePower = horsePower;
            return this;
        }

        public Builder setHasTurbo(boolean hasTurbo) {
            this.hasTurbo = hasTurbo;
            return this;
        }

        public Car build(){
            return new Car(manufacturer,age,engineCapacity,model,color,horsePower,hasTurbo);
        }
    }

    public static void main(String[] args) {
        //https://1024kb.pl/wzorce-projektowe/wzorzec-projektowy-builder/

        Car car = new Builder().setManufacturer("Audi")
                .setAge(3)
                .setEngineCapacity(2.8)
                .setHorsePower(220)
                .setHasTurbo(true)
                .build();
        Dealer dealer = new Dealer();
        System.out.println(car.toString() + " costs " + dealer.calculateCarPrice(car));
    }


}
