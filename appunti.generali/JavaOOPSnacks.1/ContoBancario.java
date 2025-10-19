
/***
 * Snack 2: Gestione di un Conto**
 * Crea una classe ContoBancario con attributi per numero di conto e saldo.
 * Implementa un costruttore che accetta il numero di conto e inizializza il
 * saldo a zero.
 * Aggiungi metodi pubblici per depositare denaro sul conto, prelevare denaro
 * dal conto e ottenere il saldo corrente.
 */
public class ContoBancario {
    private String IBAN;
    private double saldo;

    public ContoBancario(String IBAN) {
        this.IBAN = IBAN;
        this.saldo = 0;
    }

    public void preleva(double importo) {
        if (importo > saldo) {
            System.out.println("Saldo non sufficente per l'importo selezionato.");
        } else {
            saldo -= importo;
        }
    }

    public void deposito(double importo) {
        if (importo <= 0) {
            System.out.println("Non è possibile depositare un importo negativo o uguale a 0");
        } else {
            saldo += importo;
        }
    }

    public static void main(String[] args) {
        ContoBancario c1 = new ContoBancario("IT568920000004563");
        c1.saldo = 2000;
        System.out.println("Saldo corrente: " + c1.saldo + "€");
        c1.preleva(200);

        System.out.println("Saldo corrente dopo il prelievo: " + c1.saldo + "€");

        c1.deposito(400);
        System.out.println("Saldo corrente dopo il deposito: " + c1.saldo + "€");
    }
}
