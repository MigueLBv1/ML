public class ActividadesMetodos {
 
    // Método para mostrar un mensaje
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
 
    // Método para mostrar los días de la semana
    public void mostrarDiasSemana() {
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        for (String dia : dias) {
            System.out.println(dia);
        }
    }
 
    // Método para imprimir la tabla de multiplicar
    public void imprimirTablaMultiplicar(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
 
    // Método main
    public static void main(String[] args) {
        ActividadesMetodos actividad = new ActividadesMetodos();
        actividad.mostrarMensaje("¡Hola, bienvenido a la actividad!");
        actividad.mostrarDiasSemana();
        actividad.imprimirTablaMultiplicar(5); // Cambia el número según sea necesario
    }
}