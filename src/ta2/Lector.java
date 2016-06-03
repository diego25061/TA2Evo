/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta2;

/**
 *
 * @author diego
 */
import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
import org.xml.sax.SAXException;

public class Lector {
	
	public static String leer(String tag, String subtag){

	      try {	
	         File inputFile = new File("xml//valores.xml");
	         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	         Document doc = dBuilder.parse(inputFile);
	         doc.getDocumentElement().normalize();
	         
	         NodeList nList = doc.getElementsByTagName(tag);
	         Node nNode = nList.item(0);
	         
	         Element e = (Element) nNode;
	            return e.getElementsByTagName(subtag).item(0).getTextContent();
	         
	      } catch (Exception e) {
                  e.printStackTrace();
              }
		return null;

	}
	 
}