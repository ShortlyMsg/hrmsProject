package shortlymsg.hrms.entities.concretes;

import javax.persistence.*;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="employers")
@AllArgsConstructor
@NoArgsConstructor
public class Employer extends User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@NotNull
	@Column(name="id")
	private int id;
	
	@NotNull
	@Column(name="company_name")
	private String companyName;
	
	@NotNull
	@Column(name="web_adress")
	private String webAdress;
	
	@NotNull
	@Column(name="phone_number")
	private String phoneNumber;
}
