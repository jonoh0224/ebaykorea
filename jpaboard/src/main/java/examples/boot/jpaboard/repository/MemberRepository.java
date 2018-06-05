package examples.boot.jpaboard.repository;

import examples.boot.jpaboard.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository
        extends JpaRepository<Member, Long> {

}
