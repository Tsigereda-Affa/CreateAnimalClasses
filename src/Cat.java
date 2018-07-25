/*
 * All Cats are Animals but all Animals are not Cats
 *
 */
public class Cat extends Animal {
////extends shows Inheritance which is  this class uses the frame work from the parent class and change it with the class out put using override
    public Cat() {
        super();
        //
        System.out.println("Now I am a Cat!");
    }

    @Override
    public String sleep() {
    //The authority it is give to access by using the access modifier this is called the encapsulation
        return "A cat sleeps...";
    }

    @Override
    public String eat() {
        return "A cat eats...";
    }

    public String purr() {
        // This method is excuting polymorphism adding of its own char
        return "purrr...";
    }

}


