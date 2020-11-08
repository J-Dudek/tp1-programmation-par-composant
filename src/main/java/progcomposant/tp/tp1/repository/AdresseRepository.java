package progcomposant.tp.tp1.repository;

import org.springframework.data.repository.CrudRepository;
import progcomposant.tp.tp1.model.Adresse;

import java.util.Set;

public interface AdresseRepository extends CrudRepository<Adresse,Integer> {
    Set<Adresse> findAll();
    Set<Adresse> findByConcessionnaireId(int concessionnaireId);
    void deleteById(Integer integer);
    Adresse findById(int id);
    long count();
}