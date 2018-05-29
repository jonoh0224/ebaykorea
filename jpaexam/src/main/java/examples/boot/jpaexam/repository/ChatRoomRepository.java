package examples.boot.jpaexam.repository;

import examples.boot.jpaexam.base.JpaQueryDslPredicateRepository;
import examples.boot.jpaexam.domain.ChatRoom;

public interface ChatRoomRepository
        extends JpaQueryDslPredicateRepository<ChatRoom, Long> {
}
