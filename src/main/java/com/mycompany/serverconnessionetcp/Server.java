/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.serverconnessionetcp;

/**
 *
 * @author aless
 */
import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        
      int port = 2000;
        Socket socket = null;
      
        try{
            ServerSocket sSocket = new ServerSocket(port);
            System.out.println("In attesa di connessione con il client");
            
            socket = sSocket.accept();
            System.out.println("Server connesso con il socket: "+ socket.getRemoteSocketAddress());
            
            socket.getInputStream();
        }catch(BindException be) {
            System.err.println("Server già avviato");
        }catch(IOException ioe){
            System.err.println("Errore I/O nell'instanza del server");
    }
  }
}