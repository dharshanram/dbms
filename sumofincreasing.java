import java.util.*;
class main{
    publuc static void main(String[] args){
        Scanner sc=new nextInt();
        int size=sc.nextInt();
        int cur=0;
        int sum=0;
        int max=0;
        int arr[]=new int[size];
        for(int i=0;i<size;i++){                   #200,1 1,4 4,300, 300,4,5,3
                                                    #1  #2  #3 #4
        
           arr[i]=sc.nextInt();


        }
            for(int i=1;i<size;i++){
                if(arr[i]>=arr[i-1]){
                    if(cur==0){
                        cur=cur+arr[i-1];
                    }
                    cur=cur+arr[i]; #9
                }
                else{
                    if(cur>=0){
                        sum=cur;
                        max=Math.max(max,cur);
                        cur=0;

                    }
                } 
            }
            max = Math.max(max, cur);
            System.out.println("Maximum sum of increasing elements is: " + max);   
    }
}