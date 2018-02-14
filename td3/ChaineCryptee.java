
/**
 * Décrivez votre classe ChaineCryptee ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class ChaineCryptee
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    int decalage;
    String en_clair;

    /**
     * Constructeur d'objets de classe ChaineCryptee
     */
    /*public ChaineCryptee()
    {
        this.en_clair="AA AA A A";
        decalage=3;
      
    }*/
    public String crypte()
    {
        String ChaineCryptee="";
        int i;
        if(this.en_clair!=null)
        {
        for(i=0;i<this.en_clair.length();i++)
        {
        ChaineCryptee=ChaineCryptee+decaleCaractere(this.en_clair.charAt(i),this.decalage);
        }
        return ChaineCryptee;
        }
        else return "Erreur";
    }    
    
    public String decrypte()
    {
        String res="";
        if(crypte==null)return null;
        
        return en_clair;
    }
    
    private static char decaleCaractere(char c, int decalage)
    {
    return (c < 'A' || c > 'Z')? c : (char)(Math.floorMod((c - 'A' + decalage),26) + 'A');
    }
    
    
    }

   
