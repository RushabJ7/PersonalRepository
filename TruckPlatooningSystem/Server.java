import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		Socket socket = null;
		InputStreamReader inputStreamReader = null;
		OutputStreamWriter outputStreamWriter = null;
		BufferedReader bufferedReader = null;
		BufferedWriter bufferedWriter = null;
		
		ServerSocket serverSocket = null;
		
		serverSocket = new ServerSocket(1234);
		serverSocket.setReuseAddress(true);
		
		while(true) {
			
			try {
				
				socket = serverSocket.accept(); //Listens for a connection to be made to this socket and acceptsit.
				
				inputStreamReader = new InputStreamReader(socket.getInputStream()); //Reading data
				outputStreamWriter = new OutputStreamWriter(socket.getOutputStream()); //Sending data
				
				bufferedReader = new BufferedReader(inputStreamReader);
				bufferedWriter = new BufferedWriter(outputStreamWriter);
				
				while(true) {
					String msgFromClient = bufferedReader.readLine(); // Reads user input and stores in msgFromClient
					
					System.out.println("Client: " + msgFromClient);
					bufferedWriter.write("MSG Received.");
					bufferedWriter.newLine();
					bufferedWriter.flush();
					
					//System behavior when user input is 1
				if(msgFromClient.equals("1")) {  
					System.out.println("Attempting to reconnect");
					System.out.println("Press 2 if reconnection failed");
					System.out.println("Press any other key if reconnection sucessful");
				}
				//System behavior when user input is 2
				else if(msgFromClient.equals("2")) {
					System.out.println("Trail truck moving to nearest sideway platform in limp home mode");
					socket.close();
					inputStreamReader.close();
					outputStreamWriter.close();
					bufferedReader.close();
					bufferedWriter.close();
				} 
				else System.out.println("Connection active");
						
				}	
				
				//When the connection is lost
				} catch(IOException e) {
					System.out.println("Lead vehicle sending Location, speed and acceleration information to platoon monitoring station");
				
			}
			
			
		}
		

	}

}
