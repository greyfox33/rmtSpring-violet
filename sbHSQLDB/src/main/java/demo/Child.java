package demo;

//import java.sql.Date;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Id;

@Entity
public class Child {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int child_id;
    private String first;
    private String last;
	private String gender;
	@Column(name="dob")
    private Date dob;
    private String image;
    
    protected Child() {}

    public Child(String first, String last) {
        this.first = first;
        this.last = last;
    }
    
    public int getChildId() {
        return child_id;
      }
    
    public void setChildId(int child_id) {
    	this.child_id = child_id;
    }
    
    public String getFirst() {
    	return first;
    }
    
    public void setFirst(String first) {
    	this.first = first;
    }
    
    public String getLast() {
    	return last;
    }
    
    public void setLast(String last) {
    	this.last = last;
    }
    public String getImage() {
    	return image;
    }
    
    public void setImage(String image){
    	this.image = image;
    }
    
    public String getGender() {
    	return gender;
    }
    public void setGender(String gender){
    	this.gender = gender;
    }
    
    public Date getDOB() {
    	return dob;
    }
    
    public void setDOB(Date dob) {
    	this.dob = dob;
    }

    @Override
    public String toString() {
        return String.format(
                "Child [childId=%d, firstName='%s', lastName='%s', gender='%s', image='%s']",
                child_id, first, last, gender, image);
    }

}
//@OneToMany( targetEntity=Employee.class )
//private List employeelist;
//
//public int getId() {
//	return id;
//}
//
//public void setId(int id) {
//	this.id = id;
//}
//
//public String getName( ) {
//	return name;
//}
//
//public void setName( String deptName ) {
//	this.name = deptName;
//}
//
//public List getEmployeelist() {
//  return employeelist;
//}
//
//public void setEmployeelist(List employeelist) {
//  this.employeelist = employeelist;

