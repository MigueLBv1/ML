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
 }