package com.example.freemoneynoscam.repository;

import java.util.ArrayList;

public class Repository {

  private ArrayList<String> emailList;

  public Repository(){
    emailList = new ArrayList<>();
  }

  public void addToList(String email){
    emailList.add(email);
  }

  public String toString(){
    String emails = "";
    for (String email:emailList){
      emails += email + "  ";
    }
    return emails;
  }
}
