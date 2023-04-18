package com.learnar.activityService.repository;



import com.learnar.activityService.models.Activities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityRepository extends JpaRepository<Activities,Long> {
}
