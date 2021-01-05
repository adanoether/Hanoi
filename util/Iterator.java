package util;
import java.util.EmptyStackException;

/**
 * Classe représentant l'itérateur sur le maillon.
 *
 * @author Canton Dylan, Ohan Mélodie
 * @version 1.0
 */

public class Iterator {

    private ChainLink current; //Itérateur sur ce maillon

    /**
     * Constructeur
     * @param current Il s'agira de la valeur sur laquelle l'itérateur "indexe"
     */
    Iterator(ChainLink current){
        this.current = current;
    }

    /**
     * Indique s'il existe un maillon suivant.
     * @return true Si le maillon courrant n'est pas null
     */
    public Boolean hasNext(){
        return (current != null);
    }

    /**
     * Retourne la donnée du maillon courant
     * @return l'objet du maillon
     * @throws NullPointerException depuis la classe ChainLink.
     * @see ChainLink
     */
    public Object getData(){
        return current.getDisk();
    }

    /**
     * Décale l'itérateur au suivant.
     * @throws EmptyStackException si le maillon suivant est vide.
     * @since 1.0
     */
    public void next(){
        if(!this.hasNext())
            throw new EmptyStackException();
        current = current.getNext();
    }
}