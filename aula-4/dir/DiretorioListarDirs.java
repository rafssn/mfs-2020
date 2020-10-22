  import java.io.File;
public class DiretorioListarArquivos {
	public static void main(String[] args) {
		File diretorio = new File("C:\\Users\\rafag\\Documents\\GitHub\\mfs-2020\\aula-4");
		File[] vetor = diretorio.listFiles(); 
		for(int i = 0; i < vetor.length; i++) {
			String teste = vetor[i].getName();
			  if (teste.endsWith(".java")){
				  System.out.println(" ");
			  } else
			   System.out.println(vetor[i].getName());
		}
	}
}