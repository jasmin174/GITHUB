package com.method;

public class ArabicRomanNumerals {
 public String convert (int nbr){
  if(nbr>2)
  {return "III";}
  else if (nbr>1)
  { return "II";}
  return "I";
 }
}
