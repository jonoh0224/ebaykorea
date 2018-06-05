package examples.boot.jpaboard.service;

import examples.boot.jpaboard.domain.Member;

public interface MemberService {
    public Member getMember(Long id);
    public Member addMember(Member member);
}
