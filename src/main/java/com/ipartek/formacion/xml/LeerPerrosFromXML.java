package com.ipartek.formacion.xml;

import java.io.File;

import javax.lang.model.element.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.Node;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

/**
 * Leer XML con listado de perros Guardar en ArrayList Mostrar en pantalla
 * 
 * @author Curso
 *
 */
public class LeerPerrosFromXML {

	public static void main(String[] args) {

		File file = new File("\\resources\\Perros.xml");

		// file.exists()
		Document doc = null;
		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			doc = dBuilder.parse(file);
		} catch (Exception e) {
			e.printStackTrace();
		}

		doc.getDocumentElement().normalize();

		NodeList nList = doc.getElementsByTagName("perro");

		for (int i = 0; i < nList.getLength(); i++) {
			Node nNode = (Node) nList.item(i);
	
			System.out.println(nNode.getTextContent());
			//System.out.println(nNode.getNodeName());
			

		}

	}

}
