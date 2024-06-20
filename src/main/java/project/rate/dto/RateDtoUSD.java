package project.rate.dto;

import java.time.LocalDate;
import java.util.Map;

import lombok.Getter;


@Getter
public class RateDtoUSD {
	LocalDate date;
	Map<String, Double> usd;

}
