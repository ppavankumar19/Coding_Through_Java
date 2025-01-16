// Getting Started __ 28 Programs.

// Positive Or Negative Number.
// import java.util.*;
// public class top {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter A Number: ");
//         int num = sc.nextInt();
//         if(num>0){
//             System.out.print(num + " Is A Positive Number.");
//         }
//         else if(num<0){
//             System.out.print(num + " Is A Negative Number.");
//         }
//         else{
//             System.out.print(num + " Is A Equal To ZERO.");
//         }
//     }
// }


// Even Or Odd.
// import java.util.*;
// public class top {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter A Number: ");
//         int num = sc.nextInt();
//         if(num%2==0){
//             System.out.print(num + " Is A Even Number.");
//         }
//         else{
//             System.out.print(num + " Is A Odd Number");
//         }
//     }
// }


// Sum Of First N Natural Numbers. 
// import java.util.*;
// public class top {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int sum = 0;
//         System.out.print("Enter A Range Of Numbers: ");
//         int num = sc.nextInt();
//         for(int i = 1;i<=num;i++){
//             sum = sum + i;
//         }
//         System.out.print(sum + " Is The Sum Of Given Range Of Natural Numbers.");
//     }
// }


// Sum Of N Natural Numbers. 
// import java.util.*;
// public class top {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int sum = 0;
//         System.out.print("Enter A Range Of Numbers: ");
//         int num = sc.nextInt();
//         for(int i = 0;i<=num;i++){
//             sum = sum + i;
//         }
//         System.out.print(sum + " Is The Sum Of Given Range Of Natural Numbers.");
//     }
// }


// Sum Of Numbers In A Given Range.
// import java.util.Scanner;
// public class top {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter A Start: ");
//         int st = sc.nextInt();
//         System.out.print("Enter A End: ");
//         int ed = sc.nextInt();
//         int sum = 0;
//         for(int i = st;i<=ed;i++){
//             sum += i;
//         }
//         System.out.print(sum);
//     }
// }


// Greatest Of Two Numbers. 
// import java.util.Scanner;
// public class top {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Num1: ");
//         int num1 = sc.nextInt();
//         System.out.print("Enter Num2: ");
//         int num2 = sc.nextInt();
//         if(num1>num2){
//             System.out.print("num1 Is Greater Than num2");
//         }
//         else if(num1 == num2){
//             System.out.print("Both Are Equal.");
//         }
//         else{
//             System.out.print("num1 Is Smaller Than num2");
//         }
//     }
// }


// Greatest Of Three Numbers.
// import java.util.Scanner;
// public class top {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Num1: ");
//         int num1 = sc.nextInt();
//         System.out.print("Enter Num2: ");
//         int num2 = sc.nextInt();
//         System.out.print("Enter Num3: ");
//         int num3 = sc.nextInt();

//         if(num1>num2 && num1>num3){
//             System.out.print("num1 Is Larger.");
//         }
//         else if(num2>num1 && num2>num3){
//             System.out.print("num2 Is Larger.");
//         }
//         else if(num3>num1 && num3>num2){
//             System.out.print("num3 Is Larger.");
//         }
//         else{
//             System.out.print("All The Nums Are Equal.");
//         }
//     }
// }


// Leap Year Or Not.
// import java.util.*;
// public class top {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter The Year: ");
//         int year = sc.nextInt();
//         if((year%400 == 0) || (year%4 ==0 && year%100!=0)){
//             System.out.print(year + " Is A Leap Year.");
//         }
//         else{
//             System.out.print(year + " Is Not A Leap Year.");
//         }
//     }
// }


// Prime Number Or Not.
// import java.util.*;
// public class top {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter A Number: ");
//         int num = sc.nextInt();
//         int count = 0;
//         for(int i=1;i<=num;i++){
//             if(num%i == 0){
//                 count++;
//             }
//         }
//         if(count>2){
//             System.out.print("Is Not A Prime.");
//         }
//         else if(count == 2){
//             System.out.print("Is A Prime.");
//         }
//         else{
//             System.out.print("Is Not A Prime.");
//         }
//     }
// }


// Prime Numbers Within A Given Range.
// import java.util.Scanner;
// public class top {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();

//         System.out.println("Prime numbers up to " + num + ":");

//         for (int i = 2; i <= num; i++) {
//             boolean isPrime = true;  // Assume the current number is prime

