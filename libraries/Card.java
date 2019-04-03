package main;

public class Card {
    private int id_card = 0;
    private boolean is_chosen = false;
    private int personal_id = 0;

    public Card() {
        this.personal_id = hashCode();
    }
    public Card(int id_card) {
        this.id_card = id_card;
        this.is_chosen = false;
        this.personal_id = hashCode();
    }

    public int getId_card() {
        return id_card;
    }

    public boolean getIs_chosen() {
        return is_chosen;
    }

    public int getPersonal_id() {
        return personal_id;
    }

    public void setId_card(int id_card) {
        this.id_card = id_card;
    }

    public void setIs_chosen(boolean is_chosen) {
        this.is_chosen = is_chosen;
    }

    public void setPersonal_id(int personal_id) {
        this.personal_id = personal_id;
    }

}
