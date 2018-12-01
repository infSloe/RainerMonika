
/**
 * Die Klasse Aufgabe
 */
public class Aufgabe implements Runnable
{
    // Attribute
    private String name;
    private Bankkonto konto;
    // Konstruktor
    public Aufgabe()
    {
        konto = new Bankkonto();
    }

    // Methoden
    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            abhebungMachen(10);
            if (konto.getKontostand() < 0)
            {
                System.out.println("Überzogen!");
            }

        }
    }

    private void abhebungMachen(int betrag)
    {
        String name = Thread.currentThread().getName();
        if (konto.getKontostand() >= betrag)
        {
            System.out.println(name + " sieht den Kontostand: " + konto.getKontostand()+ " €");
            System.out.println("und ist dabei 10 € abzuheben.");
            try {
                System.out.println(name + " schläft ein!");
                Thread.sleep(500);
            } catch(InterruptedException ex)
            {}
            System.out.println(name + " ist aufgewacht.");
            konto.abbuchen(betrag);
            System.out.println(name + " führt die Abhebung zu Ende.");
        }
        else 
        {
            System.out.println("Leider nicht genug Geld für " + name);
        }
    }
}

