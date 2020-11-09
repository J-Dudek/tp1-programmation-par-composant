package progcomposant.tp.tp1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import progcomposant.tp.tp1.model.Concessionnaire;
import progcomposant.tp.tp1.model.Marque;

import java.util.Set;
@RepositoryRestResource
public interface MarqueRepository extends CrudRepository<Marque,Integer> {
    Set<Marque> findAll();
    Marque findById(int id);
    Marque findByNomIgnoreCase(String nom);
    Set<Marque> findMarquesByConcessionnaires(Concessionnaire concessionnaire);
}
