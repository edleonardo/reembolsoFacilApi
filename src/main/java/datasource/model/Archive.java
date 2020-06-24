package datasource.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table
public class Archive implements Serializable {

	private static final long serialVersionUID = 7918248053661729650L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Refund;
    private String Archive;
    @SuppressWarnings("unused")
	private String Data; 
    
    public Archive() {
    }

    public int getRefund() {
        return this.Refund;
    }

    public void setRefund(int refund) {
        this.Refund = refund;
    }
    
    public String getArchive() {
        return this.Archive;
    }

    public void setArchive(String archive) {
        this.Archive = archive;
    }
    
    public String getData() {
        return this.Archive;
    }

    public void setData(String data) {
        this.Data = data;
    }
}
