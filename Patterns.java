/*****************************************1. Solid square pattern***********************/
//  class Main {
//     public static void main(String[] args) {
//         for(int i=1; i<=4; i++){
//             for(int j=1; j<=4; j++){
//         System.out.print("* ");
//         }
//         System.out.println( );
//     }
   
// }
//  }

/*******************************2. Hollow Square***************************************************/
// class Main {
//     public static void main(String[] args){
//         for(int i = 1; i <=5; i++){
//             for(int j = 1; j<=5; j++){
                        
//                 if(i == 1|| j == 1|| i==5 || j==5){
//                 if(i>=2 && j>=2 && i<=4 && j<=4 ){

//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//             }
//             }
//             System.out.println();
            
//         }
//     }
// }
/***************************************3. Rhombus************************************************** */
// class Main{
//     public static void main(String[] args) {
//         for(int i=1; i<=5; i++){
//             // spaces
//              for(int j=1; j<=5-i; j++){
//                  System.out.print(" ");
//              }
//             //  stars
//              for(int j=1; j<=5; j++){
//             System.out.print("*");
//              }
//              System.out.println();
//         }
//     }
// }

/**************************************half right pyramid**************************************** */
// class Main {
//     public static void main(String[] args){
//         // row
//         for(int i=1; i<=5; i++){
//             // space, column
//             for( int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println(); 
//         }
//     }
// }


/***************************************invert pyramid*************************************** */
// class Main{
//     public static void main (String [] args){
//         for(int i=1; i<=5; i++){
//             for(int j=5; j>=i; j--){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

/************************************************invert pyramid********************************* */
// class Main{
//     public static void main(String[] args) {
//         for(int i=1; i<=5; i++){
//             for(int j=1; j<=5-i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }