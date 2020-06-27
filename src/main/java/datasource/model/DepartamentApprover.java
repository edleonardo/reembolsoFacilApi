package datasource.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "DEPARTAMENT_APPROVER")
public class DepartamentApprover implements Serializable {




	private static final long serialVersionUID = 1L;

	
	@Column(name = "id_user")
	private Long id_user;

	@Id
	@Column(name = "id_departament")
	private Long id_departament;

}