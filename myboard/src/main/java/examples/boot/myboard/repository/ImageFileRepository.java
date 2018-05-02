package examples.boot.myboard.repository;

import examples.boot.myboard.base.JpaQueryDslPredicateRepository;
import examples.boot.myboard.domain.ImageFile;

public interface ImageFileRepository
        extends JpaQueryDslPredicateRepository<ImageFile, Long> {
}