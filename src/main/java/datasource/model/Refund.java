package datasource.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "refund")
public class Refund implements Serializable {

	private static final long serialVersionUID = 7090520749054178080L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private int Type;
    private String Justification;
    private double Value;
    private int User;
    private String Location;
    private String Cnpj;
    private String Description;
    private String Status;
    @Column(name = "flow_phase")
    private String FlowPhase;

    public Refund() {
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

    public void SetFlowPhase(String flowPhase) {
        this.FlowPhase = flowPhase;
    }

    public String GetFlowPhase() {
        return this.FlowPhase;
    }
    

    public void SetStatus(String status) {
        this.Status = status;
    }

    public String GetStatus() {
        return this.Status;
    }

}
