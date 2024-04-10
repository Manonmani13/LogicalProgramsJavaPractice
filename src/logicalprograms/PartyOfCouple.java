package com.logiclearning;

import java.util.*;

 class PartyOfCouple {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        int result = findSingle(a);
        System.out.println("The unpaired element is: " + result);
        
        sc.close();
    }
    
    static int findSingle(int a[]) {
        int result = 0,count=0;
        for(int i=0;i< a.length;i++)
        {
            
                for(int j=0;j<a.length;j++){
                    if(a[i]==a[j]){
                        ++count;
                    }

                }
            
            if(count==1)
                result=a[i];
            System.out.println(result+" "+count+" "+a[i]);
            count=0;
        }   
        
        return result;
    }
}
