package controle;

public class Thomas {

    String message;

    int iv = 45;

    String useless = "This pokemon is useless";

    String low = "This pokemon is weak";

    String medium = "This pokemon is medium";

    String high = "This pokemon is strong";

    String perfect = "This pokemon is perfect";

    public void sendMessage(String message) {
        this.message = message ;
    }

    public String checkIv(int iv) {
        this.iv = iv;
        if (this.iv >= 1 && this.iv =< 25) {
            return low;
        } else if (this.iv >= 26 && this.iv =< 36){
            return medium;
        } else if (this.iv >= 37 && this.iv =< 45){
            return high;
        } else if (this.iv == 0){
            return useless;
        } else if (this.iv == 45){
            return perfect;
        }
    }
}

