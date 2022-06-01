package streams;

import java.util.Arrays;
import java.util.List;

import metodosreferenciados.Persona;

public class Count {

	public static void main(String[] args) {
		List<Persona> personas = 
				Arrays.asList( new Persona("Oscar",23)
						,new Persona ("Pepe",24)
						,new Persona ("Eva",14)
						,new Persona ("Tamara",44)
						,new Persona ("David",10));
		
		System.out.println("Existen " +personas.stream().count()+ " personas");
	}
}
