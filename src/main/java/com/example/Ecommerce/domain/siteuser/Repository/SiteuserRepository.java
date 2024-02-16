package com.example.Ecommerce.domain.siteuser.Repository;

import com.example.Ecommerce.domain.siteuser.Entity.Siteuser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SiteuserRepository extends JpaRepository<Siteuser, Integer> {
}
