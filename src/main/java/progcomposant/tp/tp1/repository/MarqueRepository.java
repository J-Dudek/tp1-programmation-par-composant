package progcomposant.tp.tp1.repository;

import org.springframework.data.repository.CrudRepository;
import progcomposant.tp.tp1.model.Concessionnaire;
import progcomposant.tp.tp1.model.Marque;

import java.util.Set;

public interface MarqueRepository extends CrudRepository<Marque,Integer> {
    Set<Marque> findAll();
    Marque findById(int id);
    Marque findByNom(String nom);
    Set<Marque> findMarquesByConcessionnaires(Concessionnaire concessionnaire);
    void deleteById(int id);

}
