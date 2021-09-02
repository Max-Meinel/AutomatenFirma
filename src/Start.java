import java.util.Scanner;

public class Start {

    static Scanner scanner = new Scanner(System.in);
    static Firma f1 = new Firma();

    public static void main(String[] args) {
        String input;
        do {
            System.out.println("[F]irma eingeben\n[A]utomat eingeben\n[D]aten anzeigen\n[B]eenden");
            input = scanner.next();

            if(input.equalsIgnoreCase("f")) {
                FirmaEingeben();
            }
            if(input.equalsIgnoreCase("a")) {
                AutomatEingeben();
            }
            if(input.equalsIgnoreCase("d")) {
                DatenAnzeigen();
            }

        }while (!input.equalsIgnoreCase("b"));
    }

    private static void FirmaEingeben() {
        System.out.print("Name der Firma: ");
        f1.setName(scanner.next());
    }

    private static void AutomatEingeben() {
        Automat a1 = new Automat(f1);
        f1.setMeineAutomaten(a1);

        System.out.print("Typ des Automaten: ");
        a1.setTyp(scanner.next());

        System.out.print("Kassenstand in €: ");
        a1.setKassenstand(scanner.nextDouble());
    }

    private static void DatenAnzeigen() {
        System.out.println("Name der Firma: " + f1.getName() + "\n");
        System.out.println("Zugehörige Automaten:");

        for (int i = 0; i < f1.getMeineAutomatenSize(); i++) {
            System.out.println("Typ: " + f1.getMeineAutomaten(i).getTyp());
            System.out.println("Kassenstand: " + f1.getMeineAutomaten(i).getKassenstand() + "€");
        }
    }
}
