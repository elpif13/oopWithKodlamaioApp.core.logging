package oopWithKodlamaioApp.core.logging;

public class FileLogger implements Logger {

	public void log(String data) {
		
		System.out.println("Dosya gönderildi: " + data);
	}
}
