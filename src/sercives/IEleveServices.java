package sercives;

import models.Eleve;

public interface IEleveServices {

    //Methode pour enregistrer les élèves
    Eleve Save(Eleve eleve);

    //Methode pour modifier les élèves
    Eleve update(Eleve eleve);

    //Methode pour modifier les élèves
    void delete(int identifiant);

    //Methode pour Obtenir un élèves
    Eleve getOne(int identifiant);

}
