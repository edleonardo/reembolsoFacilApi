package datasource.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
public class Archive  {

	@Id
    private int Refund;
    private String Archive;
    @SuppressWarnings("unused")
	private String Data; 
    
    public Archive(int id, String archive, String data) {
        this.Refund = id;
        this.Archive = archive;
        this.Data = data;
    }
    
    @SuppressWarnings("unused")
    private Archive() {
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
