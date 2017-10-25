package Conexion.BD1.BaseDatos1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(basePackages = "com.backend.entidades")
@ComponentScan(basePackages = {"com.backend.controles"})
public class BaseDatos1Application {

	public static void main(String[] args) {
		SpringApplication.run(BaseDatos1Application.class, args);
	}
}
