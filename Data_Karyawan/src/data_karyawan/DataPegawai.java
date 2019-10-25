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
public class DataPegawai {
 public static void main(String[] args){
  InputStreamReader isr = new InputStreamReader(System.in);
  BufferedReader input = new BufferedReader(isr);
  try{
      System.out.println("Aplikasi Data Karyawan");
            ArrayList no_karyawan = new ArrayList();
            ArrayList nama = new ArrayList();
            ArrayList alamat = new ArrayList();
            ArrayList jenis_kelamin = new ArrayList();
            ArrayList posisi = new ArrayList();
            ArrayList aktif = new ArrayList();
            ArrayList gaji_bersih = new ArrayList();
            int total =0 ;
            int lagi;
            int pilih;
    do{
     System.out.println("*=========================================*");
     System.out.println("+ Pilih Pilihan Mu +");
     System.out.println("*=============== ==========================*");
     System.out.println("1. Menginputkan Data Pegawai");
     System.out.println("2. Menampilkan Data Pegawai");
     System.out.print("Masukkan pilihan anda : ");
 int menu =Integer.parseInt(input.readLine());
 System.out.println("*=============== ==========================*");
 System.out.println(" ");
 switch (menu) {
     case 1:
      System.out.println("================ =====================================");
      System.out.println("-_-_-_-_-_-Form Penginputan Data Pegawai-_-_-_-_-_-_-");
      System.out.println("================ =====================================");
      do{
      System.out.print("Masukkan Nomor Pegawai : ");
      String nk = input.readLine();
      no_karyawan.add(nk);
      System.out.print("Masukkan Nama Pegawai : ");
      String np = input.readLine();
      nama.add(np);
      System.out.print("Masukkan Alamat Pegawai : ");
      String al = input.readLine();
      alamat.add(al);
      System.out.print("Jenis Kelamin : ");
      String jk = input.readLine();
      jenis_kelamin.add(jk);
      System.out.print("Posisi Pegawai : ");
      String po = input.readLine();
      posisi.add(po);
      System.out.print("Aktif : ");
      String ak = input.readLine();
      aktif.add(ak);
      System.out.print("Gaji : ");
      String g = input.readLine();
      gaji_bersih.add(g);
      System.out.print("Ada Lagi (1/0) : ");
      lagi = Integer.parseInt(input.readLine());
      }while (lagi == 1);
      for (int i = 0; i < no_karyawan.size(); i++)
      {
      } 
      break;
      case 2 :
      System.out.println("================ ====================================");
      System.out.println("-_-_-_-_-_-Form Penampilan Data Pegawai-_-_-_-_-_-_-");
      System.out.println("====================================================");
      for (int i = 0; i < no_karyawan.size(); i++) {
       System.out.println("No Karyawan : "+no_karyawan.get(i));
       System.out.println("Nama Karyawan : "+nama.get(i));
       System.out.println("Alamat : "+alamat.get(i));
       System.out.println("Jenis Kelamin : "+jenis_kelamin.get(i));
       System.out.println("Posisi : "+posisi.get(i));
       System.out.println("Aktif : "+aktif.get(i));
       System.out.println("Gaji : "+gaji_bersih.get(i));
      }
      
      break ;
 } 
 System.out.println("================ ======================================"); 
      System.out.println("1. Menu Awal 0. Keluar"); 
      System.out.println("================ ======================================"); 
 System.out.print("Pilih : ");
 pilih = Integer.parseInt(input.readLine());
 }while(pilih == 1);
 }catch(IOException e){
System.out.println("ERROR "+e.getMessage());
 }
 }
}