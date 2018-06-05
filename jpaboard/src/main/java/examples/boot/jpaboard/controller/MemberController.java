package examples.boot.jpaboard.controller;

import examples.boot.jpaboard.domain.Member;
import examples.boot.jpaboard.domain.MemberRole;
import examples.boot.jpaboard.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
@RequestMapping("/members")
public class MemberController {
    @Autowired
    MemberService memberService;

    @GetMapping(path = "/joinform")
    public String joinform(){
        return "members/joinform";
    }

    @PostMapping
    public String join(@ModelAttribute Member member){
        member.setRegdate(LocalDateTime.now());

        member = memberService.addMember(member);
        System.out.println(member.getId());
        System.out.println(member.getName());

        return "redirect:/members/welcome";
    }

    @GetMapping(path="/welcome")
    public String welcome(){
        return "members/welcome";
    }
}
