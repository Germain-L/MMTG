package controle;

public class Thomas {

    String message;

    int iv = 45;

    String low = "This pokemon is weak";

    String medium = "This pokemon is medium";

    String high = "This pokemon is strong";

    String perfet = "This pokemon is perfect";

    public void sendMessage(String message) {
        this.message = message ;
    }

    public void checkIv(int iv) {
        this.iv = iv;
        if (this.iv < 25) {
            System.out.println(low);
        } else if (this.iv < 36){
            System.out.println(medium);
        } else if (this.iv < 45){
            System.out.println(high);
        } else {
            System.out.println(perfet);
        }
    }
}

