package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.Entities.Agence;

import java.util.List;

public interface IAgenceServiceImp {

    Agence addAgence(Agence agence);

    List<Agence> retrieveAllAgences();

    Agence retrieveAgenceById(Long id);

    Agence updateAgence(Long id, Agence agence);

    void deleteAgence(Long id);
}