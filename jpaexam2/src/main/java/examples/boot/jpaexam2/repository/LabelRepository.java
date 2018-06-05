package examples.boot.jpaexam2.repository;

import examples.boot.jpaexam2.domain.Label;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LabelRepository extends JpaRepository<Label, Long> {
}
