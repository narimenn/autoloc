package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.Entities.Employe;

import java.util.List;

public interface IEmployeServiceImp {

    Employe addEmploye(Employe employe);

    List<Employe> retrieveAllEmployes();

    Employe retrieveEmployeById(Long id);

    Employe updateEmploye(Long id, Employe employe);

    void deleteEmploye(Long id);
}