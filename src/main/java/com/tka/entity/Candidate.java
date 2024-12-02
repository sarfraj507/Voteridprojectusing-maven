package com.tka.entity;

public class Candidate {
	private int id;
	private String name;
	private String partyname;
	private String State;
	private String Assembly;
	private int Assemblyno;
	private String  Status;
	private String  Gender;
	private int age;
	public Candidate() {
		super();
	}
	public Candidate(int id, String name, String partyname, String state, String assembly, int assemblyno,
			String status, String gender, int age) {
		super();
		this.id = id;
		this.name = name;
		this.partyname = partyname;
		State = state;
		Assembly = assembly;
		Assemblyno = assemblyno;
		Status = status;
		Gender = gender;
		this.age = age;
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
	public String getPartyname() {
		return partyname;
	}
	public void setPartyname(String partyname) {
		this.partyname = partyname;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getAssembly() {
		return Assembly;
	}
	public void setAssembly(String assembly) {
		Assembly = assembly;
	}
	public int getAssemblyno() {
		return Assemblyno;
	}
	public void setAssemblyno(int assemblyno) {
		Assemblyno = assemblyno;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Candidate [id=" + id + ", name=" + name + ", partyname=" + partyname + ", State=" + State
				+ ", Assembly=" + Assembly + ", Assemblyno=" + Assemblyno + ", Status=" + Status + ", Gender=" + Gender
				+ ", age=" + age + "]";
	} 
	

}
