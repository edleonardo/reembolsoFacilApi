package resource.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RefundResource {

    @JsonProperty
    private int Id;
    @JsonProperty
    private int Type;
    @JsonProperty
    private String Justification;
    @JsonProperty
    private double Value;
    @JsonProperty
    private int User;
    @JsonProperty
    private String Location;
    @JsonProperty
    private String Cnpj;
    @JsonProperty
    private String Description;
    @JsonProperty
    private int Approver;
    @JsonProperty
    private String Status;


    public RefundResource(int id, int type, String justification, double value, int user,
            String location, String cnpj, String description, int approver, String status) {

        this.Id = id;
        this.Type = type;
        this.Justification = justification;
        this.Value = value;
        this.User = user;
        this.Location = location;
        this.Cnpj = cnpj;
        this.Description = description;
        this.Approver = approver;
        this.Status = status;
    }

    public void SetId(int id) {
        this.Id = id;
    }

    public int GetId() {
        return this.Id;
    }

    public void SetType(int type) {
        this.Type = type;
    }

    public int GetType() {
        return this.Type;
    }

    public void SetJustification(String justification) {
        this.Justification = justification;
    }

    public String GetJustification() {
        return this.Justification;
    }

    public void SetValue(double value) {
        this.Value = value;
    }

    public double GetValue() {
        return this.Value;
    }

    public void SetUser(int user) {
        this.User = user;
    }

    public int GetUser() {
        return this.User;
    }

    public void SetLocation(String location) {
        this.Location = location;
    }

    public String GetLocation() {
        return this.Location;
    }

    public void SetCnpj(String cnpj) {
        this.Cnpj = cnpj;
    }

    public String GetCnpj() {
        return this.Cnpj;
    }

    public void SetDescription(String description) {
        this.Description = description;
    }

    public String GetDescription() {
        return this.Description;
    }

    public void SetApprover (int approver) {
        this.Approver = approver;
    }

    public int GetApprover () {
        return this.Approver;
    }
    
    public void SetStatus(String status) {
        this.Status = status;
    }

    public String GetStatus() {
        return this.Status;
    }

}
