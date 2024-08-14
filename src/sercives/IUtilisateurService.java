package sercives;

import models.Utilisateur;

import java.util.List;

public interface IUtilisateurService {

    //authentification
    public Boolean getUser(String identifiant, String motDePasse);
    //modifier l'utilisateur
    public Utilisateur updateUser(String identifiant, String motDePasse);
    //Supprimer un Compte
    public void deleteUser(String identifiant, String motDePasse);
    //Liste Utilisateur
    public List<Utilisateur> listeUtilisateur();
}
