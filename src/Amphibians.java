public class Amphibians extends Animals {

   private   String livingEnvironment;

   public Amphibians(String name, int age, String livingEnvironment) {
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

   public void hunt(){

   }
   @Override
   public void eat() {
      System.out.println("Питаются насекомыми и беспозвоночными");
   }

   @Override
   public void sleep() {
      System.out.println("Спят 20 часов в сутки");
   }

   @Override
   public void go() {
      System.out.println("Гуляют 4 часа в сутки");
   }

   @Override
   public String toString() {
      return "Amphibians{" +
              "livingEnvironment='" + livingEnvironment + '\'' +
              ", name='" + name + '\'' +
              ", birthYear=" + birthYear +
              '}';
   }
}