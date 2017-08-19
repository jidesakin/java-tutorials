/**
 * The Dog class creates a blue print for all kinds dogs stating their traits and behaviours to explain Java OOP concepts
 */
public class Dog {

    public Dog() {

    }

    public Dog(String name) {
        this.name = name;
    }


    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog( "Tommy") ;
    }
    
    /**
     * Declare the states/attributes
     */
    String breed;
    int age;
    String name;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    void barking() {

    }

    void sleeping() {

    }

    void eating() {

    }

}