package shortlymsg.hrms.entities.concretes;

import javax.persistence.*;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name="id")
@EqualsAndHashCode(callSuper = false)
@Table(name= "employers")

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
