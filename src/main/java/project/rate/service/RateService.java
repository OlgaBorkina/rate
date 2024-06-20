package project.rate.service;

import java.net.URISyntaxException;

import project.rate.dto.RateDtoUSD;

public interface RateService {
	
	boolean exchangeRatesCoin() throws URISyntaxException;

}
