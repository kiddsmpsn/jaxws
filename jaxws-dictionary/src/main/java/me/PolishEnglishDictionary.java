package me;

import javax.jws.WebService;

@WebService(endpointInterface = "me.IPolishEnglishDictionary")
public class PolishEnglishDictionary implements IPolishEnglishDictionary {

	@Override
	public String translate(String word){
		return "en_" + word + "(web service)";
	}
}
