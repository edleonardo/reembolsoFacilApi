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
@Table(name = "TYPE_REFUND")
public class TypeRefund implements Serializable {




	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	private Long Id;

	@Column(name = "desc_type")
	private String Desc_type;

}