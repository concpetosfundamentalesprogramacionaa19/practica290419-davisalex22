package ejerciciomatricula;
import java.util.Scanner;
import porcentajes.descuentos;
public class Principal {
    public static void main(String[] args) {
// Inicio- importacion de Scanner   
Scanner entrada = new Scanner(System.in);
// Declaracion de variables
double matricula = 1330;
int ciudad = 0;
int estado = 0;
int carga = 0;
int edad = 0;
double pago1 = 0;
double pago2 = 0;
double pago3 = 0;
double pago4 = 0;
double total = 0;
double aument = 0;
// Ingreso de datos por teclado
    System.out.println("Eliga su ciudad de origen:(Ingrese la respuesta "
                                                      + "correcta)\n"  + "\n" +
                       "  (1)  Loja."+ "\n" +
                       "  (2)  Zamora."+ "\n" + 
                       "  (3)  Otras. "); 
    ciudad = entrada.nextInt();
    
    System.out.println("Ingrese su edad: "); 
    edad = entrada.nextInt();
    
    System.out.println("Eliga su ciudad de origen:(Ingrese la respuesta "
                                                      + "correcta)\n"  + "\n" +
                       "  (1)  Soltero."+ "\n" +
                       "  (2)  Casado. "); 
    estado = entrada.nextInt();
    System.out.println("¿Tiene usted cargas familiares?(Ingrese la respuesta "
                                                      + "correcta)\n"  + "\n" +
                       "  (1)  Si."+ "\n" +
                       "  (2)  No. ");
    carga = entrada.nextInt();
// Realización de condicionales
    if (ciudad == 1 || ciudad == 2) {
        pago1 = matricula - descuentos.desc_ciudad;     
        }    
    if (edad >= 17 && edad < 20) {
        pago2 = pago1 - descuentos.desc_edad;    
        } 
    if (estado == 2) {
        pago3 = pago2 - descuentos.desc_estado;   
        } 
    if (carga == 1) {
        pago4 = pago3 - descuentos.desc_carga;    
        } 
// Calculo de el cargo por procesos administrativos    
aument= pago4   * 0.02;
total = aument + pago4;
        System.out.printf("El valor a cancelar por la matricula es: S$ %.2f\n",
                total);
    
// Fin
    }}