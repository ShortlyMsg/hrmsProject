package shortlymsg.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.*;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="candidates")
@PrimaryKeyJoinColumn(name="id", referencedColumnName = "id")
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class Candidate extends User{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@NotNull
	@Column(name="id")
	private int id;
	
	@NotNull
	@Column(name="first_name")
	private String firstName;
	
	@NotNull
	@Column(name="last_name")
	private String lastName;
	
	@NotNull
	@Column(name="identity_number")
	private String identityNumber;
	
	@NotNull
	@Column(name="birth_date")
	private Date birthDate;
}
