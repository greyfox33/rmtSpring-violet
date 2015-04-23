package demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;

public interface ChildRepository extends CrudRepository<Child, Long> {

    List<Child> findByLast(String last);
    
    // @Query(value = "Select * From Child")
    //public List<Child> all();

}
