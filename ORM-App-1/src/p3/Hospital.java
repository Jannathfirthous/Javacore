package p3;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

@AllArgsConstructor
@Data
@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name="hospital")
public class Hospital {
	@Id
	private int hid;
	private String name;
	private String registernumber;

	@ElementCollection
	@CollectionTable(name="hospital_doctor")
	List<Doctor> alldoctor;

	public Hospital(int hid, String name, String registernumber) {
		super();
		this.hid = hid;
		this.name = name;
		this.registernumber = registernumber;
	}
	
	
}
