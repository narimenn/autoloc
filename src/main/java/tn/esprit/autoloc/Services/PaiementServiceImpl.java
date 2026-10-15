package tn.esprit.autoloc.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Entities.Paiement;
import tn.esprit.autoloc.Repositories.PaiementRepo;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PaiementServiceImpl implements IPaiementServiceImp {

    private final PaiementRepo paiementRepository;

    @Override
    public Paiement addPaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public List<Paiement> retrieveAllPaiements() {
        return paiementRepository.findAll();
    }

    @Override
    public Paiement retrievePaiementById(Long id) {
        return paiementRepository.findById(id).orElse(null);
    }

    @Override
    public Paiement updatePaiement(Long id, Paiement paiement) {
        paiement.setIdPaiement(id);
        return paiementRepository.save(paiement);
    }

    @Override
    public void deletePaiement(Long id) {
        paiementRepository.deleteById(id);
    }
}