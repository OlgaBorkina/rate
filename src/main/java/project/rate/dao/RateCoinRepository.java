package project.rate.dao;


import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.JpaRepository;

import project.rate.model.CoinBtc;
import project.rate.model.CoinStandard;



public interface RateCoinRepository extends JpaRepository <CoinStandard,LocalDateTime>{

	

}
