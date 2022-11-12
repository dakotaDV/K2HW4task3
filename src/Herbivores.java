public class Herbivores extends Mammals {
    private String typeFood;

    public Herbivores(String name, int age, double speed, String livingEnvironment, String typeFood) {
        super(name, age, speed, livingEnvironment);
        setTypeFood(typeFood);
    }

    public String getTypeFood() {
        return typeFood;
    }

    public void setTypeFood(String typeFood) {
        if (typeFood != null || !typeFood.isEmpty() || !typeFood.isBlank()) {
            this.typeFood = typeFood;
        }
    }


    public void graze(){

    }

    @Override
    public void eat() {
        System.out.println("Едят растительную пищу");
    }

    @Override
    public void sleep() {
        System.out.println("Спят 12 часов в сутки");
    }

    @Override
    public void go() {
        System.out.println("Гуляют 12 часов в сутки ");
    }

    @Override
    public String toString() {
        return "Herbivores{" +
                "typeFood='" + typeFood + '\'' +
                ", speed=" + speed +
                ", livingEnvironment='" + livingEnvironment + '\'' +
                ", name='" + name + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}
