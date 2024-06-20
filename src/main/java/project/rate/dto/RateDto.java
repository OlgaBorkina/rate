package project.rate.dto;

import java.time.LocalDate;
import java.util.Map;

import lombok.Getter;


@Getter
public class RateDto {
		String base;
		LocalDate date;
		Map<String, Double> rates;
	
}
