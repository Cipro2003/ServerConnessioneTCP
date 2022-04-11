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

public class Client {
  public static void main(String[] args) {

    int port = 2000;
    String ip = "127.0.0.1";

    try{
      Socket socket = new Socket(ip, port);
      socket.close();
    }catch(IOException ioe){
      System.err.println(ioe);
    } 
  }
}