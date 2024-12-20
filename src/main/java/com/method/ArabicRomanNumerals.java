package com.method;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArabicRomanNumerals {

 public  String convert(int nbr){
  StringBuilder resultat = new StringBuilder();

  int reste = nbr;

  while (reste >= 10) {
   resultat.append("X");
   reste -= 10;
  }
  while (reste >= 1) {
   resultat.append("I");
   reste -= 1;
  }

  return resultat.toString();
}}
