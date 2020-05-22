package Cookies;

public class CookieOrder {

    private int numBoxes;
    private String variety;

    //Two Pieces of Data
    public CookieOrder(String localVariety, int localNumBoxes) {
        this.numBoxes = localNumBoxes;
        this.variety = localVariety;
    }
    //Accessor Method
    public int getNumBoxes() {
        return numBoxes;
    }
    //Accessor Method
    public String getVariety() {
        return this.variety;
    }
}
