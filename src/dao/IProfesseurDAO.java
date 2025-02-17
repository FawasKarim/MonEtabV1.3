package dao;

import models.Professeur;

import java.util.List;

public interface IProfesseurDAO {

    public Professeur Ajouter(Professeur professeur);
    public  Professeur modifier(Professeur professeur);
    public void supprimer(int identifiant);
    public List obtenirProfesseur();
    public void obtenir(int identifiant);
}
