package p3;

import java.time.LocalDate;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Embeddable
public class Vaccination {
	private String doseName;
	private String vaccinationdate;
	private String nextDoseName;
	private String nextvaccinationdate;
	private String remarks;
	private int cost;
	

}
