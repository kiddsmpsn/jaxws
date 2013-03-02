package me;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface IPolishEnglishDictionary {
	@WebMethod
	public String translate(String word);
}
