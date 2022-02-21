package EmployeeManage;

public class Employee {
	

	private String eName; //
	private int eSallary;
	private int eCode;
	private String eAddrs;
	private String eEmail;
	public String geteName() {
		return eName;
	}
	public void setEName(String eName) {
		this.eName = eName;
	}
	public int getESallary() {
		return eSallary;
	}
	public void setESallary(int eSallary) {
		this.eSallary = eSallary;
	}
	public int getECode() {
		return eCode;
	}
	public void setECode(int eCode) {
		this.eCode = eCode;
	}
	public String getEAddrs() {
		return eAddrs;
	}
	public void setEAddrs(String eAddrs) {
		this.eAddrs = eAddrs;
	}
	public String getEEmail() {
		return eEmail;
	}
	public void setEEmail(String eEmail) {
		this.eEmail = eEmail;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [eName=" + eName + ",  eSallary=" + eSallary + ", eCode=" + eCode + ", eAddrs=" + eAddrs
				+ ", eEmail=" + eEmail + "]";
	}
public Employee(String eName, int eSallary, int eCode, String eAddrs, String eEmail) {
	super();
	this.eName = eName;
	this.eSallary = eSallary;
	this.eCode = eCode;
	this.eAddrs = eAddrs;
	this.eEmail = eEmail;
}
}
