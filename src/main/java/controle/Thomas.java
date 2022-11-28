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

    public String checkIv(int iv) {
        this.iv = iv;
        if (this.iv < 25) {
            return low;
        } else if (this.iv < 36){
            return medium;
        } else if (this.iv < 45){
            return high;
        } else {
            return perfect;
        }
    }
}

