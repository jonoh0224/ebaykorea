package jpabook.start;

import javax.persistence.*;
import java.util.List;

/**
 * @author holyeye
 */
public class JpaMain {

    public static void main(String[] args) {

        //엔티티 매니저 팩토리 생성
        // META-INF/persistence.xml파일을 기본 설정파일로 사용한다.
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpabook");
        EntityManager em = emf.createEntityManager(); //엔티티 매니저 생성

        EntityTransaction tx = em.getTransaction(); //트랜잭션 기능 획득

        try {

            // jpa사용시 항상 트랜잭션안에서 로직이 수행되야 한다.
            tx.begin(); //트랜잭션 시작
            logic(em);  //비즈니스 로직

            tx.commit();//트랜잭션 커밋


        } catch (Exception e) {
            e.printStackTrace();
            tx.rollback(); //트랜잭션 롤백
        } finally {
            em.close(); //엔티티 매니저 종료
        }

        emf.close(); //엔티티 매니저 팩토리 종료
    }

    public static void logic(EntityManager em) {

        String id = "id1";
        Member member = new Member();
//        member.setId(id);
        member.setUsername("지한");
        member.setAge(2);

        //등록
        em.persist(member);
        System.out.println("---------------------------");

        em.detach(member);
        member.setAge(50);
        em.merge(member); // em.persist(member)는 오류가 발생한다.
        //수정
//        member.setAge(20);
//
//        //한 건 조회
//        Member findMember = em.find(Member.class, id);
//        System.out.println("findMember=" + findMember.getUsername() + ", age=" + findMember.getAge());
//
//        //목록 조회
//        List<Member> members = em.createQuery("select m from Member m", Member.class).getResultList();
//        System.out.println("members.size=" + members.size());
//
//        //삭제
//        em.remove(member);

    }
}
