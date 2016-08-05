package Proyecto;
import java.util.Scanner;

public class Login {
	Scanner scan = new Scanner(System.in);
	String usuIngr, passIngr, nuevoUsu, nuevoCont, nuevoCont2;
	Usus usu1 = new Usus("null", "null", 0, "no");
	Usus usu2 = new Usus("null", "null", 0, "no");
	Usus usu3 = new Usus("null", "null", 0, "no");
	Usus usu4 = new Usus("null", "null", 0, "no");
	Usus usu5 = new Usus("null", "null", 0, "no");
			
	
	public boolean Logins(){
		while(true){
			System.out.print("Ingrese su usuario:\n-");
			usuIngr = scan.next();
			System.out.print("Ingrese su contraseña:\n-");
			passIngr = scan.next();
			if(usuIngr.equals(usu1.usuario) && passIngr.equals(usu1.password)){
				usu1.logged = "main";
				return true;
			}
			else if(usuIngr.equals(usu2.usuario) && passIngr.equals(usu2.password)){
				usu2.logged = "main";
				return true;
			}
			else if(usuIngr.equals(usu3.usuario) && passIngr.equals(usu3.password)){
				usu3.logged = "main";
				return true;
			}
			else if(usuIngr.equals(usu4.usuario) && passIngr.equals(usu4.password)){
				usu4.logged = "main";
				return true;
			}
			else if(usuIngr.equals(usu5.usuario) && passIngr.equals(usu5.password)){
				usu5.logged = "main";
				return true;
			}
			else{
				System.out.println("Usuario o contraseña incorrecta.");
				return false;
			}
		}
	}
	
	public void CrearUsu(){
		System.out.print("Nombre del usuario:\n-");
		nuevoUsu = scan.next();
		if(nuevoUsu.equals(usu1.usuario) || nuevoUsu.equals(usu2.usuario) || nuevoUsu.equals(usu3.usuario) || nuevoUsu.equals(usu4.usuario) || nuevoUsu.equals(usu5.usuario)){
			System.out.println("Usuario ya esta tomado");
		}
		else{
			System.out.print("Contraseña:\n-");
			nuevoCont = scan.next();
			System.out.print("Repita la contraseña:\n-");
			nuevoCont2 = scan.next();
			if(nuevoCont.equals(nuevoCont2)){
				if(usu1.usuario.equals("null")){
					usu1.usuario = nuevoUsu;
					usu1.password = nuevoCont;
					System.out.println("Usuario creado exitosamente!");
				}
				else if(usu2.usuario.equals("null")){
					usu2.usuario = nuevoUsu;
					usu2.password = nuevoCont;
					System.out.println("Usuario creado exitosamente!");
				}
				else if(usu3.usuario.equals("null")){
					usu3.usuario = nuevoUsu;
					usu3.usuario = nuevoCont;
					System.out.println("Usuario creado exitosamente!");
				}
				else if(usu4.usuario.equals("null")){
					usu4.usuario = nuevoUsu;
					usu4.password = nuevoCont;
					System.out.println("Usuario creado exitosamente!");
				}
				else if(usu5.usuario.equals("null")){
					usu5.usuario = nuevoUsu;
					usu5.usuario = nuevoCont;
					System.out.println("Usuario creado exitosamente!");
				}
				else{
					System.out.println("Error: Hay demasiados usuarios");
				}
			}
			else{
				System.out.println("Las contraseñas no coinciden");
			}
		}

	}
	

}
