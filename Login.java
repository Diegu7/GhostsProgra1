package Proyecto;
import java.util.Scanner;

public class Login {//un pije vergue de codigo
	Scanner scan = new Scanner(System.in);
	String usuIngr, passIngr, nuevoUsu, nuevoCont, nuevoCont2;//declaro variables
	Usus usu1 = new Usus("null", "null", 0, "no");//declaro 5 instancias de la clase usus, que es donde guardo datos
	Usus usu2 = new Usus("null", "null", 0, "no");//cada una de estas instancias guarda un usuario, significa que nuestro
	Usus usu3 = new Usus("null", "null", 0, "no");//juego solo aguanta 5 usuarios
	Usus usu4 = new Usus("null", "null", 0, "no");
	Usus usu5 = new Usus("null", "null", 0, "no");
			
	
	public boolean Logins(){//una funcion que devuelve una booleana que se usa cuando se intenta un login
		System.out.print("Ingrese su usuario:\n-");
		usuIngr = scan.next();//el usuario que intenta hacer login
		System.out.print("Ingrese su contraseña:\n-");
		passIngr = scan.next();//la contra que intenta login
		if(usuIngr.equals(usu1.usuario) && passIngr.equals(usu1.password)){//todos estos ifs comparan el ingresado con
			usu1.logged = "main";
			return true;
		}
		else if(usuIngr.equals(usu2.usuario) && passIngr.equals(usu2.password)){//un usuario y contrasena existente
			usu2.logged = "main";
			return true;
		}
		else if(usuIngr.equals(usu3.usuario) && passIngr.equals(usu3.password)){//si se hace login exitosamente
			usu3.logged = "main";
			return true;
		}
		else if(usuIngr.equals(usu4.usuario) && passIngr.equals(usu4.password)){//la funcion devuelve true y el estado
			usu4.logged = "main";
			return true;
		}
		else if(usuIngr.equals(usu5.usuario) && passIngr.equals(usu5.password)){//de la dicha cuenta se vuelve a main
			usu5.logged = "main";
			return true;
		}
		else{
			System.out.println("Usuario o contraseña incorrecta.");//si no se hace login exitosamente el booleano es false
			return false;
		}
		
	}
	
	public void CrearUsu(){//esta es la funcion que ayuda a crear usuarios, otro pijeo
		System.out.print("Nombre del usuario:\n-");//pide el usuario que se crea
		nuevoUsu = scan.next();
		if(nuevoUsu.equals(usu1.usuario) || nuevoUsu.equals(usu2.usuario) || nuevoUsu.equals(usu3.usuario) || nuevoUsu.equals(usu4.usuario) || nuevoUsu.equals(usu5.usuario)){
			System.out.println("Usuario ya esta tomado");
		}//si ya hay un usuario con ese nombre, no te deja crearlo
		else{
			System.out.print("Contraseña:\n-");//pide contrasena
			nuevoCont = scan.next();
			System.out.print("Repita la contraseña:\n-");//pide que confirmes la contrasena
			nuevoCont2 = scan.next();
			if(nuevoCont.equals(nuevoCont2)){//si las contrasenas coinciden empieza a buscar un usuario disponible
				if(usu1.usuario.equals("null")){//y cuando lo encuentra guarda el usuario y la contrasena
					usu1.usuario = nuevoUsu;
					usu1.password = nuevoCont;
					System.out.println("Usuario creado exitosamente!");//e imprime que se creo exitosamente
				}
				else if(usu2.usuario.equals("null")){//todo esto es super spaghetti
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
				System.out.println("Las contraseñas no coinciden");//de ser que las contrasenas no coincidan tira un error
			}
		}

	}
	

}
