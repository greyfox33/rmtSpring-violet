package demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface ChildRepository extends CrudRepository<Child, Long> {

    List<Child> findByLast(String last);
    
//    @Query("select u from User u where u.emailAddress = ?1")
//    User findByEmailAddress(String emailAddress);
    
    // @Query(value = "Select * From Child")
    //public List<Child> all();

}


