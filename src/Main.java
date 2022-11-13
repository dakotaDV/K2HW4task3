public class Main {
    public static void main(String[] args) {

        Herbivores gazelle = new Herbivores("Газель", 2019, 50, "Тропические степи", "Растительная пища");
        Herbivores giraffe = new Herbivores("Жираф", 2020, 55, "Тропические степи", "Растительная пища");
        Herbivores horse = new Herbivores("Лошадь", 2021, 60, "Степь", "Растительная пища");

        Predator hyena = new Predator("Гиена", 2018, 60, "Открытые пустынные пространства", "Мясо");
        Predator tiger = new Predator("Тигр", 2019, 65, "влажные тропические леса, мангровые болота и бамбуковые чащи в тропиках, сухие саванны, полупустыни", "мясо");
        Predator bear = new Predator("Медведь", 2016, 50, "от степей до высокогорий, от лесов до арктических льдов", "мясо");

        Amphibians frog = new Amphibians("Лягушка", 2022, "Пресноводные водоемы");
        Amphibians snake = new Amphibians("Уж пресноводный", 2021, "Пресноводные водоемы");

        FlightlessBirds peacock = new FlightlessBirds("Павлин", 2018, "Джунгли", " Наземный образ жизни");
        FlightlessBirds penguin = new FlightlessBirds("Пингвин", 2018, "Прибрежные воды", "Наземный образ жизни");
        FlightlessBirds dodoBird = new FlightlessBirds("Птица додо", 2015, "Сухие леса", "Наземный образ жизни");

        FlyingBirds seagull = new FlyingBirds("Чайка", 2017, "море, некоторые виды обитаю возле пресных водоемов и рек", "умеет летать");
        FlyingBirds albatross = new FlyingBirds("Альбатросс", 2015, "океан, море", "умеют летать");
        FlyingBirds falcon = new FlyingBirds("Сокол", 2014, "Скалы", "Умеют летать");

        System.out.println(gazelle.equals(giraffe));
        System.out.println(hyena.equals(tiger));
        System.out.println(frog.equals(snake));
        System.out.println(peacock.equals(penguin));
        System.out.println(seagull.equals(albatross));


            System.out.println(gazelle);
            System.out.println(giraffe);
            System.out.println(horse);
            System.out.println(hyena);
            System.out.println(tiger);
            System.out.println(bear);
            System.out.println(frog);
            System.out.println(snake);
            System.out.println(peacock);
            System.out.println(penguin);
            System.out.println(dodoBird);
            System.out.println(seagull);
            System.out.println(albatross);
            System.out.println(falcon);

    }
}