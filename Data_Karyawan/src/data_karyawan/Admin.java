/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_karyawan;

/**
 *
 * @author FX46
 */
public class Admin extends Login {
  @Override
  public String getUsername(){
      return Username;
  }

public String SetUsername(String Username){
this.Username = Username;
return Username;
}
@Override 
public String getPassword(){
return Password;
}
public String SetPassword(String Password){
this.Password = Password;
return Password;
}
}