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
@Table(name = "USERS")
public class User implements Serializable {

	private static final long serialVersionUID = -1382904967579359990L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;

	@Column(name = "full_name")
	private String FullName;

	@Column(name = "CPF")
	private String Cpf;

	@Column(name = "Agency")
	private Integer Agency;

	@Column(name = "flaglevel")
	private Integer flaglevel;

	@Column(name = "Account")
	private String Account;

	@Column(name = "Departament")
	private Integer Departament;

	@Column(name = "Bank")
	private Integer Bank;

	@Column(name = "approver")
	private Integer Approver;

	@Column(name = "Login")
	private String Login;

	@Column(name = "Senha")
	private String Senha;

}
