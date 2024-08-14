public class Bill {
    public static final double COUVERT = 4.0;
    private char gender;
    private int beer;
    private int barbecue;
    private int softDrink;

    public Bill(char gender, int beer, int softDrink, int barbecue) {
        this.gender = gender;
        this.beer = beer;
        this.barbecue = barbecue;
        this.softDrink = softDrink;
    }

    public double feeding(){
        return beer * 5 + barbecue * 7 + softDrink * 3;
    }

    public double ticket(){
        if (gender == 'M'){
            return 10.0;
        }

        return 8.0;
    }

    public double cover(){
        if (feeding() > 30.0){
            return 0.0;
        }

        return COUVERT;
    }

    public double total(){
        return feeding() + cover() + ticket();
    }
}
