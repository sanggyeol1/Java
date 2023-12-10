import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println(a);
    }
}



import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        for(int i = 0; i < n; i++){
            System.out.print(str);
        }
    }
}


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String output = "";
        char tmp;
        
        for(int i = 0; i < a.length(); i++){
            
            tmp = a.charAt(i);
            
            if(65 <= tmp && tmp <= 90){
                output += a.valueOf(tmp).toLowerCase();
            }else if(97 <= tmp && tmp <=122){
                output += a.valueOf(tmp).toUpperCase();
            }else{
                output += (char)tmp;
            }
            
        }
        
        System.out.println(output);
    }
}


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        System.out.println("!@#$%^&*(\\\'\"<>?:;");
    }
}
