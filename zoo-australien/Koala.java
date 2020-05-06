
/**
 * Cette classe décrit un Koala.
 *
 * @author Charles-Meldhine Madi Mnemoi
 * @version (un numéro de version ou une date)
 */

import java.util.Random;

public class Koala extends Herbivore
{
    private int heuresDeSommeil;

    /**
     * Constructeur d'objets de classe Koala
     */
    public Koala(String nom, int poids, int h)
    {
        super(nom, poids);
        heuresDeSommeil = h;
    }

    /**
     * retourne le coût en nourriture par jour d'un koala
     * @return  c   un coût en nourriture par jour incroyable !
     */
    public double coutNourriture()
    {
        Random rand = new Random();
        
        return 1.0+ rand.nextInt(24-heuresDeSommeil)*6.5; //cette formule devrait être correcte
        
    }
    
    public String toString()
    {
        return super.toString() + " un koala qui dort au maximum "+heuresDeSommeil+ " par jour";
    }
}
