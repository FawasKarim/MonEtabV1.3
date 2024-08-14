package sercives;

import models.Professeur;

import java.util.List;

public interface IProfesseurServices {
    public Professeur save(Professeur professeur);
    public  Professeur update(Professeur professeur);
    public void delete(int identifiant);
    //Retourner la liste des professeurs
    public List<Professeur> getAll();

    public void getOne(int identifiant);
}