class Animal {
    public void displayInfo() {
        System.out.println("I am an animal.");
    }
}

class Dog extends Animal {
    //Subclass method can be protected, public but not private
    public void displayInfo() {
        //super.displayInfo();
        System.out.println("I am a dog.");
    }
}

class MainClass {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.displayInfo();
    }
}