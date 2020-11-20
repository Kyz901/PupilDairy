package com.schoolDairy.mainDairy.repository;

import com.schoolDairy.mainDairy.model.SchoolClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolClassRepository extends JpaRepository<SchoolClass,Long> {

}
