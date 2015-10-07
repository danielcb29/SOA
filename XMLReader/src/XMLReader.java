import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

public class XMLReader {
	
	public static void main(String[] args){
		   try {
			   	//Abrir el archivo xml
				File XMLFile = new File("src/catastro2.xml");
				//Obtenemos el xml en un Document DOM para poder poder procesarlo
				Document DOM = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(XMLFile);
				//Normalizamos la información para poder mostrarla en organizada
				DOM.getDocumentElement().normalize();
				//Imprimimos el elemento raiz del DOM
				System.out.println("Element raiz:" + DOM.getDocumentElement().getNodeName());
				//Obtenemos el nodo provincias para saber de donde obtenemos la información
				Node nodeProvincias = DOM.getElementsByTagName("Provincias").item(0);
				Element provinciasElement = (Element) nodeProvincias; //Casting a Element para poder obtener la información
				//Imprimimos la direccion del servidor xmlns
				System.out.println("Información obtenida de: "+ (provinciasElement.getAttribute("xmlns")));
				//Numero de control provinciero
					//Obtenemos el elemento con del Element provincias
				Element consultaElement = (Element) provinciasElement.getElementsByTagName("consulta_provinciero").item(0);
				Element controlElement = (Element) consultaElement.getElementsByTagName("control").item(0);
				System.out.println("Numero de Control de consulta: "+controlElement.getElementsByTagName("cuprov").item(0).getTextContent()); //Imprimimos el numero descrito en el XML
				//Obtenemos todas las provincias a detallar 
				Element pronvincieroElement = (Element) consultaElement.getElementsByTagName("provinciero").item(0);
				NodeList listProvincias = pronvincieroElement.getElementsByTagName("prov");
				System.out.println("----------------------------");
				System.out.println("INFORMACIÓN CATASTRO");
				System.out.println("----------------------------");
				//Recorremos la lista DOM de nodos nombre ...
				for (int i = 0; i < listProvincias.getLength(); i++) {
					//Obtenemos el nodo DOM i-esimo
					Node iNode = listProvincias.item(i);
					//Imprimimos el nombre del nodo
					System.out.println("\n Tipo de nodo actual :" + iNode.getNodeName());
					if (iNode.getNodeType() == Node.ELEMENT_NODE) {
						Element provElement = (Element) iNode;
						System.out.println("Codigo Postal Provincia : " + provElement.getElementsByTagName("cpine").item(0).getTextContent());
						System.out.println("Nombre Provincia : " + provElement.getElementsByTagName("np").item(0).getTextContent());
					}
				}
		    } catch (Exception e) {
		    	e.printStackTrace();
		    }
	}
}
