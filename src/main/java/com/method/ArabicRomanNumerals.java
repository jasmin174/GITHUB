package com.method;

public class ArabicRomanNumerals {
 public String convert (int nbr){
  StringBuilder resultat= new StringBuilder();
  if(nbr>=10){
   return "X";
  }
  else{
   for(int i=0;i<nbr;i++){
    resultat.append("I");
   }
   return resultat.toString();
  }

}}
