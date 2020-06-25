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
	@Column(name = "type_refund")
    private int Type;
    private String Justification;
	@Column(name = "value")
    private double Value;
	@Column(name = "user")
    private int User;
	@Column(name = "location")
    private String Location;
	@Column(name = "CNPJ")
    private String Cnpj;
	@Column(name = "description")
    private String Description;
	@Column(name = "status")
    private int Status;
    @Column(name = "flow_phase")
    private String FlowPhase;
    @Column(name = "approver")
    private String Approver;

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
    

    public void SetStatus(int status) {
        this.Status = status;
    }

    public int GetStatus() {
        return this.Status;
    }
    
    public void SetApprover(String approver) {
        this.Approver = approver;
    }

    public String GetApprover() {
        return this.Approver;
    }

}
