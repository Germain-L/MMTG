package controle;

public class Max {

    int rarity = (int) (Math.random() * 100);

    String commonWeapon = "Very common, kinda useless and weak"; // 55%

    String unCommonWeapon = "Not fundable everywhere, mostly usable"; // 30%

    String rareWeapon = "Has a ancient power inside, usefull in fights"; // 10%

    String legendaryWeapon = "It's a legendary one, you should keep it to defeat Demon Lord"; // 5%

    String message;

    public String evaluationRarity(int rarity) {
        if (rarity <= 55) {
            System.out.println(commonWeapon);
            return commonWeapon;
        } else if (rarity > 55 && rarity <= 85) {
            System.out.println(unCommonWeapon);
            return unCommonWeapon;
        } else if (rarity > 85 && rarity <= 95) {
            System.out.println(rareWeapon);
            return rareWeapon;
        } else {
            System.out.println(legendaryWeapon);
            return legendaryWeapon;
        }
    }

    public void sendMessage(String message) {
        this.message = message;
    }

}
