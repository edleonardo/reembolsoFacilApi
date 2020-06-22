package datasource.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bank {

    @Id
    private int Id;
    private String Description;

    public Bank(int id, String description) {
        this.Id = id;
        this.Description = description;
    }

    @SuppressWarnings("unused")
    private Bank() {
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
