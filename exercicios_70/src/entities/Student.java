package entities;

public class Student {

	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaFinal;
	
	
	public String gradeFinal() {
		this.notaFinal = this.nota1 + this.nota2 + this.nota3;
		return "FINAL GRADE = " + String.format("%.2f", this.notaFinal) + "\n" +
				this.statusStudent();
	}
	
	public String statusStudent() {
        double missing =0;
		if (this.notaFinal < 60) {
			missing = 60 - this.notaFinal;
			
			return "FAILED" + "\n" +
			       "MISSING " + String.format("%.2f", missing) + " POINTS";
		} 
		else {
			return "PASS";
		}
	}
}
