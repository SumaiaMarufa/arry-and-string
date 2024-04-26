//26 april , 2024
//Arrys are stroed in contiguous memory [consecutive memory locations]

    /* creating arry
        int intArry[]; -- this is best
         or int[] intArry;
    */
 
 
    // intArry = new int[20]; -- allocationg memory



public class Arry {

    public static void main(String[] args) {
        int age[]; // declaration
        age = new int[20]; // allocation , only 20 number can keept
//or
        int time[] = new int[30]; // declaration + allocation
        
         age[0] = 5; // change arrys number 
         System.out.println(age[0]); /* how to use arry */
        
         System.out.println(age.length); // arrys sige or lenth or allocatation
        

         int marks[] = {20, 29, 28, 27, 26,25,24};
         System.out.println(marks[4]);
    
        String  names[]={ "sumaia", "shakira", "sara","sania", "fanan" , "safa" };
        for (int i = 0; i< names.length;i++)
        {
           // System.out.println("Name is" +" "+ names[i]); // print all the names
           System.out.println(names[2]); 
        } // name will print according the names length
        
        // For Each name print
  for(String name: names){
    System.out.println("For each"+" " + name   );
  }      

           //add number of arry
    int num[] = {1,2,3,4,5,6,7,8,9,10,11,12,13, 14};
    int sum = 0;
    for(int numb: num){
        sum += numb ;
    } System.out.println( "Sum is"+ sum);

    //find out  lowest number//
 //   int minmum = 19;
//   for(int min: num){
 //       if (min < minmum) {
 //           minmum =  min ;
 //           
 //       }
//    } System.out.println("Minimum is " + minmum);


    // find out lowest number again
    int minu = Integer.MAX_VALUE; //rapper class and MAX_VALUE class which store number 2 to the power 9
    for(int min : num){
        if (min < minu) {
            minu = min;
            
       }
    } System.out.println("Minimum is" + minu);
   




        }
}

