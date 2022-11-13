import java.time.LocalDate;
import java.util.Objects;

public abstract class Animals {
    protected String name;
    protected int birthYear;


    public Animals(String name, int age ) {
         setName(name);
        if (age >= 0) {
            this.birthYear = LocalDate.now().getYear() - age;
        } else {
            this.birthYear = LocalDate.now().getYear() - Math.abs(age);
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null || !name.isEmpty() || !name.isBlank()) {
            this.name = name;
        }
    }

    public int getAge() {
        return LocalDate.now().getYear() - birthYear;
    }
    public abstract void eat();
    public abstract void sleep();
    public abstract void go();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return birthYear == animals.birthYear && Objects.equals(name, animals.name);
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthYear);


    }
}


