package com.tka.services;

import java.util.ArrayList;
import java.util.List;

import com.tka.dao.Dao;
import com.tka.entity.Candidate;

public class Eciservice {
	Dao dao=null;
	public List<Candidate> getallcandiddate(){
		dao=new Dao();
		List<Candidate> getallcandiddate = Dao.getallcandiddate();
		
		return getallcandiddate;
	}
	public List<Candidate> listbypartname(String party){
		dao=new Dao();
		List<Candidate> getallcandiddate = dao.getallcandiddate();
		List<Candidate> listbypartname=new ArrayList<>();
		for(Candidate can:getallcandiddate) {
			if(party.equalsIgnoreCase(can.getPartyname())) {
			
				listbypartname.add(can);
//				System.out.println(can.getName());			}
			
		
		
	}
		
	}
		return listbypartname;
	}
	public List<Candidate> namestartswith(String name){
		dao=new Dao();
		List<Candidate> getallcandiddate = dao.getallcandiddate();
		List<Candidate> namestartswith=new ArrayList<>();
		for(Candidate can:getallcandiddate) {
			if(can.getName().startsWith(name)) {
				namestartswith.add(can);
			}
		}
		return namestartswith;
		
	}
	public List<Candidate> listbystateparty(String state,String party){
		dao=new Dao();
		List<Candidate> getallcandiddate = dao.getallcandiddate();
		List<Candidate> listbystateparty=new ArrayList<>();
		for(Candidate can:getallcandiddate) {
			if(state.equalsIgnoreCase(can.getState()) && party.equalsIgnoreCase(can.getPartyname())) {
				listbystateparty.add(can);
			}
		}
		
		
	return listbystateparty;
	}
	public List<Candidate> listbygender(String gender){
		dao=new Dao();
		List<Candidate> getallcandiddate = dao.getallcandiddate();
		List<Candidate> listbygender=new ArrayList<>();
		for(Candidate can:getallcandiddate) {
			if(gender.equalsIgnoreCase(can.getGender())){
				listbygender.add(can);
			}
		}
		return listbygender;	
	}
	public List<Candidate> listbyage(int age){
		dao=new Dao();
		List<Candidate> getallcandiddate = dao.getallcandiddate();
		List<Candidate> listbyage=new ArrayList<>();
		for(Candidate can:getallcandiddate) {
		if(can.getAge()>=age) {
			listbyage.add(can);
			System.out.println(can.getName());
			
		}
		}
		return listbyage; 
	}
	public List<Candidate> listbyassemblyno(int no){
		dao=new Dao();
		List<Candidate> getallcandiddate = dao.getallcandiddate();
		List<Candidate> listbyassemblyno=new ArrayList<>();
		for(Candidate can:getallcandiddate) {
			if(can.getAssemblyno()==no) {
				listbyassemblyno.add(can);
				System.out.println(can.getName()+"->"+can.getPartyname());
			}
		}
		return listbyassemblyno;
		
		
	}
	
}
