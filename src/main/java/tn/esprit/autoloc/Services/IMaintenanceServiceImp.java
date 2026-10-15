package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.Entities.Maintenance;

import java.util.List;

public interface IMaintenanceServiceImp {

    Maintenance addMaintenance(Maintenance maintenance);

    List<Maintenance> retrieveAllMaintenances();

    Maintenance retrieveMaintenanceById(Long id);

    Maintenance updateMaintenance(Long id, Maintenance maintenance);

    void deleteMaintenance(Long id);
}