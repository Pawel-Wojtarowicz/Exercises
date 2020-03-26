public class Bear extends Animal {

    int furLenght;

    public Bear(String name, float weight, int furLenght) {
        super(name, weight);
        this.furLenght = furLenght;
    }

    @Override
    void introduce() {
        super.introduce();
        System.out.print(" : I'm a "+ getClass().getName() + ". My name is "+ name + ". I weight " + weight + " kg and my fur lenght is " + furLenght +".\n");
    }
}
