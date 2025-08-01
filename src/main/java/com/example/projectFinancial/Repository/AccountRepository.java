package com.example.projectFinancial.Repository;


import com.example.projectFinancial.Entity.Account;
import com.example.projectFinancial.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    List<Account> findAllByUser(User user);
}
