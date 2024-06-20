package project.rate.controller;

import java.net.URISyntaxException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import project.rate.dto.RateDtoUSD;
import project.rate.service.RateService;

@RestController
@RequiredArgsConstructor
public class RateController {

	final RateService rateService;
	
	@PostMapping("/coins/map")
	public boolean exchangeRatesCoin () throws URISyntaxException {
		return rateService.exchangeRatesCoin();
	}
	
}
