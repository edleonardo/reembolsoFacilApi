package datasource.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "type_refund")
public class TypeRefund implements Serializable {
    
	private static final long serialVersionUID = -6602468905173479449L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String Description;
    
    public TypeRefund(int id, String description) {
        this.Id = id;
        this.Description = description;
    }
    
    @SuppressWarnings("unused")
    private TypeRefund() {
    }

    public void SetId(int id) {
        this.Id = id;
    }

    public int GetId() {
        return this.Id;
    }

    public void SetDescription(String description) {
        this.Description = description;
    }

    public String GetDescription() {
        return this.Description;
    }
}
