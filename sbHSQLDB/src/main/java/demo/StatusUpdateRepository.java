package demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface StatusUpdateRepository extends CrudRepository<StatusUpdate, Long> {

      @Query("select c from statusupdate c where c.child_id = ?1")
      List<StatusUpdate> findByChildID(int child_id);

}