/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_karyawan;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.io.IOException;
/**
 *
 * @author FX46
 */
public class Data_Karyawan { String user = "admin";
        String password = "admin";
 
        if(user.equalsIgnoreCase("admin")) {
            if (password.equals("admin")) {
                System.out.println("Login sukses!");
            } else {
                System.out.println("Password yang anda masukkan salah!");
            }
        } else {
            if (password.equals("admin")) {
                System.out.println("Login sukses!");
            } else {
                System.out.println("Username dan Password salah");
            }
            System.out.println("Username yang anda masukkan salah!");
        }
    }
 

