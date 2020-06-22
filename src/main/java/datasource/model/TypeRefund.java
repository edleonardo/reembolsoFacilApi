package datasource.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name= "type_refund")
public class TypeRefund {
    
    @Id
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