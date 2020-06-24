package datasource.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Departament implements Serializable  {

	private static final long serialVersionUID = 3150600688648230581L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String Description;
        
    public Departament() {
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
