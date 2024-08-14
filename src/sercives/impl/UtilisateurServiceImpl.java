package sercives.impl;

import models.Utilisateur;
import sercives.IUtilisateurService;

import java.util.List;

public class UtilisateurServiceImpl implements IUtilisateurService {

    @Override
    public Boolean getUser(String identifiant, String motDePasse) {
        return true;
    }

    @Override
    public Utilisateur updateUser(String identifiant, String motDePasse) {
        return null;
    }

    @Override
    public void deleteUser(String identifiant, String motDePasse) {

    }

    @Override
    public List<Utilisateur> listeUtilisateur() {
        return List.of();
    }
}
