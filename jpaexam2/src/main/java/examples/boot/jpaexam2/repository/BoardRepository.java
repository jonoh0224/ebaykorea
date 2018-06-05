package examples.boot.jpaexam2.repository;

import examples.boot.jpaexam2.domain.Board;
import examples.boot.jpaexam2.repository.custom.BoardRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BoardRepository
        extends JpaRepository<Board, Long>, BoardRepositoryCustom {
    @Query("select distinct b from Board b join fetch b.labels")
    List<Board> getBoardList();
}
