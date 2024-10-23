import java.util.Scanner;

class Paciente {
    private double peso;
    private double altura;
    private String nombre;

    public Paciente(String nombre, double peso, double altura) {
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public String getDiagnostico() {
        double imc = calcularIMC();
        if (imc < 18.5) {
            return "BAJO PESO";
        } else if (imc >= 18.5 && imc <= 24.9) {
            return "PESO NORMAL";
        } else if (imc >= 25 && imc <= 29.9) {
            return "SOBREPESO";
        } else if (imc >= 30 && imc <= 34.9) {
            return "OBESIDAD TIPO 1";
        } else if (imc >= 35 && imc <= 39.9) {
            return "OBESIDAD TIPO 2";
        } else {
            return "OBESIDAD TIPO 3";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Introduce tu nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Introduce tu peso en kilogramos: ");
            double peso = scanner.nextDouble();

            System.out.print("Introduce tu altura en metros: ");
            double altura = scanner.nextDouble();

            Paciente paciente = new Paciente(nombre, peso, altura);

            System.out.println(paciente.getNombre() + ", tu diagnóstico es: " + paciente.getDiagnostico());

        } catch (Exception e) {
            System.out.println("Error: Entrada inválida. Asegúrate de introducir los valores correctos.");
        } finally {
            scanner.close();
        }
    }
}