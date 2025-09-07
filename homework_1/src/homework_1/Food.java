package homework_1;

public final class Food extends Animal {
    private final String name;
    private final int calories;

    public Food(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    void makeSound() {
        System.out.println("Food doesn't make a sound!");
    }

    public int getCalories() {
        return calories;
    }
}

