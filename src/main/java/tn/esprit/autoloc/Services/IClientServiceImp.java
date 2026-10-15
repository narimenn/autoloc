package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.Entities.Client;

import java.util.List;

public interface IClientServiceImp {

    Client addClient(Client client);

    List<Client> retrieveAllClients();

    Client retrieveClientById(Long id);

    Client updateClient(Long id, Client client);

    void deleteClient(Long id);
}