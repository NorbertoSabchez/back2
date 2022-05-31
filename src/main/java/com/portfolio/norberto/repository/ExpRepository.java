
package com.portfolio.norberto.repository;

import com.portfolio.norberto.model.Exp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpRepository extends JpaRepository<Exp, Long> {
    
}
