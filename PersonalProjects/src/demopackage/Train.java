package demopackage;

/**
 * @author kirankumarn on 28/10/21
 * Creating a class and its object and
 * methods() for practice of Syntax
 */

public class Train {

    public static void main(String[] args) {
        Train train = new Train();
        train.engine();
        train.sleeperCoach();
        train.seaterCoach();
        train.luggageCoach();
    }

    public String sleeperCoach() {
        return "Sleeper Coach";
    }

    public String seaterCoach() {
        return "Seater Coach";
    }

    public String luggageCoach() {
        return "Luggage Coach";
    }

    public String engine() {
        return "Engine";
    }

}
