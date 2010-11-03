package client;

import org.junit.Test;

public class TestWS {

	@Test
	public  void myTest() throws Exception {
		ProbaStub stub = new ProbaStub("http://localhost:8080/axis2/services/proba");

		// Send the request
		ProbaStub.SayHello request = new ProbaStub.SayHello();
		// String anInput = new String();
		// anInput.setName("subin");
		request.setName("aaaaa");

		// Get the response
		ProbaStub.SayHelloResponse response = stub.sayHello(request);
		String anOutput = response.get_return();

		System.out.println(anOutput);
		System.out.println("aaaaaaaa");
	}

}
