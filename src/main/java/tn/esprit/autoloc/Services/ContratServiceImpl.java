package tn.esprit.autoloc.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Entities.Contrat;
import tn.esprit.autoloc.Repositories.ContratRepo;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContratServiceImpl implements IContratServiceImp {

    private final ContratRepo contratRepository;

    @Override
    public Contrat addContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public List<Contrat> retrieveAllContrats() {
        return contratRepository.findAll();
    }

    @Override
    public Contrat retrieveContratById(Long id) {
        return contratRepository.findById(id).orElse(null);
    }

    @Override
    public Contrat updateContrat(Long id, Contrat contrat) {
        contrat.setIdContrat(id);
        return contratRepository.save(contrat);
    }

    @Override
    public void deleteContrat(Long id) {
        contratRepository.deleteById(id);
    }
}