//             // Check if the number is divisible by any number less than its square root
//             for (int j = 2; j <= Math.sqrt(i); j++) {
//                 if (i % j == 0) {
//                     isPrime = false;
//                     break;  // If divisible, it's not a prime number
//                 }
//             }

//             if (isPrime) {
//                 System.out.print(i + " ");
//             }
//         }
//     }
// }


// Sum Of Digits Of A Number.
// import java.util.*;
// public class top {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter A Number: ");
//         int num = sc.nextInt();
//         int sum = 0;
//         while(num!=0){
//             int ld = num%10;
//             sum = sum + ld;
//             num = num/10;
//         }
//         System.out.print(sum);
//     }
// }


// Reverse Of A Number.
// import java.util.*;
// public class top {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter A Number: ");
//         int num = sc.nextInt();
//         int rev = 0;
//         while(num!=0){
//             int ld = num%10;
//             rev = rev * 10 + ld;
//             num = num/10;
//         }
//         System.out.print(rev);
//     }
// }


// Palindrome Number.
// import java.util.*;
// public class top {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter A Number: ");
//         int num = sc.nextInt();
//         int temp = num;
//         int rev = 0 ;
//         while(temp!=0){
//             int ld = temp%10;
//             rev = rev * 10 + ld;
//             temp = temp / 10;
//         }
//         if(num == rev){
//             System.out.print(num + " Is A Palindrome.");
//         }
//         else{
//             System.out.print(num + " Is Not A Palindrome.");
//         }
//     }
// }


// Armstrong Number. 
// import java.util.*;
// public class top {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter A Number: ");
//         int num = sc.nextInt();
//         int len = 0;
//         int temp = num;
//         while(temp!=0){
//             len++;
//             temp  = temp / 10;
//         }
//         int sum = 0;
//         int temp2 = num;
//         while(temp2!=0){
//             int ld = temp2%10;
//             sum +=  Math.pow(ld,len);
//             temp2 = temp2/10;
//         }
//         if(num == sum){
//             System.out.print("Is A Armstrong.");
//         }
//         else{
//             System.out.print("Is Not A Armstrong.");
//         }
//     }
// }


// Armstrong Numbers In A Given Range.
// import java.util.Scanner;

// public class top {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter The Lower Bound: ");
//         int lower = scanner.nextInt();
//         System.out.print("Enter The Upper Bound: ");
//         int upper = scanner.nextInt();
//         if (lower < 0 || upper < 0 || lower > upper) {
//             System.out.println("Please Enter A Valid Range With Non-Negative Numbers And Lower <= Upper.");
//         } else {
//             System.out.println("Armstrong Numbers Between " + lower + " And " + upper + " Are:");
//             for (int num = lower; num <= upper; num++) {
//                 int originalNumber = num;
//                 int sum = 0;
//                 int digits = 0;
//                 int temp = originalNumber;
//                 while (temp != 0) {
//                     digits++;
//                     temp /= 10;
//                 }
//                 temp = originalNumber;
//                 while (temp != 0) {
//                     int digit = temp % 10;
//                     int power = 1;
//                     for (int i = 0; i < digits; i++) {
//                         power *= digit;
//                     }

//                     sum += power;
//                     temp /= 10;
//                 }
//                 if (sum == originalNumber) {
//                     System.out.print(originalNumber + " ");
//                 }
//             }
//         }
//         scanner.close();
//     }
// }


// Fibanacci Series In A Given Range.
// import java.util.Scanner;
// public class top {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         int a = 0,b = 1;
//         int nt;
//         for(int i = 2;i<N;i++){
//             nt = a+b;
//             a = b;
//             b = nt;
//             System.out.print(nt + " ");
//         }
//     }
// }


// Find The Nth Term Of The Fibonacci Series.
// import java.util.Scanner;

// public class top {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter The Value Of N To Find The Nth Term Of The Fibonacci Series: ");
//         int n = scanner.nextInt();
//         if (n <= 0) {
//             System.out.println("Enter Only The Positive Number.");
//         } else if (n == 1) {
//             System.out.println("The First Term Of The Fibonacci Series Is:  0");
//         } else if (n == 2) {
//             System.out.println("The Second Term Of The Fibonacci Series Is:  1");
//         } else {
//             int first = 0;
//             int second = 1; 
//             int nth = 0;
//             for (int i = 3; i <= n; i++) {
//                 nth = first + second;
//                 first = second;
//                 second = nth;
//             }
//             System.out.println("The " + n + "th Term Of Fibonacci Series Is: " + nth);
//         }
//         scanner.close();
//     }
// }


