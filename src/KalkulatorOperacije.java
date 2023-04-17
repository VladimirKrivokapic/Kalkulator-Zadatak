public class KalkulatorOperacije {

    //prvo kreiramo polja klase
    double operand1;
    double operand2;


    // Kreiramo konstruktor

    public KalkulatorOperacije() {

    }

    public KalkulatorOperacije(double operand1, double operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;

    }


    //metode - funkcije
    public void add() {
        System.out.println("Zbir dva operanda ce biti : " + (operand1 + operand2));
    }

    public void sub() {
        System.out.println("Razlika dva operanda ce biti : " + (operand1 - operand2));
    }

    public void mul() {
        System.out.println("Mnozenje dva operanda ce biti : " + (operand1 * operand2));
    }

    public void div() {
        if (operand2 == 0) {
            System.out.println("Ne mozete deliti sa 0");
        } else {
            System.out.println("Deljenje dva operanda : " + (operand1 / operand2));
        }
    }
}
