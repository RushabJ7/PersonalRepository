import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Socket socket = null;
		InputStreamReader inputstreamReader = null; 
		OutputStreamWriter outputStreamWriter = null; 
		BufferedReader bufferedReader = null; //Optimize the communication 
		BufferedWriter bufferedWriter = null;
		
		try {
			socket = new Socket("localhost",1234);
			
			
			inputstreamReader = new InputStreamReader(socket.getInputStream()); //Reading data
			outputStreamWriter = new OutputStreamWriter(socket.getOutputStream()); //Sending data
			
			bufferedReader = new BufferedReader(inputstreamReader);
			bufferedWriter = new BufferedWriter(outputStreamWriter);
			System.out.println("Connection active");
			System.out.println("Press 1 if connection is lost");
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			
			while(true) {
				
				String msgtoSend = scanner.nextLine();
				bufferedWriter.write(msgtoSend);
				bufferedWriter.newLine();
				bufferedWriter.flush();
				
				System.out.println("Server: " + bufferedReader.readLine()); 	
			}
			
			
		}  catch (SocketException e) {
			// TODO Auto-generated catch block
			System.out.println("Connection to trail truck has ended");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
			if(socket != null)
				socket.close();
			if(inputstreamReader != null)
				inputstreamReader.close();
			if(outputStreamWriter != null)
				outputStreamWriter.close();
			if(bufferedReader != null)
				bufferedReader.close();
			if(bufferedWriter != null)
				bufferedWriter.close();
			
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
}
