
package com.portfolio.norberto.repository;

import com.portfolio.norberto.model.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsRepository extends JpaRepository<Skills, Long>{
    
}
