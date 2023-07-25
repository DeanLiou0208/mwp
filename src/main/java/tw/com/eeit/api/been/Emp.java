package tw.com.eeit.api.been;

import java.util.Arrays;

public class Emp {
	private int empid;
	private String empname;
	private int salary;
	private String sex;
	private byte[] photo;
	private int deptid;
	
	
	@Override
	public String toString() {
		return "Emp [empid=" + empid + ", empname=" + empname + ", salary=" + salary + ", sex=" + sex + ", photo="
				+ Arrays.toString(photo) + ", deptid=" + deptid + "]";
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	
	

	
}
