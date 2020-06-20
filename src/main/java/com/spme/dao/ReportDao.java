package com.spme.dao;

import com.spme.Entity.ReportEntity;
import com.spme.Entity.ReportMultiKeys;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReportDao extends JpaRepository<ReportEntity, ReportMultiKeys> {
    List<ReportEntity> findAll();
    ReportEntity findByUidAndLabAndStepAndLowerLabAAndQuestionId(String uid, String lab, int step, int lowerLab, int questionId);
}