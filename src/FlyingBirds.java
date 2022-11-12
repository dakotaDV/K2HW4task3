public class FlyingBirds extends Birds{
    private String typeMovement;

    public FlyingBirds(String name, int age, String livingEnvironment, String typeMovement) {
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
    public void fly(){
        System.out.println("Умеют летать");
    }

    @Override
    public void eat() {
        System.out.println("Едят насекомых и беспозвоночных");
    }

    @Override
    public void sleep() {
        System.out.println("Спят 5 часов в сутки");
    }

    @Override
    public void go() {
        System.out.println("Передвигаются с помощью крыльев");
    }

    @Override
    public void hunt() {
        System.out.println("Охотяться на рыбу, пернатую дичь");
    }

    @Override
    public String toString() {
        return "FlyingBirds{" +
                "typeMovement='" + typeMovement + '\'' +
                ", livingEnvironment='" + livingEnvironment + '\'' +
                ", name='" + name + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}


