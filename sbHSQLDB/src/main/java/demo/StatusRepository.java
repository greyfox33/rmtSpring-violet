package demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface StatusRepository extends CrudRepository<Status, Long> {

      @Query("select c from Status c where c.child_id = ?1")
      List<Status> findByChildID(Long child_id);

}