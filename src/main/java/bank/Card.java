package bank;

public class Card {
    //    константа
    private final String CARD_NUMBER;
    private String pinCode;

    public Card() {
        CARD_NUMBER = generateCardNumber(16);
        pinCode = generateCardNumber(4);
    }

    private int generatePinCode(int min, int max) {
        max -= min;
        return(int) (Math.random() * ++max) + min;

    }

    private String generateCardNumber(int length) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < length; i++) {
            builder.append(generatePinCode(0,9));
        }
        return builder.toString();
    }
    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getCARD_NUMBER() {
        return CARD_NUMBER;
    }

    public String getPinCode() {
        return pinCode;
    }
}


