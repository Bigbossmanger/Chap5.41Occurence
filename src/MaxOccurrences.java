

import java.util.Scanner;//import scanner library


//Delaware technical Community College
//Date: 02/06/2021
//Assignment:chap 5.41 Occurrence
//This program get the User input and display Max number and number of Occurrence
//@Author: Noel Martial Nguemechieu

// MaxOccurrence class
public class MaxOccurrences {


    // search method
    public static void search() {


// Create local variables
        int  smallest =0 ;
        int largest = 0;
        String input ;
         int counter = 0;




        try (Scanner scanner= new Scanner(System.in)) {//Read user input with scanner object
            input = scanner.nextLine();//Assigning User input to memory location
            int[] myNum = new int[input.length()];//Create a memory array to store each digit base on String length

            for (int i = 0; i < input.length(); i++) {
                //Converting and Assigning  each number to a new allocate memory location
                myNum[i] = Integer.parseInt(String.valueOf(input.charAt(i)));

            }

            largest = myNum[input.length()-1];
            smallest = myNum[0];


            smallest = Math.min(smallest, myNum[input.length()-1]);
            largest = Math.max(largest, myNum[input.length()-1]);

            //Looping through the String length
            for (int i = 0; i < input.length(); i++) {
                if( myNum[i]<largest){
                 largest=myNum[i];

                }else if(smallest>largest){


                } if (smallest == largest) {


                    ++counter;//Counting number occurrence
                }


            }//end for loop



        } catch (Exception e) {
            System.out.println("Invalid number!");//Display error message
            System.out.close();//System stop
        }

        System.out.println("The largest number is: "+largest);//Display Largest



        if(counter==0) {
            System.out.println("The occurrence count of the largest number is :" + 1);

        }else {     System.out.println("The occurrence count of the largest number is :" + (counter));}

    }

    //main start
    public  static  void main(String[] args ) {

            System.out.println("Enter a string:");//Display message to Get user input
            search( );//calling search ()
    }

}
