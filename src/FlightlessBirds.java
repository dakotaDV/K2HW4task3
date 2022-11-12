public class FlightlessBirds extends Birds{
   private String typeMovement;

    public FlightlessBirds(String name, int age, String livingEnvironment, String typeMovement) {
        super(name, age, livingEnvironment);
        setTypeMovement(typeMovement);
    }

    public String getTypeMovement() {
        return typeMovement;
    }

    public void setTypeMovement(String typeMovement) {
        if (typeMovement != null || !typeMovement.isEmpty() || !typeMovement.isBlank()) {
            this.typeMovement = typeMovement;
        }
    }
    public void walk(){
        System.out.println("Гуляют 20 часов в сутки");
   }

    @Override
    public void eat() {
        System.out.println("Едят насекомых");
    }

    @Override
    public void sleep() {
        System.out.println("Спят 3 часа в сутки");
    }

    @Override
    public void go() {
        System.out.println("Перемещаются с помощью лап");
    }

    @Override
    public void hunt() {
        System.out.println("Охотяться на насекомых и беспозвоночных, на рыбу");

    }

    @Override
    public String toString() {
        return "FlightlessBirds{" +
                "typeMovement='" + typeMovement + '\'' +
                ", livingEnvironment='" + livingEnvironment + '\'' +
                ", name='" + name + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}
