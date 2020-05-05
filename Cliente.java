/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Jhumer Siñani
 */
public class Cliente {

    public static void main(String[] args) {
        //Host del servidor
        final String HOST = "localhost";
        //Puerto del servidor
        final int PUERTO = 5000;
        DataInputStream in;

        Scanner lectura = new Scanner(System.in);
        try {
            //Se crea el socket para conectarse con el servidor
            Socket sc = new Socket(HOST, PUERTO);
            in = new DataInputStream(sc.getInputStream());
            // siempre esta escuchando al servidor
            while (true) {
                String mensaje = in.readUTF();
                System.out.println(mensaje);
            }

        } catch (IOException ex) {
        }

    }
}
