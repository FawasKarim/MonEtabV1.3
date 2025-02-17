package models;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Classe représentant un élève.
 * Elle hérite de la classe models.Personne et implémente l'interface dao.ICRUDEleve.
 */
public class Eleve extends Personne  {
    private String classe;
    private String matricule;

    /**
     * Constructeur par défaut de la classe models.Eleve.
     */
    public Eleve() {
    }

    /**
     * Constructeur avec paramètres.
     *
     * @param id            Identifiant de l'élève.
     * @param dateNaissance Date de naissance de l'élève.
     * @param ville         Ville de résidence.
     * @param nom           Nom de l'élève.
     * @param prenom        Prénom de l'élève.
     * @param classe        Classe de l'élève.
     * @param matricule     Matricule de l'élève.
     */
    public Eleve(int id, Date dateNaissance, String ville, String nom, String prenom, String classe, String matricule) {
        super(id, dateNaissance, ville, nom, prenom);
        this.classe = classe;
        this.matricule = matricule;
    }

    public String getClasse() {
        return classe;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }



}
