public class Mouse extends Animal {
    public Mouse() {
        super();
        System.out.println("Now I am a Mouse!");
    }
    @Override
    public String sleep() {
        return "A Mouse sleeps...";
    }

    @Override
    public String eat() {
        return "A Mouse  eats...";
    }

    public String bits() {
        //you can have a another property added to it the parent class
        //in the child class
        return "A Mouse bit .....";
    }

}


