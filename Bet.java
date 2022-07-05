package Lesson10;

public class Bet {
    public static void main(String[] args) {
        Bed man = new Bed("Sport", 3);
    }
}

class Bed {
    private String bet;
    private int risk;

    public Bed(String Bet, int risk) {
        System.out.println("Bet - " + bet + "; risk -" + risk);
        this.bet = bet;
        this.risk = risk;
    }

    public void setName(String bet) {
        this.bet = bet;
    }

    public void setAge(int risk) {
        this.risk = risk;
    }

}


