package progcomposant.tp.tp1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import progcomposant.tp.tp1.model.Client;

import java.util.Set;
@RepositoryRestResource
public interface ClientRepository extends CrudRepository<Client,Integer> {
    Set<Client> findAll();
}
