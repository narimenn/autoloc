package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.Entities.Equipement;

import java.util.List;

public interface IEquipementServiceImp {

    Equipement addEquipement(Equipement equipement);

    List<Equipement> retrieveAllEquipements();

    Equipement retrieveEquipementById(Long id);

    Equipement updateEquipement(Long id, Equipement equipement);

    void deleteEquipement(Long id);
}