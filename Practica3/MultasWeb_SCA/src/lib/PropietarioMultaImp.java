package lib;

import java.util.ArrayList;
import java.util.Vector;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.Holder;

import org.osoa.sca.annotations.Service;

import api.MultasService;
import api.PropietarioMulta;
/**
 * Clase que permite hacer el web service , metodos de inicializacion y metodos web
 * @author daniel
 *
 */
@Service(PropietarioMulta.class)
public class PropietarioMultaImp implements PropietarioMulta {
	//Datos estaticos para vehiculos
	private String[] placas = {"ZNL538","VCD709","CFN150","SSH485","HEP908"};
	private String[] marcas = {"Jinbei","KIA","Chevrolet","Mazda","Volvo"};
	private String[] years = {"2015","2003","1995","2010","2013"};
	
	//Datos estaticos para propietarios
	private String[] nombres = {"Daniel","Jairo","Camilo","Alejandra","Gloria"};
	private String[] apellidos = {"Correa", "Ardila","Marulanda","Grisales","Mora"};
	private String[] dni = {"1144067772","1143567812","1140034897","1144340675","31872462"};
	
	//Datos estaticos para multas
	private Integer[] valores = {15,200,129,7,22};
	private String[] meses = {"Enero","Marzo","Mayo","Abril","Noviembre"};
	private Vector<Multa> multasDB;
	
	//Inicializacion de vehiculos para prueba
	private Vector<Vehiculo> iniciarlizarVehiculos(){
		Vector<Vehiculo> vehiculos = new Vector<Vehiculo>();
		for(int i=0;i<placas.length;i++){
			Vehiculo v = new Vehiculo(placas[i],marcas[i],years[i]);
			vehiculos.add(v);
		}
		return vehiculos;
		
	}
	
	//Inicializacion de propietarios para prueba
	private Vector<Propietario> inicializarPropietarios(){
		Vector<Propietario> propietarios = new Vector<Propietario>();
		for(int i=0; i<nombres.length;i++){
			Propietario p = new Propietario(nombres[i],apellidos[i],dni[i]);
			propietarios.add(p);
		}
		return propietarios;
	}
	
	//Inicializacion de registros de multas para prueba
	private Vector<Multa> inicializarMultas(){
		Vector<Propietario> propietarios = inicializarPropietarios();
		Vector<Vehiculo> vehiculo = iniciarlizarVehiculos();
		Vector<Multa> multas = new Vector<Multa>();
		for(int i=0; i< valores.length; i++){
			Multa m = new Multa(vehiculo.get(i), valores[i],propietarios.get(i),meses[i]);
			multas.add(m);
		}
		return multas; 
	}
	
	//Constructor
	public PropietarioMultaImp(){
		multasDB = inicializarMultas(); //Asginamos los registros con los datos inicializados
	}
	
	@WebMethod
	public String propietarioMulta(String mes,String placa){
		Propietario p = new Propietario("No encontrado","No encontrado","No encontrado"); //Inicializamos el propietario en no encontrado en caso que la busqueda sea fallida
		for(int i=0;i<multasDB.size();i++){ //Buscamos en los registros de multas la informacion solicitada
			Multa m = multasDB.get(i); //Obtenemos la multa
			if(m.getCoche().getPlaca().equalsIgnoreCase(placa) && m.getMes().equalsIgnoreCase(mes)){ //Comparamos si es el registro que buscamos
				p = m.getPropietario(); //En caso de serlo lo asignamos
			}
		}
		return p.getNombre()+"-"+p.getApellido()+"-"+p.getDNI(); //retornamos el registro encontrado o el inicial con la info de no encontrado
	}
	
	
}
