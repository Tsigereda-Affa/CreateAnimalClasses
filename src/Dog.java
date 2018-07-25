public class Dog extends Animal{
    //extends shows Inheritance which is  this class uses the frame work from the parent class and change it with the class out put using override
    public Dog () {
        super();
        System.out.println("Now I am a Dog!");
//The authority it is give to access by using the access modifier this is called the encapsulation
    }
    @Override
    public String sleep() {
        return "A Dog sleeps...";
    }
    @Override
    public String eat() {
        return "A Dog eats...";
    }
    // This method is excuting polymorphism adding of its own char
    public String makeSound() {
        return "A Dog barks...";
    }
}

