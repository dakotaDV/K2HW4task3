public class Main {
    public static void main(String[] args) {

        Herbivores gazelle = new Herbivores("Газель", 4, 50, "Тропические степи", "Растительная пища");
        Herbivores giraffe = new Herbivores("Жираф", 5, 55, "Тропические степи", "Растительная пища");
        Herbivores horse = new Herbivores("Лошадь", 3, 60, "Степь", "Растительная пища");

        Predator hyena = new Predator("Гиена", 6, 60, "Открытые пустынные пространства", "Мясо");
        Predator tiger = new Predator("Тигр", 7, 65, "влажные тропические леса, мангровые болота и бамбуковые чащи в тропиках, сухие саванны, полупустыни", "мясо");
        Predator bear = new Predator("Медведь", 9, 50, "от степей до высокогорий, от лесов до арктических льдов", "мясо");

        Amphibians frog = new Amphibians("Лягушка", 1, "Пресноводные водоемы");
        Amphibians snake = new Amphibians("Уж пресноводный", 2, "Пресноводные водоемы");

        FlightlessBirds peacock = new FlightlessBirds("Павлин", 3, "Джунгли", " Наземный образ жизни");
        FlightlessBirds penguin = new FlightlessBirds("Пингвин", 5, "Прибрежные воды", "Наземный образ жизни");
        FlightlessBirds dodoBird = new FlightlessBirds("Птица додо", 6, "Сухие леса", "Наземный образ жизни");

        FlyingBirds seagull = new FlyingBirds("Чайка", 5, "море, некоторые виды обитаю возле пресных водоемов и рек", "умеет летать");
        FlyingBirds albatross = new FlyingBirds("Альбатросс", 7, "океан, море", "умеют летать");
        FlyingBirds falcon = new FlyingBirds("Сокол", 5, "Скалы", "Умеют летать");

        System.out.println(gazelle.equals(giraffe));
        System.out.println(hyena.equals(tiger));
        System.out.println(frog.equals(snake));
        System.out.println(peacock.equals(penguin));
        System.out.println(seagull.equals(albatross));



    }
}