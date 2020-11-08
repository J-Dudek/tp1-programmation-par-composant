package progcomposant.tp.tp1.repository;

import org.springframework.data.repository.CrudRepository;
import progcomposant.tp.tp1.model.Client;

import java.util.Set;

public interface ClientRepository extends CrudRepository<Client,Integer> {
    Set<Client> findAll();
    Client findById(int id);
}
