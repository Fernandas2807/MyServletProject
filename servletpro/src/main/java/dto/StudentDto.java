package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentDto {
	@Id
	private int id;
	private String  name;
	private String email;
	private String dob;
	private long pnumber;
	private String gender;
	private String state;
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public long getPnumber() {
		return pnumber;
	}
	public void setPnumber(long pnumber) {
		this.pnumber = pnumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String state() {
		return state;
	}
	public void setstate(String state) {
		this.state = state;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "StudentDto [id=" + id + ", name=" + name + ", email=" + email + ", dob=" + dob + ", pnumber=" + pnumber
				+ ", gender=" + gender + ", state=" + state + "]";
	}
	
}

