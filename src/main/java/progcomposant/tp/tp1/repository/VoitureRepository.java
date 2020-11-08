package progcomposant.tp.tp1.repository;

import org.springframework.data.repository.CrudRepository;
import progcomposant.tp.tp1.model.Client;
import progcomposant.tp.tp1.model.Marque;
import progcomposant.tp.tp1.model.Voiture;

import java.util.Set;

public interface VoitureRepository extends CrudRepository<Voiture,Integer> {
    Set<Voiture> findAll();
    Set<Voiture> findByMarqueId(int marqueId);
    Set<Voiture> findVoituresByClients(Client client);
}
