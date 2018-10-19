package com.xy.repository;

import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.xy.dto.AbsNgariLoanResult;

@Repository
@Table(name="abs_ngari_loan_result")
@Qualifier("absNgariLoanResultRepository")
public interface AbsNgariLoanResultRepository extends CrudRepository<AbsNgariLoanResult, Long > {

}
