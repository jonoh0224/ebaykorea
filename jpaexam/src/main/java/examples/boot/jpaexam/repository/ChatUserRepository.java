package examples.boot.jpaexam.repository;

import examples.boot.jpaexam.base.JpaQueryDslPredicateRepository;
import examples.boot.jpaexam.domain.ChatUser;

public interface ChatUserRepository
        extends JpaQueryDslPredicateRepository<ChatUser, Long> {
}
