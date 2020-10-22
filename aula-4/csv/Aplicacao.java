import java.io.IOException;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.net.URL;

public class Aplicacao {
	public static void main(String[] args) throws IOException {
		URL url = new URL("http://repositorio.dados.gov.br/educacao/CADASTRO%20DAS%20IES_2011.csv");

		File local = new File("C:\\Users\\rafag\\Desktop\\new.csv");
		InputStream url_uso = url.openStream();
		FileOutputStream novo_arq = new FileOutputStream(local);
		int bytes = 0;
		while ((bytes = url_uso.read()) != -1) {
			novo_arq.write(bytes);
		}
		url_uso.close();
		novo_arq.close();
		
		
		BufferedReader buffRead = new BufferedReader(new FileReader(local));
		String linha = "";
		while (true) {
			if (linha != null) {
				System.out.println(linha);

			} else
				break;
			linha = buffRead.readLine();
		}
		buffRead.close();

		
	}
}