public abstract class Birds extends Animals  {

    protected  String livingEnvironment;

    public Birds(String name, int age, String livingEnvironment) {
        super(name, age);
        setLivingEnvironment(livingEnvironment);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment != null || !livingEnvironment.isEmpty() || !livingEnvironment.isBlank()) {
            this.livingEnvironment = livingEnvironment;
        }
    }

    @Override
    public abstract void eat();

    @Override
    public abstract void sleep();

    @Override
    public abstract void go() ;

    public abstract void hunt();

    @Override
    public String toString() {
        return "Birds{" +
                "livingEnvironment='" + livingEnvironment + '\'' +
                ", name='" + name + '\'' +
                ", birthYear=" + birthYear +
                "} " + super.toString();
    }
}
