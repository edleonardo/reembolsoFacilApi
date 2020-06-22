package resource.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BankResource {
    
    @JsonProperty
    private int Id;
    @JsonProperty
    private String Description;

    public BankResource(int id, String description) {
        this.Id = id;
        this.Description = description;
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
