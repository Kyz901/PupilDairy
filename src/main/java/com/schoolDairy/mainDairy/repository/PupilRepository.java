package com.schoolDairy.mainDairy.repository;

import com.schoolDairy.mainDairy.model.Pupil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PupilRepository extends JpaRepository<Pupil,Long> {


}