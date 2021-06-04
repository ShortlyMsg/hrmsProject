package shortlymsg.hrms.entities.concretes;

import java.sql.Date;

import javax.persistence.*;

import com.sun.istack.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="activation_code")
@NoArgsConstructor
public class ActivationCode {
	
	@Id
	
	@NotNull
	@Column(name="id")
	private int id;
	
	@NotNull
	@Column(name="activation_code")
	private String activationCode;
	
	@NotNull
	@Column(name="is_confirmed")
	private boolean isConfirmed;
	
	@NotNull
	@Column(name="confirm_date")
	private Date confirmDate;

	public ActivationCode(int id, String activationCode) {
		super();
		this.id = id;
		this.activationCode = activationCode;
	}
}
