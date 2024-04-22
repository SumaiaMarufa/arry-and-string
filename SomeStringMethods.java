public class SomeStringMethods {
    public static void main(String[] args) {
        

        String name = "sumaiannsjdnj";
        System.out.println(name.toUpperCase()); // return all letters in capital letters

String name2 = "AKSIJISKANDJKN" ;
System.out.println(name2.toLowerCase()); // return all the letters in small letters
            
         String name3 = "        efjkijei    ";
         System.out.println(name3.trim()); // return without space

System.out.println(" 1 " +" "+   "Carpet".startsWith(name ) ); // Carpet "name" variable type diye start na hoile false ashbe otherwaise true ashbe
   
         System.out.println(" 2 " +" "+"Carpet".startsWith("Carp")); // now it returns true 
    
 System.out.println(" 3 " +" "+"Carpet".endsWith("Carp") ); // if end letters does not match then it will show false 

         System.out.println(" 4 " +" "+"Carpet".equals("Carpet")); // if both of the words aren't same then it will show false 
                 
System.out.println(" 5 " +" "+"Carpet".equalsIgnoreCase("Carp")); // if both of the words aren't same then it will show false 
 
        System.out.println("Carpet".charAt(3)); 
          //OR
         char temp = "AOUJHSB" .charAt(4);
         System.out.println(temp);

int age = 12345;
String stringage = String.valueOf(age); // convert int to string
System.out.println(age+2);
System.out.println(stringage+2);

          String sentence = "I love java";
          String newsentence =sentence.replace("java", "C++"); // replace words
          System.out.println(sentence);
          System.out.println(newsentence);

System.out.println("6"+" "+ sentence.contains("GOOD")); // search words and if match then return true otherwaise returns flase

          System.out.println(sentence.substring(1, 2)); 
              // find words from the sentence , here sentence is "I love java"
 
 
 // String words[] =sentence.split("a"); // remove all the "a" from the sentence
// for(String word : words){
 //   System.out.println(word);
 //}       
  String words[] =sentence.split(" "); // remove all the gape from the sentence
 for(String word : words){
    System.out.println(word); }       

             String color = "blue fvrt clr";
             char varify[]=color.toCharArray(); // differs all character 
             for(char varis: varify){
             System.out.println(varis);    }

           // self invention 
           //   String color = "blue fvrt clr";
           //   char vari[]=color.toCharArray(); // sentence ta char er shongkha onujai toto bar return korbe
           //   for(char varis: vari){
            //    System.out.println(vari);
            //  }
        

     String animal = "";// empty String
     if (animal.isEmpty()) {    // empty hole oita dekhay nahole kichui dekhabe na
        System.out.println("empty");  }       
          
                    String animall = "     ";// empty String na
                    if (animall.isEmpty()) {    // empty hole oita dekhay nahole kichui dekhabe na
                    System.out.println("empty");  }       
                  else if (animall.isBlank()){    // blank dekhabe 
                    System.out.println("Blank");
                  }
    
    
    }
}
