package com.softmelon.sofy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.softmelon.sofy.entity.Hr;

@Repository
public interface HrRepository extends JpaRepository<Hr, Long> {

}
