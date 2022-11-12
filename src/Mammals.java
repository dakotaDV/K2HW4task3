public abstract class Mammals  extends Animals {

    protected double speed;
    protected  String livingEnvironment;

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        if (speed <=0) {
            this.speed = 1;
        }else{
            this.speed = speed;
        }
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment != null || !livingEnvironment.isEmpty() || !livingEnvironment.isBlank()) {
            this.livingEnvironment = livingEnvironment;
        }
    }
    public Mammals(String name, int age, double speed, String livingEnvironment) {
        super(name, age);
        setSpeed(speed);
        setLivingEnvironment(livingEnvironment);
    }

    public void walk(){
        System.out.println("Гуляют");
    }

    @Override
    public abstract void eat();

    @Override
    public abstract void sleep();

    @Override
    public abstract void go();

}
