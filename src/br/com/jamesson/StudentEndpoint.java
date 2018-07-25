package br.com.jamesson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import br.com.jamesson.soap.GetTestRequest;
import br.com.jamesson.soap.GetTestResponse;



@Endpoint
public class StudentEndpoint {
	private static final String NAMESPACE_URI = "http://jamesson.com.br/soap";
	@Autowired
	private TestUtility testUtility;	

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getTestRequest")
	@ResponsePayload
	public GetTestResponse getTest(@RequestPayload GetTestRequest request) {
		
		System.out.println("##### TESTE: " + request.getTestId());
		GetTestResponse response = new GetTestResponse();
		response.setTest(testUtility.getTest(request.getTestId()));
		System.out.println("##### TESTE: " + response.getTest());

		return response;
	}
}
