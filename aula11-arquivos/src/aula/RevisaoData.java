package aula;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RevisaoData {

	public static void main(String[] args) {
		
		Instant data = Instant.now();
		//System.out.println(data);
		
		LocalDateTime dataHora = LocalDateTime.of(2024,9,10,18,10);
		
		System.out.println(dataHora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm a")));
		
	}

}
