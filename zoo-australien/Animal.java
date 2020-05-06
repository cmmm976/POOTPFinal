
/**
 * Cette classe décrit un animal générique. ELle ne peut être instanciée.
 *
 * @author  Charles-Meldhine Madi Mnemoi
 * @version 19/12/2019
 */
public abstract class Animal
{
    private String nom;
    private double poids;

    /**
     * Constructeurs d'objets Animal, prend son nom et son poids en arguments
     */
    public Animal(String nom, double poids)
    {
        this.nom = nom;
        this.poids = poids;
    }

    /**
     * accesseur du nom de l'animal
     * @return  nom     le nom de l'animal
     */
    public String getNom()
    {
        return nom;
    }
    
     /**
     * accesseur du poids de l'animal
     * @return  poids    le poids de l'animal
     */
    public double getPoids()
    {
        return poids;
    }
    
    public String toString()
    {
        return nom + " ("+poids+" kg)";
    }
    
    abstract public double coutNourriture();
}
