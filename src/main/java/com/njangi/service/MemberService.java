package com.njangi.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.njangi.model.Member;
import com.njangi.repository.MemberRepository;

@Service
public class MemberService {
	
	@Autowired
	private MemberRepository memberRepository;
	
	//private List<Member> members= new ArrayList<>(Arrays.asList(
		//	new Member("1","tcheu","kengne","Grace","ruphine@gmail.com","@@@@@","6757676235","buea","student","####"),
			//new Member("2","syn","ken","Grace","ru@gmail.com","@@@@@","675765","buea","student","####"),
			//new Member("3","tcheu","ngum","yace","rue@yahoo.com","@@@@","6757676235","buea","student","####")
			//));
	
	public List<Member> getAllMembers(){
		List<Member> members =new ArrayList<>();
		memberRepository.findAll().forEach(members::add);
		return members;
	}
	
   public Member getMember(String id) {
	   //return members.stream().filter(m -> m.getId().equals(id)).findFirst().get();
   return memberRepository.findOne(id);
   }

 public void addMember(Member member) {
	memberRepository.save(member);
	}

public void updateMember(String id,Member member) {
	memberRepository.save(member);
}

public void deleteMember(String id) {
	memberRepository.delete(id);
}	

}

