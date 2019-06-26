package com.ipartek.formacion.xml;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.*;

/**
 * 
 * 
 * @see https://www.tutorialspoint.com/java_xml/java_dom_parse_document.htm
 * @author Curso
 *
 */

public class EstudiantesXML {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance(); // Singleton
		DocumentBuilder builder = factory.newDocumentBuilder();

		// Similar a String pero preparado para trabajar con string grandes o ficheros
		// de texto
		StringBuilder xmlStringBuilder = new StringBuilder();
		xmlStringBuilder.append(
				"<?xml version=\"1.0\"?><perro><nombre>Rataplant</nombre><edad>45</edad></perro>");
		ByteArrayInputStream input = new ByteArrayInputStream(xmlStringBuilder.toString().getBytes("UTF-8"));
		Document doc = builder.parse(input);

		Element elementPerro = doc.getDocumentElement();
		NodeList nodes = elementPerro.getChildNodes();

		String nombre = nodes.item(0).getTextContent();
		String edad = nodes.item(1).getTextContent();

		System.out.println("haber que sacamos del perro");

		

	}

}
