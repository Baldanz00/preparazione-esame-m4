// creare un metodo che mi restituisca in output un triangolo di asterischi rovesciato:
/* ***
 * **
 * *
 */

public class App {
    public static void main(String[] args) {

        System.out.println();

        System.out.println("Giochiamo con i triangoli!");
        System.out.println();

        System.out.println("Triangolo decrescente:");
        stampaTriangolo(4);

        System.out.println();
        System.out.println("Triangolo crescente:");
        stampaTriangolo2(4);

        System.out.println();
        System.out.println("Rettangolo pieno:");
        stampaRettangolo(4);

        System.out.println();
        System.out.println("Triangolo vuoto:");
        stampaTriangoloVuoto(6);

        System.out.println();
        System.out.println("Triangolo vuoto al centro e centrato:");
        stampaTriangoloCentratoVuoto(5);
    }

    public static void stampaTriangolo(int num) { // decrescente e attaccato a sx

        for (int i = 0; i < num; i++) { // primo for: sono le righe. voglio che mi stampi 3 righe
            // num = 3.
            for (int j = i; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void stampaTriangolo2(int num) { // crescente e attaccato a sx

        for (int i = 0; i < num; i++) { // primo for: sono le righe. voglio che mi stampi 3 righe
            // num = 3.
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void stampaTriangoloVuoto(int num) { // triangolo vuoto

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == num) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void stampaTriangoloCentratoVuoto(int num) { // triangolo vuoto e centrato
        // num = 5 // altezza del triangolo
        for (int i = 1; i <= num; i++) {
            // 1️ Spazi iniziali (per centrare)
            for (int j = i; j < num; j++) {
                System.out.print(" ");
            }
            // 2️ Asterischi e spazi interni
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1) || i == num) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void stampaRettangolo(int num) { // rettangolo pieno

        for (int i = 0; i < num; i++) { // primo for: sono le righe. voglio che mi stampi 3 righe
            // num = 3.
            for (int j = 1; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
/*
 * se volessi invece un triangolo normale, con la punta in su, mi basterebbe
 * correggere la riga 19 con:
 * for (int j = 0; j <= i; j++)
 *
 **
 ***
 */

/*
 * per fare un rettangolo in verticale mi basterebbe, nel secondo for cambiare
 * l'inizializzazione con j = 1
 * ***
 * ***
 * ***
 * ***
 */
