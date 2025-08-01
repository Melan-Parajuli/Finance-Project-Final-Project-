package com.example.projectFinancial.Repository;

import com.example.projectFinancial.Entity.Financial;
import com.example.projectFinancial.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FinancialRepository extends JpaRepository<Financial, Long> {
    List<Financial> findAllByUser(User user);
}
