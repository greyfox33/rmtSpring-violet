package demo;

//import java.sql.Date;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Status {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="status_id")
    private Long status_id;
    private Long child_id;
    private String status;
    @Column(name="createdate")  //note that you have to use lowercase names. The Column declaration for JPA is useless (bug, IMO)
	private Date createdate;
    @Column(name="modifydate")
	private Date modifydate;
        
    protected Status () {}
    
    public Long getStatusId() {
        return status_id;
      }
    
    public void setStatusId(Long status_id) {
    	this.status_id = status_id;
    }
    
    public String getStatus() {
    	return status;
    }
    
    public void setStatus(String status) {
    	this.status = status;
    }
    
    public Long getChildId() {
    	return child_id;
    }
    
    public Date getCreateDate() {
    	return createdate;
    }
    
    public void setCreateDate(Date createdate) {
    	this.createdate = createdate;
    }
    
    public Date getModifyDate() {
    	return modifydate;
    }
    public void setModifyDate(Date modifydate) {
    	this.modifydate = modifydate;
    }

    @Override
    public String toString() {
        return String.format(
                "Status [status_id='%d', child_id='%d', status='%s']",
                status_id, child_id, status);
    }

}