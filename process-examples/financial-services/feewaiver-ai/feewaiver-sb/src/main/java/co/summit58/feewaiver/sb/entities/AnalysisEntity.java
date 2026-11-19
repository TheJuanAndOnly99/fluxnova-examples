package co.summit58.feewaiver.sb.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import java.math.BigDecimal;
import java.time.OffsetDateTime;

/**
 * Spring Data JDBC entity. Column types and constraints are defined in src/main/resources/schema.sql.
 * The table name is derived (ANALYSIS_ENTITY): Spring Data JDBC quotes identifiers, so an explicit
 * lower-case name would not match the unquoted table created by schema.sql on H2.
 */
@Table
public class AnalysisEntity {

    @Id
    private Long id;

    private String requestText;

    private Integer priorFeeWaiverCount;

    private BigDecimal feeAmount;

    private Boolean vulnerableCustomer;

    private Boolean regulatorySensitivity;

    private String aiCaseSummary;

    private String aiIntent;

    private String aiRiskLevel;

    private Double aiConfidence;

    private String aiRecommendedAction;

    private String aiReasoningSummary;

    private String policyFlagsJson;

    private Boolean requiresHumanReview;

    private String policyRoute;

    private String finalAction;

    private String triggeredPoliciesJson;

    private String policyExplanation;

    private OffsetDateTime createdAt;

    private String reviewStatus;

    private String reviewDecision;

    private String reviewer;

    private String reviewNotes;

    private OffsetDateTime reviewedAt;

    private String resolutionStatus;

    private Boolean drlEscalate;

    private Boolean drlRequiresReview;

    private String drlReason;

    public Long getId() { return id; }
    public String getRequestText() { return requestText; }
    public void setRequestText(String requestText) { this.requestText = requestText; }

    public Integer getPriorFeeWaiverCount() { return priorFeeWaiverCount; }
    public void setPriorFeeWaiverCount(Integer priorFeeWaiverCount) { this.priorFeeWaiverCount = priorFeeWaiverCount; }

    public BigDecimal getFeeAmount() { return feeAmount; }
    public void setFeeAmount(BigDecimal feeAmount) { this.feeAmount = feeAmount; }

    public Boolean getVulnerableCustomer() { return vulnerableCustomer; }
    public void setVulnerableCustomer(Boolean vulnerableCustomer) { this.vulnerableCustomer = vulnerableCustomer; }

    public Boolean getRegulatorySensitivity() { return regulatorySensitivity; }
    public void setRegulatorySensitivity(Boolean regulatorySensitivity) { this.regulatorySensitivity = regulatorySensitivity; }

    public String getAiCaseSummary() { return aiCaseSummary; }
    public void setAiCaseSummary(String aiCaseSummary) { this.aiCaseSummary = aiCaseSummary; }

    public String getAiIntent() { return aiIntent; }
    public void setAiIntent(String aiIntent) { this.aiIntent = aiIntent; }

    public String getAiRiskLevel() { return aiRiskLevel; }
    public void setAiRiskLevel(String aiRiskLevel) { this.aiRiskLevel = aiRiskLevel; }

    public Double getAiConfidence() { return aiConfidence; }
    public void setAiConfidence(Double aiConfidence) { this.aiConfidence = aiConfidence; }

    public String getAiRecommendedAction() { return aiRecommendedAction; }
    public void setAiRecommendedAction(String aiRecommendedAction) { this.aiRecommendedAction = aiRecommendedAction; }

    public String getAiReasoningSummary() { return aiReasoningSummary; }
    public void setAiReasoningSummary(String aiReasoningSummary) { this.aiReasoningSummary = aiReasoningSummary; }

    public String getPolicyFlagsJson() { return policyFlagsJson; }
    public void setPolicyFlagsJson(String policyFlagsJson) { this.policyFlagsJson = policyFlagsJson; }

    public Boolean getRequiresHumanReview() { return requiresHumanReview; }
    public void setRequiresHumanReview(Boolean requiresHumanReview) { this.requiresHumanReview = requiresHumanReview; }

    public String getPolicyRoute() { return policyRoute; }
    public void setPolicyRoute(String policyRoute) { this.policyRoute = policyRoute; }

    public String getFinalAction() { return finalAction; }
    public void setFinalAction(String finalAction) { this.finalAction = finalAction; }

    public String getTriggeredPoliciesJson() { return triggeredPoliciesJson; }
    public void setTriggeredPoliciesJson(String triggeredPoliciesJson) { this.triggeredPoliciesJson = triggeredPoliciesJson; }

    public String getPolicyExplanation() { return policyExplanation; }
    public void setPolicyExplanation(String policyExplanation) { this.policyExplanation = policyExplanation; }

    public OffsetDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(OffsetDateTime createdAt) { this.createdAt = createdAt; }

    public String getReviewStatus() { return reviewStatus; }
    public void setReviewStatus(String reviewStatus) { this.reviewStatus = reviewStatus; }

    public String getReviewDecision() { return reviewDecision; }
    public void setReviewDecision(String reviewDecision) { this.reviewDecision = reviewDecision; }

    public String getReviewer() { return reviewer; }
    public void setReviewer(String reviewer) { this.reviewer = reviewer; }

    public String getReviewNotes() { return reviewNotes; }
    public void setReviewNotes(String reviewNotes) { this.reviewNotes = reviewNotes; }

    public OffsetDateTime getReviewedAt() { return reviewedAt; }
    public void setReviewedAt(OffsetDateTime reviewedAt) { this.reviewedAt = reviewedAt; }

    public String getResolutionStatus() { return resolutionStatus; }
    public void setResolutionStatus(String resolutionStatus) { this.resolutionStatus = resolutionStatus; }

    public Boolean getDrlEscalate() { return drlEscalate; }
    public void setDrlEscalate(Boolean drlEscalate) { this.drlEscalate = drlEscalate; }

    public Boolean getDrlRequiresReview() { return drlRequiresReview; }
    public void setDrlRequiresReview(Boolean drlRequiresReview) { this.drlRequiresReview = drlRequiresReview; }

    public String getDrlReason() { return drlReason; }
    public void setDrlReason(String drlReason) { this.drlReason = drlReason; }
}