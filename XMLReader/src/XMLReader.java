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
				//optional, but recommended
				//read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
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
				//Node nodeProvincias = DOM.getElementsByTagName("Provincias").item(0);
				//Obtenemos los nodos de nombre "prov" en una lista DOM
				NodeList listNodes = DOM.getElementsByTagName("prov");
				System.out.println("----------------------------");
				System.out.println("INFORMACIÓN CATASTRO");
				System.out.println("----------------------------");
				//Recorremos la lista DOM de nodos nombre ...
				for (int i = 0; i < listNodes.getLength(); i++) {
					//Obtenemos el nodo DOM i-esimo
					Node iNode = listNodes.item(i);
					//Imprimimos el nombre del nodo
					System.out.println("\nNodo Actual :" + iNode.getNodeName());
					
					if (iNode.getNodeType() == Node.ELEMENT_NODE) {
						//System.out.println("Adentro");
						Element eElement = (Element) iNode;
		
						/*System.out.println("Staff id : " + eElement.getAttribute("id"));
						System.out.println("First Name : " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
						System.out.println("Last Name : " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
						System.out.println("Nick Name : " + eElement.getElementsByTagName("nickname").item(0).getTextContent());
						System.out.println("Salary : " + eElement.getElementsByTagName("salary").item(0).getTextContent());
						*/
					}
				}
		    } catch (Exception e) {
		    	e.printStackTrace();
		    }
	}
}
