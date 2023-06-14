package com.prectice.udemy;

 class MyChar {
    private char C;
    public MyChar(char c) {
        this.C=c;
    }
    public boolean isVowel(){
        if(this.C=='a'||this.C=='A'||this.C=='i'||this.C=='I'||this.C=='o'||this.C=='O'||this.C=='u'||this.C=='U'||this.C=='e'||this.C=='E'){
            return true;
        }

        return false;
    }
    public boolean isAlphabets(){
        if(C>='a' && C<='z' ){//System.out.println("This is a Lower Case Alphabets");
            return true; }

        else if(C >= 'A' && C <= 'Z'){//System.out.println("This is A UpperCase Alphabets");
            return true; }

        return false;
    }
    public boolean isDigit(){
        if(C>=48 &&C<=57){System.out.println("this is A Digit");}
        else{  return false;}
        return true;
    }
    public boolean printLowerCaseAlphabets(){
        //a to z
        for(C='a'; C<='z'; C++){
            System.out.println(C);
        }
        return true;
    }
    public boolean printUpperCaseAlphabets(){
        //A to Z
        for(C='A'; C<='Z'; C++){
            System.out.println(C);
        }
       return true;
    }
     public boolean isConsonant(){
         //A to Z
         if(isAlphabets() && !isVowel()){
         return true;}

         return false;
     }
}
