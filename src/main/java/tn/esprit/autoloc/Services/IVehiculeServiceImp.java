package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.Entities.Vehicule;

import java.util.List;

public interface IVehiculeServiceImp {

    Vehicule addVehicule(Vehicule vehicule);

    List<Vehicule> retrieveAllVehicules();

    Vehicule retrieveVehiculeById(Long id);

    Vehicule updateVehicule(Long id, Vehicule vehicule);

    void deleteVehicule(Long id);
}