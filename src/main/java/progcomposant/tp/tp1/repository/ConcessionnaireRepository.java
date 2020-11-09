package progcomposant.tp.tp1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import progcomposant.tp.tp1.model.Concessionnaire;
import progcomposant.tp.tp1.model.Marque;

import java.util.Set;
@RepositoryRestResource
public interface ConcessionnaireRepository extends CrudRepository<Concessionnaire,Integer> {
    Set<Concessionnaire> findAll();
    Concessionnaire findById(int id);
    Set<Concessionnaire> findConcessionnaireByMarques(Marque marque);
}
