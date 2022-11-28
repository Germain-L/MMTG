package controle;

public class Person {
    double weightInKg;
    int drinks;
    String name;

    public Person(double weight, int drinks, String name) {
        this.weightInKg = weight;
        this.drinks = drinks;
        this.name = name;
    }

    // use Blood Alcohol Concentration (BAC) to determine how many more drinks a person can have
    // https://www.niaaa.nih.gov/alcohol-health/overview-alcohol-consumption/alcohol-facts-and-statistics
    public int maxDrinks() {
        double maxDrinks = 0;
        if (weightInKg < 60) {
            maxDrinks = 0.6;
        } else if (weightInKg < 80) {
            maxDrinks = 0.8;
        } else {
            maxDrinks = 1;
        }
        return (int) (maxDrinks * 10);
    }
}
