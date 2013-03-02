package me.client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import me.IPolishEnglishDictionary;

public class WSClient {

	public static void main(String[] args) throws Exception{
		URL url = new URL("http://localhost:8080/jaxws-dictionary/dictionary?wsdl");
		QName qname = new QName("http://me/", "PolishEnglishDictionaryService");
		
		Service service = Service.create(url, qname);
		
		IPolishEnglishDictionary dic = service.getPort(IPolishEnglishDictionary.class);
		System.out.println(dic.translate("kuniec"));
	}
}
