package p3;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Getter
@Setter
@Embeddable
public class Doctor {
	private int doctorId;
	private String doctorName;
	private int experience;
	private Long doctorPhoneNo;
	private String Category;
}
