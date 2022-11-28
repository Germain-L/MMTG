package controle;

public class Germain {
    public String sayHelloTo(String name) {
        return "Hello " + name;
    }

    public String calculate(double weightInKg, int drinks, String name) {
        Person person = new Person(weightInKg, drinks, name);
        int maxDrinks = person.maxDrinks();
        if (drinks > maxDrinks) {
            return "You are dead";
        } else if (drinks == maxDrinks) {
            return "You can have 0 more drinks";
        } else {
            return "You can have " + (maxDrinks - drinks) + " more drinks";
        }
    }
}

