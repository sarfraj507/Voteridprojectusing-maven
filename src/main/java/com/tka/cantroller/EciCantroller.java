package com.tka.cantroller;

import java.util.List;

import com.tka.dao.Dao;
import com.tka.entity.Candidate;
import com.tka.services.Eciservice;

public class EciCantroller {
	Eciservice service = null;

	public List<Candidate> getallcandiddate() {

		service = new Eciservice();
		List<Candidate> getallcandidate = service.getallcandiddate();
		return getallcandidate;
	}

	public List<Candidate> listbypartyname(String party) {
//		Dao.getallcandiddate();
		service = new Eciservice();
		List<Candidate> listbypartyname = service.listbypartname(party);
		return listbypartyname;
	}

	public List<Candidate> namestartswith(String name) {
//		Dao.getallcandiddate();
		service = new Eciservice();
		List<Candidate> namestartswith = service.namestartswith(name);
		return namestartswith;
	}

	public List<Candidate> listbystateparty(String state, String party) {
//		Dao.getallcandiddate();
		service = new Eciservice();
		List<Candidate> listbystateparty = service.listbystateparty(state, party);
		return listbystateparty;
	}

	public List<Candidate> listbygender(String gender) {
//		Dao.getallcandiddate();
		service = new Eciservice();
		List<Candidate> listbygender = service.listbygender(gender);
		return listbygender;
	}

	public List<Candidate> listbyage(int age) {
//		Dao.getallcandiddate();
		service = new Eciservice();
		List<Candidate> listbyage = service.listbyage(age);
		return listbyage;
	}
	public List<Candidate> listbyassemblyno(int no) {
//		Dao.getallcandiddate();
		service = new Eciservice();
		List<Candidate> listbyassemblyno = service.listbyassemblyno(no);
		return listbyassemblyno;
	}

}
