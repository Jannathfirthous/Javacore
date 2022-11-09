package p3;

import javax.persistence.Embeddable;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;

import lombok.*;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Getter
@Setter
@Embeddable
public class Parent {
	private String fatherName;
	private String motherName;
	private long phoneNumber;
}
