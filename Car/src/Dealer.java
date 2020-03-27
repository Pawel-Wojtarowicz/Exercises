public class Dealer extends Car.Builder {


    int isRed(Car c){
        if (c.color == ("Red")){
            return 1;
        }
        else return 0;
    }
    int hasTurbo(Car c){
        if (c.hasTurbo){
            return 1;
        }
        else return 0;
    }

    double calculateCarPrice(Car c){
        double value;
        value = ((2500 * c.engineCapacity) - (100 * c.age) + (7500 * isRed(c)) + (10 * c.horsePower) + (10000 * hasTurbo(c)));
        return value*0.8;
    }
}
