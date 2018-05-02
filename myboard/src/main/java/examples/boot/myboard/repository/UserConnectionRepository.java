package examples.boot.myboard.repository;

import examples.boot.myboard.base.JpaQueryDslPredicateRepository;
import examples.boot.myboard.domain.UserConnection;

// @Repository를 붙이지 않아도 Repository로 등록된다.
public interface UserConnectionRepository
        extends JpaQueryDslPredicateRepository<UserConnection, Long> {

}
