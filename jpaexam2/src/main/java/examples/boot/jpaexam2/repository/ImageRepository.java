package examples.boot.jpaexam2.repository;

import examples.boot.jpaexam2.domain.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ImageRepository extends JpaRepository<Image, Long>{

    @Query("select i from Image i where i.board.no in :boardNoList")
    List<Image> getImagesByBoardNoList(@Param("boardNoList") List<Long> boardNoList);
}
