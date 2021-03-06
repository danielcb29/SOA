package multas_service;

import java.util.ArrayList;
import java.util.Vector;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.Holder;
/**
 * Clase que permite hacer el web service , metodos de inicializacion y metodos web
 * @author daniel
 *
 */
@WebService
public class ServiciosMulta {
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
	public ServiciosMulta(){
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
	
	@WebMethod
	public Propietario propietarioMulta(String mes,String placa){
		Propietario p = new Propietario("No encontrado","No encontrado","No encontrado"); //Inicializamos el propietario en no encontrado en caso que la busqueda sea fallida
		for(int i=0;i<multasDB.size();i++){ //Buscamos en los registros de multas la informacion solicitada
			Multa m = multasDB.get(i); //Obtenemos la multa
			if(m.getCoche().getPlaca().equalsIgnoreCase(placa) && m.getMes().equalsIgnoreCase(mes)){ //Comparamos si es el registro que buscamos
				p = m.getPropietario(); //En caso de serlo lo asignamos
			}
		}
		return p; //retornamos el registro encontrado o el inicial con la info de no encontrado
	}
	
	@WebMethod
	public ArrayList<Integer> consultaMultaMeses(ArrayList<String> meses,String placa){
		
		ArrayList<Integer> valores = new ArrayList<Integer>(); //arreglo con los valores de las multas
		boolean flag; //bandera que nos ayudara a saber si encontramos o no la multa
		for(int i=0; i<meses.size();i++){ //recorremos el arreglo de meses
			flag = false; //partimos del hecho que no hemos encontrado la multa
			for(int j=0; j<multasDB.size();j++){ //buscamos la multa en los registros
				if(multasDB.get(j).getMes().equalsIgnoreCase(meses.get(i))){ //comparamos para buscarla
					valores.add(multasDB.get(j).getValor()); //si la encontrados añadimos el valor de la multa
					flag=true; //la encontramos
					break; //no necesitamos seguir buscando
				}
			}
			if(!flag){ //preguntar si efectivamente la encontramos
				valores.add(0); //si no la encontramos se ingresa un 0 que seria el valor de la multa no encontrada
			}
		}
		
		return valores; //retornamos los valores de las multas
	}
	
	@WebMethod
	public void detalleMulta(String dni , String mes, @WebParam(mode=WebParam.Mode.OUT) Holder<Integer> valor, @WebParam(mode=WebParam.Mode.OUT) Holder<Propietario> prop, @WebParam(mode=WebParam.Mode.OUT) Holder<Vehiculo> vehi){
		Propietario p = new Propietario("No encontrado","No encontrado","No encontrado"); //Inicializamos el propietario en no encontrado en caso que la busqueda sea fallida
		Vehiculo v = new Vehiculo("No encontrado","No encontrado","No encontrado");//Inicializamos el vehiculo en caso de no encontrarlo
		Multa m = new Multa(v,0,p,"No encontrado"); //Inicializamos la multa en caso de no encontrarla
		
		for(int i=0;i<multasDB.size();i++){ //Recorremos los registros de multas
			Multa mbuscada = multasDB.get(i); //Traermos la i-esima multa
			if(mbuscada.getPropietario().getDNI().equalsIgnoreCase(dni) && mbuscada.getMes().equalsIgnoreCase(mes)){ //Comparamos para ver si es la que necesitamos
				m = mbuscada; //En caso de serla la asignamos
				p = m.getPropietario(); //Obtenemos el propietario y lo asignamos
				v = m.getCoche(); //Obtenemos el vehiculo y lo asignamos
			}
		}

		//Utilizamos los tipo Holder para retornar varios valores
		valor.value = m.getValor();  
		prop.value = p;
		vehi.value = v;
	}
	
}
