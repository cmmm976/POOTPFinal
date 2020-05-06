
/**
 * Cette classe décrit un herbivore.
 *
 * @author  Charles-Meldhine Madi Mnemoi
 * @version 
 */
public abstract class Herbivore extends Animal
{
    public Herbivore(String nom, double poids)
    {
        super(nom,poids);
    }

    public double coutNourriture(){
        return 5;
    }
}
