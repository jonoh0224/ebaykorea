package examples.boot.jpaboard.controller;

import examples.boot.jpaboard.domain.Member;
import examples.boot.jpaboard.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/members")
public class MemberApiController {
    @Autowired
    MemberService memberService;

    @GetMapping
    public List<Member> getMembers(){
        return memberService.getMembers();
    }

    @GetMapping(path = "/{id}")
    public Member getMember(@PathVariable(name="id") Long id){
        return memberService.getMember(id);
    }
}
