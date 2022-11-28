package controle;

public class Max {

    int rarity = (int) (Math.random() * 100);

    String commonWeapon = "Very common, kinda useless and weak"; // 55%

    String unCommonWeapon = "Not fundable everywhere, mostly usable"; // 30%

    String rareWeapon = "Has a ancient power inside, usefull in fights"; // 10%

    String legendaryWeapon = "It's a legendary one, you should keep it to defeat Demon Lord"; // 5%

    String message;

    public void evaluationRarity() {
        if (rarity <= 55) {
            System.out.println(commonWeapon);
        }
        if (rarity <= 85) {
            System.out.println(unCommonWeapon);
        }
        if (rarity <= 95) {
            System.out.println(rareWeapon);
        }
        if (rarity < 100) {
            System.out.println(legendaryWeapon);
        }
    }

    public void sendMessage(String message) {
        this.message = message;
    }

}
