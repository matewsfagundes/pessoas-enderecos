package br.com.attornatus.pessoasendereco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class PessoasEnderecoApplication {

	@GetMapping
	public String getHomeTeste() {
		return "Gerenciador pessoas e endereços – API Home";
			
		}
	public static void main(String[] args) {
		SpringApplication.run(PessoasEnderecoApplication.class, args);
	}
}