package examples.boot.myboard.repository;

import examples.boot.myboard.base.JpaQueryDslPredicateRepository;
import examples.boot.myboard.domain.PersistentLogins;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

// @Repository를 붙이지 않아도 Repository로 등록된다.
public interface PersistentLoginsRepository
        extends JpaQueryDslPredicateRepository<PersistentLogins, String> {

    @Modifying
    @Query("delete from PersistentLogins pl where pl.username = ?1")
    public int deleteByUsername(String username);

}
