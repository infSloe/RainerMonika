
/**
 * Die Klasse Bankkonto
 */
public class Bankkonto
{
    // Attribute
    private int kontostand = 50;

    // Methoden
    public int getKontostand()
    {
        return kontostand;
    }

    public void abbuchen(int betrag)
    {
        kontostand = kontostand - betrag;
    }
}
