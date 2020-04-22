package com.farmers.app.repository;

import com.farmers.app.model.Farmer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FarmerRespository extends JpaRepository<Farmer,Long> {
}
