package datasource.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "REFUND")
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
    private int user;
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

}
