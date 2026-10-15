package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.Entities.Contrat;

import java.util.List;

public interface IContratServiceImp {

    Contrat addContrat(Contrat contrat);

    List<Contrat> retrieveAllContrats();

    Contrat retrieveContratById(Long id);

    Contrat updateContrat(Long id, Contrat contrat);

    void deleteContrat(Long id);
}