package demo;

//import java.sql.Date;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Id;

@Entity
public class StatusUpdate {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="status_id")
    private int status_id;
    private String child_id;
    private String status;
	private Date createDate;
	private Date modifyDate;
    private int deleted;
    
    protected StatusUpdate () {}
    
    public int getStatusId() {
        return status_id;
      }
    
    public void setStatusId(int status_id) {
    	this.status_id = status_id;
    }
    
    public String getStatus() {
    	return status;
    }
    
    public void setStatus(String status) {
    	this.status = status;
    }
    
    public String getChildId() {
    	return child_id;
    }
    
    public Date getCreateDate() {
    	return createDate;
    }
    
    public void setDOB(Date createDate) {
    	this.createDate = createDate;
    }

    @Override
    public String toString() {
        return String.format(
                "StatusUpdate [status_id='%d', child_id='%d', status='%s']",
                status_id, child_id, status);
    }

}