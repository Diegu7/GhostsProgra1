package Proyecto;

public class Usus {
	String usuario, password, logged;
	int rank;
	public Usus(String usu, String passwor, int ranks, String loggd){//esta es la clase que guarda los datos de los usuarios
		usuario = usu;//aqui se guarda el usuario
		password = passwor;//aqui la contra
		rank = ranks;//aqui el rank
		logged = loggd;//y aqui si el usuario esta logged in
	}
}
