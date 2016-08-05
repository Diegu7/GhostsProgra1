package Proyecto;

public class MainPro {
	public static void main(String[] args){
		Start inicio = new Start();//declaro la clase Start
		Login ingre = new Login();//declaro la clase login
		
		System.out.println("----------Ghosts----------");//titulo
		
		while(true){//loop para que cuando una de las opciones termine de correr no se apaque el programa
			inicio.Starts();//llamo la funcion starts() de la clase inicio
			if(inicio.choice == 1){//si elige login
				if(ingre.Logins()){//ingre.Logins es una funcion que devuelve un booleano, true si hizo login, false si fallo
					inicio.MainMens();//el main menu
					if(inicio.choice2 == 5){
					}					
				}
			}
			else if(inicio.choice == 2){//si elige crear un usuario
				ingre.CrearUsu();//se llama la funcion crearusu
			}
			else if(inicio.choice == 3){
				System.out.println("Adios :)");//si elige cerrar el programa el loop se rompe
				break;
			}
			else{
				System.out.println("Error: Comando no valido");//por si elige un numero que no es 1-3
			}
		}
		
	}
}
