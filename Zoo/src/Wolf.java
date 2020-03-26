public class Wolf extends Animal implements Canine {

    int fangLenght;

    public Wolf(String name, float weight, int fangLenght) {
        super(name, weight);
        this.fangLenght = fangLenght;
    }

    @Override
    public void bark() {
        System.out.println("BARK, BARK, BARK");
    }

    @Override
    void introduce() {
        super.introduce();
        System.out.print(" : I'm a "+ getClass().getName() + ". My name is "+ name + ". I weight " + weight + " kg and my fang lenght is " + fangLenght +".\n");
    }
}
