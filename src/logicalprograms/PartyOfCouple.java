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
        if(result==1)
        System.out.println("The unpaired element is: " + result);
        
        sc.close();
    }
    
    static int findSingle(int a[]) {
        int result = 0,count=0;
        String repeated="";
        for(int i=0;i< a.length;i++)
        {
            if(!repeated.contains(String.valueOf(a[i])))
            {
                for(int j=0;j<a.length;j++){
                    if(a[i]==a[j]){
                        repeated+=a[j];
                        ++count;
                    }

                }
            }
            if(count==1)
                System.out.println(a[i]);
            count=0;
        }   
        
        return result;
    }
}
