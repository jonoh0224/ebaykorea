package examples.boot.jpaexam.repository;

import examples.boot.jpaexam.base.JpaQueryDslPredicateRepository;
import examples.boot.jpaexam.domain.ImageFile;

public interface ImageFileRepository
        extends JpaQueryDslPredicateRepository<ImageFile, Long> {
}