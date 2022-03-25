import java.io.*;

class Main {

    public static void main(String[] args) {
        Card cardOne = new Card("trefl", 4);
        Card cardTwo = new Card("pik", 11);
        Card cardThree = new Card("some made up color", 321321);

        System.out.println(cardOne.getValue() + " " + cardOne.getColor());
        System.out.println(cardTwo.getValue() + " " + cardTwo.getColor());
        System.out.println(cardThree.getValue() + " " + cardThree.getColor());
    }
}

enum COLOR {
    CLUBS, DIAMONDS, HEARTS, SPADES;
}

class Card {
    private String color;
    private String value;

    public Card(String color, int value) {
        this.setColor(color);
        this.setValue(value);
    }

    public void setValue(int value) {
        if (value >= 2 && value <= 15) {
            if (value <= 10) {
                this.value = Integer.toString(value);
            } else {
                switch (value) {
                    case 11:
                        this.value = "W";
                        break;
                    case 12:
                        this.value = "Q";
                        break;
                    case 13:
                        this.value = "K";
                        break;
                    case 14:
                        this.value = "J";
                        break;
                    default:
                        this.value = "Invalid value";
                        break;
                }
            }
        } else {
            this.value = "Invalid value";
        }
    }

    public void setColor(String color) {
        switch (color) {
            case "trefl":
                this.color = COLOR.CLUBS.toString();
                break;
            case "karo":
                this.color = COLOR.DIAMONDS.toString();
                break;
            case "kier":
                this.color = COLOR.HEARTS.toString();
                break;
            case "pik":
                this.color = COLOR.SPADES.toString();
                break;
            default:
                this.color = "Invalid color";
        }
    }

    public String getColor() {
        return color;
    }

    public String getValue() {
        return value;
    }
}
