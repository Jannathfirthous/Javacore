package p2;

import java.time.LocalDate;
import javax.persistence.Embeddable;
@Embeddable
public class Certification {
	public Certification() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int Certificateid;
	private String stream;
	private String certificateName;
	private String issueDate;
	private String validUpto;
	private String remark;
	public int getCertificateid() {
		return Certificateid;
	}
	public void setCertificateid(int certificateid) {
		Certificateid = certificateid;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public String getCertificateName() {
		return certificateName;
	}
	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	public String getValidUpto() {
		return validUpto;
	}
	public void setValidUpto(String validUpto) {
		this.validUpto = validUpto;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Certification(int certificateid, String stream, String certificateName, String issueDate, String validUpto,
			String remark) {
		super();
		Certificateid = certificateid;
		this.stream = stream;
		this.certificateName = certificateName;
		this.issueDate = issueDate;
		this.validUpto = validUpto;
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "Certification [Certificateid=" + Certificateid + ", stream=" + stream + ", certificateName="
				+ certificateName + ", issueDate=" + issueDate + ", validUpto=" + validUpto + ", remark=" + remark
				+ "]";
	}
	
	
	
}
