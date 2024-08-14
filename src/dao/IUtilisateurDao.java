package dao;

import models.Utilisateur;

import java.awt.*;
import java.sql.SQLException;
import java.util.List;

public interface IUtilisateurDao {

    //authentification
    public Utilisateur getUser(String identifiant, String motDePasse) throws SQLException;
    //modifier l'utilisateur
    public Utilisateur updateUser(String identifiant, String motDePasse);
    //Supprimer un Compte
    public void deleteUser(String identifiant, String motDePasse);
    //Liste Utilisateur
    public List<Utilisateur> listeUtilisateur();
}
