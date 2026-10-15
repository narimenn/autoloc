package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.Entities.Paiement;

import java.util.List;

public interface IPaiementServiceImp {

    Paiement addPaiement(Paiement paiement);

    List<Paiement> retrieveAllPaiements();

    Paiement retrievePaiementById(Long id);

    Paiement updatePaiement(Long id, Paiement paiement);

    void deletePaiement(Long id);
}