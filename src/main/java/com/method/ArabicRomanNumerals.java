package com.method;

public class ArabicRomanNumerals {
 public String convert (int nbr){
  StringBuilder resultat= new StringBuilder();
  if(nbr>=10){
   for(int i=0;i<nbr/10;i++){
    resultat.append("X");
   }
  }
  else{
   for(int i=0;i<nbr;i++){
    resultat.append("I");
   }}
   return resultat.toString();
  }

}
