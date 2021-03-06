package com.qrcodeteam.utilitaire;

import java.util.HashMap;
import java.util.Map;

public class JsonResponse {
	
	   private boolean validated;
	   private Map<String, String> errorMessages;
	   private Map<String, String> successMessages;
	   
	   
	public JsonResponse(boolean validated, Map<String, String> errorMessages, Map<String, String> successMessages) {
		this.validated = validated;
		this.errorMessages = errorMessages;
		this.successMessages = successMessages;
	}
	
	public JsonResponse() {
		this.validated=false;
		this.errorMessages=new HashMap<String,String>();
		this.successMessages=new HashMap<String,String>();
	}


	public boolean isValidated() {
		return validated;
	}


	public void setValidated(boolean validated) {
		this.validated = validated;
	}


	public Map<String, String> getErrorMessages() {
		return errorMessages;
	}


	public void setErrorMessages(Map<String, String> errorMessages) {
		this.errorMessages = errorMessages;
	}


	public Map<String, String> getSuccessMessages() {
		return successMessages;
	}


	public void setSuccessMessages(Map<String, String> successMessages) {
		this.successMessages = successMessages;
	}
	   
	   
	   
}
