public class Matriz {

public static void main(String[] args) {
	double[][] notasAlunos = new double[1][4];
	double media = 0;
	double c = 0;
	notasAlunos[0][0] = 10;
	notasAlunos[0][1] = 7;
	notasAlunos[0][2] = 9;
	notasAlunos[0][3] = 9.5;
	
	for (int i = 0; i < notasAlunos.length; i++) {
	// System.out.print(notasAlunos[i] + " ");
		for (int j = 0; j < notasAlunos[i].length; j++) {
			media = notasAlunos[i][j] + c;
			c = media;
		}
		
	}
	media = c / 4;
	System.out.println(media);
}
}