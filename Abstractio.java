abstract class Animal{
    abstract void walk();

    }

class Horse extends Animal{
    public void walk(){
        System.out.println("Walk on 4 legs");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("walk on 2 legs");
    }
}


public class Abstractio {
    public void main(String args[]){
        Horse horse = new Horse();
        horse.walk();


    }
}
