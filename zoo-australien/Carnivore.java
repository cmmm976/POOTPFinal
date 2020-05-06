
/**
 * Cette classe décrit un animal carnivore.
 *
 * @author  Charles-Meldhine Madi Mnemoi
 * @version 
 */
public abstract class Carnivore extends Animal
{
    public Carnivore(String nom, double poids)
    {
        super(nom,poids);
    }

    public double coutNourriture(){
        return 0.2*getPoids()*10;
    }
}
