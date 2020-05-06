import java.util.ArrayList;

/**
 * Cette classe décrit un zoo.
 *
 * @author Charles-Meldhine Madi Mnemoi
 * @version 
 */
public class Zoo
{
    private String nom; // nom du zoo
    private ArrayList<Animal> animals; // liste des animaux du zoo
    private int capaciteMax; // capacité maximal d'accueil dans le zoo

    /**
     * Nouveau zoo
     * @param nom le nom du zoo
     */
    public Zoo(String nom)
    {
        this(nom,100);
        animals = new ArrayList<Animal>();
    }

    /**
     * Nouveau zoo
     * @param nom le nom du zoo
     * @param c la caapcité maximale d'accueil
     */
    public Zoo(String nom, int c)
    {
        this.nom = nom;
        capaciteMax = c;
        animals = new ArrayList<Animal>();
    }

    /**
     * Calculer le nombre d'animaux présents dans le zoo
     * @return     le nombre d'animaux dans le zoo
     */
    public int nbAnimaux()
    {
        return animals.size();
    }

    /**
     * Ajouter un animal dans le zoo si la capacité max n'est pas atteinte
     * @param a l'animal à ajouter au zoo
     */
    public void ajoutAnimal(Animal a){
        if(animals.size()<capaciteMax)
        {
            if(a!= null)
            {
                animals.add(a);
            }
            //je ne trouvais l'utilisation des exceptions pertinente (ou en tout cas, intuitive et efficace) ici 
            //que faire dans le catch si l'on a attrapé une NullPointerException ? 
            ///tester directement la non nullité de l'objet pour décider de continuer/exécuter la méthode me semble plus adapté)
        }
    }

    /**
     * Supprimer le premier animal dans le zoo en fonction de son nom
     * @param nom de l'animal à  supprimer
     */
    public void supprimeAnimal(String nom){
        Animal a = null; //animal à supprimer
        int i = 0; //index de l'animal à supprimer
        
        do{
            a = animals.get(i);
            ++i;
        }while(a.getNom() != nom || i >= nbAnimaux());
        
        animals.remove(i);
    }

    /**
     * Calculer le coût total de la nourriture nécessaire pour les animaux
     * @return le coût total 
     */
    public double coutTotal() {
        double c = 0; //coût à renvoyer
        for(Animal a : animals)
        {
            c += a.coutNourriture();
        }
        return c;
    }

    /**
     * Afficher les informations sur le zoo
     */
    public void printDetails() {
        if(nbAnimaux() > 0)
        {
            System.out.println("Le zoo "+nom+" ("+ capaciteMax+" animaux maximum) acceuille :");
            for(Animal a : animals)
            {
                System.out.println(a.toString());
            }
            System.out.println("La nourriture coûte "+coutTotal()+" euros par jour.");
        }
        else
        {
            System.out.println("Aucun animal dans le zoo "+nom);
        }
    }

    /**
     * Fonction de test
     */
    public static void main(String[] args) {
        System.out.println("##-------------------------------------------##");
        System.out.println("##----------------   CAS 1   ----------------##");
        Zoo z = new Zoo("Healsvile", 20);
        z.ajoutAnimal(new Kangourou("Skippy", 75));
        z.ajoutAnimal(new Ornithorynque("Platypus", 6.5));
        z.ajoutAnimal(new Koala("Buster", 6, 18));
        z.printDetails();
        System.out.println("##-------------------------------------------##");
        System.out.println("");
        System.out.println("");

        System.out.println("##-------------------------------------------##");
        System.out.println("##----------------   CAS 2   ----------------##");
        Zoo zempty = new Zoo("Empty");
        zempty.printDetails();
        System.out.println("##-------------------------------------------##");
        System.out.println("");
        System.out.println("");

        System.out.println("##-------------------------------------------##");
        System.out.println("##----------------   CAS 3   ----------------##");
        Zoo znull = new Zoo("Null");
        Kangourou kou = null;
        znull.ajoutAnimal(kou);
        znull.ajoutAnimal(new Kangourou("Skippy", 75));
        znull.printDetails();
        System.out.println("##-------------------------------------------##");
        System.out.println("");
        System.out.println("");
    }

}
