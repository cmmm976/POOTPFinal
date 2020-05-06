
/**
 * Cette classe décrit un dingo (et élargit ma culture, merci !).
 *
 * @author Charles-Meldhine Madi Mnemoi
 * @version 
 */
public class Dingo extends Carnivore
{
    /**
     * Constructeur d'objets de classe Dingo
     */
    public Dingo(String nom, double poids)
    {
        super(nom, poids);
    }

    /**
     * renvoit des informations sur notre dingo
     * @return  s   une chaîne de caractères très utile !
     */
    public String toString()
    {
        return super.toString() + "un dingo";
        //Je note ici qu'on aurait pu utiliser la méthode getClass().getName() dans la classe animal 
        //pour obtenir le même resultat (à une majuscule près, si on tient à respecter la convention du nommage de classes)
        //sans duplication de code
    }
    
}
