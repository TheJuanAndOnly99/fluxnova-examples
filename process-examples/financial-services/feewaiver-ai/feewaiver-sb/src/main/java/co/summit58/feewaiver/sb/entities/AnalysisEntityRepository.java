package co.summit58.feewaiver.sb.entities;

import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface AnalysisEntityRepository extends ListCrudRepository<AnalysisEntity, Long> {

    List<AnalysisEntity> findByReviewStatusOrderByCreatedAtDesc(String reviewStatus);
}