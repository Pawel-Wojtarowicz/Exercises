public class Tiger extends Animal {

    int clawLenght;


    public Tiger(String name, float weight, int clawLenght) {
        super(name, weight);
        this.clawLenght = clawLenght;
    }

    @Override
    void introduce() {
        super.introduce();
        System.out.print(" : I'm a "+ getClass().getName() + ". My name is "+ name + ". I weight " + weight + " kg and my claw lenght is " + clawLenght +".\n");
    }
}
