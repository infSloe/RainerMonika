
/**
 * Die Klasse ZweiThreads
 */
public class RainerUndMonika
{
    // Attribute

    // Methoden
    public void los()
    {

        Aufgabe aufgabe = new Aufgabe();

        Thread t1 = new Thread(aufgabe);
        Thread t2 = new Thread(aufgabe);
        t1.setName("Monika");
        t2.setName("Rainer");
        t1.start();
        t2.start();
    }

}
