public class Predator extends Mammals {
    private String typeFood;

    public Predator(String name, int age, double speed, String livingEnvironment, String typeFood) {
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
    public void hunt(){
        System.out.println("Охотятся на добычу");
    }

    @Override
    public void eat(){
        System.out.println("Едят мясо");
    }


    @Override
    public void sleep() {
        System.out.println("Спят 12 часов");
    }

    @Override
    public void go() {
        System.out.println("Гуляют");
    }

    @Override
    public String toString() {
        return "Predator{" +
                "typeFood='" + typeFood + '\'' +
                ", speed=" + speed +
                ", livingEnvironment='" + livingEnvironment + '\'' +
                ", name='" + name + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}
