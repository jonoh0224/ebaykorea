package examples.boot.jpaexam.repository;

import examples.boot.jpaexam.base.JpaQueryDslPredicateRepository;
import examples.boot.jpaexam.domain.UserConnection;

// @Repository를 붙이지 않아도 Repository로 등록된다.
public interface UserConnectionRepository
        extends JpaQueryDslPredicateRepository<UserConnection, Long> {

}
