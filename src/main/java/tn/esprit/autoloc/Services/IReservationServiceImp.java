package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.Entities.Reservation;

import java.util.List;

public interface IReservationServiceImp {

    Reservation addReservation(Reservation reservation);

    List<Reservation> retrieveAllReservations();

    Reservation retrieveReservationById(Long id);

    Reservation updateReservation(Long id, Reservation reservation);

    void deleteReservation(Long id);
}