// static class
// class outer{
//     static int x = 10;
//     static class inner{
//         void display(){
//             System.out.println("X = "+x);
//         }
//     }
// }
// public class Nested{
//     public static void main(String[] args) {
//         outer.inner i = new outer.inner();
//         i.display();

//     }
// }

// non static class 
// class outer{
//     int x = 20;
//     class inner{
//         void display(){
//             System.out.println("X = "+x);    
//         }
//     }
// }

// public class Nested{
//     public static void main(String[] args) {
//         outer o = new outer();
//         outer.inner oi = o.new inner();
//         oi.display();

//     }
// }

// local Inner class

// class outer{
//     void show(){
//         int x = 30;

//         class inner{
//             void display(){
//                 System.out.println("X = "+x);
//             }
//         }
//         inner i = new inner();
//         i.display();
//     }
// }
// public class Nested{
//     public static void main(String[] args) {
//         new outer().show();
//     }
// }

// ANONYMOUS CLASS

// abstract class test{
//     abstract void show();
// }
// public class Nested{    
//     public static void main(String[] args) {
//         test o = new test(){
//             void show(){
//                 System.out.println("ANONYMOUS CLASS");
//             }
//         };
//         o.show();
//     } 
// }

