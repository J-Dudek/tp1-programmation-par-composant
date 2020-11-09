package progcomposant.tp.tp1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import progcomposant.tp.tp1.model.Voiture;

import java.util.Set;
@RepositoryRestResource
public interface VoitureRepository extends CrudRepository<Voiture,Integer> {
    Set<Voiture> findAll();
    Set<Voiture> findByMarqueId(int marqueId);
    Set<Voiture> findByClientId(int clientId);

}
