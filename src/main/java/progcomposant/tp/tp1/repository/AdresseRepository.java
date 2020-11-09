package progcomposant.tp.tp1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import progcomposant.tp.tp1.model.Adresse;

import java.util.Set;
@RepositoryRestResource
public interface AdresseRepository extends CrudRepository<Adresse,Integer> {
    Set<Adresse> findAll();
    Set<Adresse> findByConcessionnaireId(int concessionnaireId);
}