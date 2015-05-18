package demo;

//import java.sql.Date;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Child {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int childid;
    private String first;
    private String last;
	private String gender;
    private Date dob;
    private String image;
    
    protected Child() {}

    public Child(String first, String last) {
        this.first = first;
        this.last = last;
    }
    
    public int getChildId() {
        return childid;
      }
    public String getFirst() {
    	return first;
    }
    
    public String getImage() {
    	return image;
    }
 
    //TODO: need to put get/sets for all items

    @Override
    public String toString() {
        return String.format(
                "Child [childid=%d, firstName='%s', lastName='%s', gender='%s', image='%s']",
                childid, first, last, gender, image);
    }

}

