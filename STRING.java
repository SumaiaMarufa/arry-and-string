//APRIL 22 , 2024

// In Java , String is besically an objest that repreents a sequence of char values
// An Arry of characters works same as Java string.

/* creating java string
       By string literal--  String name = "Marufa"; 
       By new keyword --
     String name = new String ("Sumaia"); -- saves in stack memory 
     String name = "Sumaia"; -- saves in heap memory */
     
     
/* String are immutable . Immutable simply means unmodifiable or unchangeable
 Once a String object is created it's data or state can't be changed
 */

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class STRING {

    public static void main(String[] args) {
        String name = "Sumaia";
        String samnename = " Sumaia";
        String newName = new String("Sumaia");

        System.out.println(name);
        System.out.println(newName);
          //System.out.println("sumaia marufa"); // leteral string 
    
        if (name == samnename)
        {
            System.out.println(" Both are same ");    
          }
       else {
           System.out.println("nothing");
       }
          if (name == newName) {
           System.out.println("Both Are same");
            }    
        else{
           System.out.println("not same");
        } // here they are checking the referecnes 
    
           if(name.equals(newName)){
                System.out.println("name and newName have same values");
            }    
            else{
                System.out.println("aren't equal");
            }
    //here they are matching the value not the references 
    // another boolen is equalsIgnoreCase(String Another)



    
    }
}
