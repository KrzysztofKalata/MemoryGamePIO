package memoryGame;

public class Card {
    private int cardId = 0;
    private int cardValue = 0;
    private boolean isChosen = false;

    public Card() {
        this.cardId = hashCode();
    }

    public Card(int cardValue) {
        this.cardId = hashCode();
        this.cardValue = cardValue;
        this.isChosen = false;
    }

    public int getCardValue() {
        return cardValue;
    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }

    public boolean getChosen() {
        return isChosen;
    }

    public void setChosen(boolean chosen) {
        this.isChosen = chosen;
    }

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

}