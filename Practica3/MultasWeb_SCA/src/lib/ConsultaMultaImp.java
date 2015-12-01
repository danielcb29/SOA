package lib;

import java.util.ArrayList;
import java.util.Vector;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.Holder;

import org.osoa.sca.annotations.Service;

import api.ConsultaMulta;
import api.DetalleMulta;
/**
 * Clase que permite hacer el web service , metodos de inicializacion y metodos web
 * @author Daniel Correa Barrios
 *
 */
@Service(ConsultaMulta.class) //Especifica que su service sera la clase ConsultaMulta
public class ConsultaMultaImp implements ConsultaMulta{
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
	public ConsultaMultaImp(){
		multasDB = inicializarMultas(); //Asginamos los registros con los datos inicializados
	}
	
	@WebMethod
	public boolean consultaMulta(String placa){
		boolean flag = false; //Bandera permite saber si encontramos o no la multa, nos basamos en el hecho de que aun no la encontramos = false
		int i = 0; //contador que permite recorrer los registros de multas
		while(!flag && i<multasDB.size()){ //Mientras no lo encontremos aun tengamos registros buscamos
			Multa m = multasDB.get(i); //Obtenemos la multa i
			if(m.getCoche().getPlaca().equalsIgnoreCase(placa)){ //Buscamos si es la que solicitan
				flag = true; //Caso verdadero, flag=true lo encontramos
			}
			i++; //pasamos al registro siguiente
		}
		return flag; //una vez terminada la busqueda retornamos nuestra bandera 
	}
	
	
	
}
