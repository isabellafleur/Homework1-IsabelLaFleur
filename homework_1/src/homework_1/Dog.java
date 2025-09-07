package homework_1;

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.print("woof! I am a dog!");
    }

    @Override
    String getName() {
        return "Dog"; 
    }
}

