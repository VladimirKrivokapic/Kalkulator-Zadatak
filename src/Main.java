// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        KalkulatorOperacije kalkulatorOperacije = new KalkulatorOperacije();
        kalkulatorOperacije.operand1 = 10;
        kalkulatorOperacije.operand2 = 5;
        kalkulatorOperacije.add();

        KalkulatorOperacije kalkulatorOperacije1 = new KalkulatorOperacije();
        kalkulatorOperacije1.operand1 = 10;
        kalkulatorOperacije1.operand2 = 5;
        kalkulatorOperacije1.sub();

        KalkulatorOperacije kalkulatorOperacije2 = new KalkulatorOperacije();
        kalkulatorOperacije2.operand1 = 10;
        kalkulatorOperacije2.operand2 = 5;
        kalkulatorOperacije2.mul();

        KalkulatorOperacije kalkulatorOperacije3 = new KalkulatorOperacije(10,5);
        kalkulatorOperacije3.div();



    }
}