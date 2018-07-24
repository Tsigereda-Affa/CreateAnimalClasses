public class Dog extends Animal{
    public Dog() {
        super();
        //
        System.out.println("Now I am a Dog!");
    }

    @Override
    public String sleep() {
        return super.sleep();
    }

    @Override
    public String eat() {
        return super.eat();
    }
    public String purr() {
        //you can have a featcher
        return "purrr...";
    }

}
