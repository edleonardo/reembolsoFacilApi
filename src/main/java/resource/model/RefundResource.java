package resource.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RefundResource implements Serializable {

	private static final long serialVersionUID = -4129600916549432968L;

	@JsonProperty
	private int Id;
	@JsonProperty("type_refund")
	private int Type;
	@JsonProperty("justification")
	private String Justification;
	@JsonProperty("value")
	private double Value;
	@JsonProperty("user")
	private int User;
	@JsonProperty("location")
	private String Location;
	@JsonProperty("CNPJ")
	private String Cnpj;
	@JsonProperty("description")
	private String Description;
	@JsonProperty("approver")
	private int Approver;
	@JsonProperty("flow_phase")
	private String FlowPhase;
	@JsonProperty("status")
	private String Status;

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

	public void SetApprover(int approver) {
		this.Approver = approver;
	}

	public int GetApprover() {
		return this.Approver;
	}

	public void SetStatus(String status) {
		this.Status = status;
	}

	public String GetStatus() {
		return this.Status;
	}

	public void SetFlowPhase(String flowPhase) {
		this.FlowPhase = flowPhase;
	}

	public String GetFlowPhase() {
		return this.FlowPhase;
	}

}
