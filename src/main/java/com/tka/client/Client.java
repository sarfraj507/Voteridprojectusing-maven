package com.tka.client;

import java.util.List;
import java.util.Scanner;

import com.tka.cantroller.EciCantroller;
import com.tka.dao.Dao;
import com.tka.entity.Candidate;

public class Client {
	public static void main(String[] args) {
		System.out.println("Enter the choice between 1 to 6\n" + "Enter the choice 1 to get all the candidates\n"
				+ "Enter the choice 2 to show the candidates by partyname\n"
				+ "Enter the choice 3 to show the candidates by cannamename\n"
				+ "Enter the choice 4 to show the candidates by stateparty\n"
				+ "Enter the choice 5 to show the candidates by gender\n"
				+ "Enter the choice 6 to show the candidates by age\n"
				+ "Enter the Choice 7 to show the candidates by Assembly no");
		EciCantroller cantr = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice");
		int option = sc.nextInt();

		do {

			switch (option) {
			case 1:
				cantr = new EciCantroller();
				List<Candidate> getallcandiddate = cantr.getallcandiddate();
				System.out.println(getallcandiddate);
				break;

			case 2:
				Dao.getallcandiddate();
				cantr = new EciCantroller();
				System.out.println("enter the partyname");
				String party = sc.next();
				List<Candidate> listbypartyname = cantr.listbypartyname(party);
				System.out.println(listbypartyname);
//			for(Candidate can:listbypartyname) {
//				if(can.getPartyname().startsWith(party)) {
//					listbypartyname.add(can);
//					System.out.println(can.getName());
//				}
//			}
				break;
			case 3:
				Dao.getallcandiddate();
				cantr = new EciCantroller();

				System.out.println("Enter the state");
				String state = sc.next();
				System.out.println("Enter the party name");
				String partyna = sc.next();
				List<Candidate> listbystateparty = cantr.listbystateparty(state, partyna);
				System.out.println(listbystateparty);
				break;
			case 4:
				Dao.getallcandiddate();
				cantr = new EciCantroller();
				System.out.println("Enter the Candidate name");
				String namee = sc.next();
				List<Candidate> namestartswith = cantr.namestartswith(namee);
				System.out.println(namestartswith);
				break;

			case 5:
				Dao.getallcandiddate();
				cantr = new EciCantroller();
				System.out.println("Enter the Gender");
				String gender = sc.next();
				List<Candidate> listbygender = cantr.listbygender(gender);
				System.out.println(listbygender);
				break;

			case 6:
				Dao.getallcandiddate();
				cantr = new EciCantroller();
				System.out.println("Enter the age of the candidates");
				int age = sc.nextInt();
				List<Candidate> listbyage = cantr.listbyage(age);
//				System.out.println(listbyage);
			case 7:
				Dao.getallcandiddate();
				cantr = new EciCantroller();
				System.out.println("Enter the Assembly no to get the Particular Candidates with their party name");
				int no = sc.nextInt();
				List<Candidate> listbyassemblyno = cantr.listbyassemblyno(no);
				break;

			}

		} while (option != 7);

	}

}
