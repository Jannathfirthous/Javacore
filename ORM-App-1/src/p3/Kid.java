package p3;

import java.time.LocalDate;
import java.util.List;
import java.sql.*;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.*;

@Entity
@Table(name = "Kid")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Kid {
	 static Connection con;
	private String dob;
	@Column(name = "Participant_name")
	private String name;
	private String Gender;
	private int weight;
	@Id
	 int id;
	@Embedded
	private Parent parentInfo;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "HospitalInfo")
	@CollectionTable(name = "hospital")
	private Hospital hospitalInfo;

	@Embedded
	@AttributeOverrides({ @AttributeOverride(name = "FatherName", column = @Column(name = "GrandFatherName")),
			@AttributeOverride(name = "MotherName", column = @Column(name = "GrandMotherName")),
			@AttributeOverride(name = "Phonenumber", column = @Column(name = "phonenumber")), })
	@ElementCollection
	@CollectionTable(name = "KidsVaccinationCertificate")
	private List<Vaccination> allVaccination;

	public Kid(String dob, String name, String gender, int weight) {
		super();
		this.dob = dob;
		this.name = name;
		this.Gender = gender;
		this.weight = weight;
	}

}
