package streams;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Reduce {

	public static void main(String[] args) throws IOException {
		
		Path path1 = Paths.get("texto.txt");
		String texto = "";
		try(Stream<String> lineas = Files.lines(path1)) {
			texto = lineas.map(l -> l.replaceAll(".",""))
			.reduce("", (l1,l2) -> l1.concat("\n").concat(l2));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("texto2.txt"))) {
			bw.write(texto);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