// Factorial Of A Number.
// import java.util.*;
// public class top {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int res = 1;
//         for(int i = 1; i<=n ;i++){
//             res = res * i;
//         }
//         System.out.print(res);
//     }
// }


// Power Of A Number.
// import java.util.*;
// import java.math.*;
// public class top {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         double a = sc.nextDouble();
//         double b = sc.nextDouble();
//         System.out.print(Math.pow(a, b));
//     }
// }


// Factor Of A Number.
// import java.util.*;
// public class top {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i = 1;i<=n;i++){
//             if(n%i == 0){
//                System.out.print(i + " ");
//             }
//         }
//     }
// }


// Prime Factors Of A Number.
// import java.util.Scanner;

// public class top {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter A Number To Find Its Prime Factors: ");
//         int number = scanner.nextInt();
//         if (number <= 1) {
//             System.out.println("Enter The Number Greater Than 1.");
//         } else {
//             System.out.print("Prime Factors Of  " + number + " Are: ");
//             for (int i = 2; i <= number; i++) {
//                 while (number % i == 0) { 
//                     System.out.print(i + " "); 
//                     number /= i; 
//                 }
//             }
//         }
//         scanner.close();
//     }
// }


// Strong Number.
// import java.util.Scanner;
// public class top {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int temp = num;
//         int sum = 0;
//         while(temp!=0){
//             int ld = temp % 10;
//             int factorial = 1;
//             for(int i = 1;i<=ld;i++){
//                 factorial *= i;
//             }
//             sum = sum + factorial;
//             temp /=10;
//         }
//         if(sum == num){
//             System.out.print("Is A Strong Number.");
//         }
//         else{
//             System.out.print("Is Not A Strong Number.");
//         }
//     }
// }


//  Perfect Number.
// import java.util.Scanner;
// public class top {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum = 0;
//         for(int i  = 1 ;i<n;i++){
//             if(n%i == 0){
//                 sum = sum + i;
//             }
//         }
//         if(sum == n){
//             System.out.print("Is A Perfect Number.");
//         }
//         else{
//             System.out.print("Is Not A Perfect Number.");
//         }
//     }
// }


// Perfect Square.
// import java.util.*;
// public class top {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         boolean isPerfectSquare = false;
//         if(n>=0){
//             int sr = (int) Math.sqrt(n);
//             if(sr * sr == n){
//                 isPerfectSquare = true;
//             }
//         }
//         if(isPerfectSquare){
//             System.out.print("True");
//         }
//         else{
//             System.out.print("False");
//         }
//     }
// }


// Automorphic Number.
// import java.util.Scanner;
// public class top {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sqrtn = n * n;
//         int ld = sqrtn % 10;
//             if(n == ld){
//                 System.out.print("Is A Automorphic Number.");
//             }
//             else{
//                 System.out.print("Is Not A Automorphic Number.");
//             }
//         }
//     }


// Harshad Number.
// import java.util.*;
// public class top {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int temp = n;
//         int sum = 0;
//         while(temp!=0){
//             int ld = temp%10;
//             sum = sum + ld;
//             temp/=10;
//         }
//         if(n%sum == 0){
//             System.out.print("Is A Harshad Number.");
//         }
//         else{
//             System.out.print("Not A Harshad Number.");
//         }
//     }
// }


// Abundant Number.
// import java.util.*;
// public class top {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum = 0;
//         for(int i=1;i<n;i++){
//             if(n%i==0){
//                 sum = sum + i;
//             }
//         }
//         if(sum>n){
//             System.out.print("Is A Abundant Number.");
//         }
//         else{
//             System.out.print("Is Not A Abundant Number.");
//         }
//     }
// }


// Friendly Pair Or Not(Amicable Or Not).
// import java.util.Scanner;
// public class top {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum1 = 0;
//         for(int i = 1;i<a;i++){
//             if(a%i == 0){
//                 sum1 += i;
//             }
//         }
//         int sum2 = 0;
//         for(int i = 1;i<b;i++){
//             if(b%i == 0){
//                 sum2 += i;
//             }
//         }
//         if(a/sum1 == 1 && b/sum2 == 1){
//             System.out.print("Friendly Pair.");
//         }
//         else{
//             System.out.print("Not A Friendly Pair.");
//         }

//     }
// }
