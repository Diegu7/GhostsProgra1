package Proyecto;

public class MainPro {
	public static void main(String[] args){
		Start inicio = new Start();
		Login ingre = new Login();
		
		System.out.println("----------Ghosts----------");
		
		while(true){
			inicio.Starts();
			if(inicio.choice == 1){
				if(ingre.Logins()){
					inicio.MainMens();
					if(inicio.choice2 == 5){
					}					
				}
			}
			else if(inicio.choice == 2){
				ingre.CrearUsu();
			}
			else if(inicio.choice == 3){
				System.out.println("Adios :)");
				break;
			}
			else{
				System.out.println("Error: Comando no valido");
			}
		}
		
	}
}
