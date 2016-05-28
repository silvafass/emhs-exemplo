package br.com.emhs.exemplo;

import java.io.IOException;

import br.com.deployxtech.emhs.core.annotation.Service;
import br.com.deployxtech.emhs.http.server.EmhsServer;

@Service
public class EmhsExemplo {
	
	public String hello() {
		return "Hello World";
	}
	
	public String hello(String nome, Integer idade) {
		return "Ola "+nome+" sua idade é "+idade;
	}
	
	public static void main(String[] args) throws IOException {
		new EmhsServer(8000).start();
	}
}