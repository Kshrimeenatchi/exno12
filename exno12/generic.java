/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exno12;

/**
 *
 * @author Kathiresan
 */
public class generic_method {
    public static void main(String args[]){
        Scanner obj1=new Scanner(System.in);
        System.out.println("Enter the size of the list:");
        int n=obj1.nextInt();
        Integer num[]=new Integer[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
           num[i]=obj1.nextInt();
        }
        System.out.println("Entered Elements are:");
        
        for(int i=0;i<n;i++)
        {
            System.out.println(num[i]);
        }
     
        System.out.println("COUNTING OF ODD INTEGERS IN THE LIST:");
        generic<Integer> obj=new generic<>();
        obj.odd_integer(num);
        System.out.println("EXCHANGE THE POSITION OF 2 DIF ARRAY");
        System.out.println("enter position of first element ");
        int x=obj1.nextInt();
        System.out.println("enter position of second element");
        int y=obj1.nextInt();
        System.out.println("After Interchange:");
 
        obj.exchange(num,x,y);
       for(int i=0;i<n;i++)
        {
            System.out.println(num[i]);
        }
        System.out.println("TO FIND THE MAXIMAL ELEMENT IN THE GIVEN RANGE");
        System.out.println("Enter the initial index");
        int w=obj1.nextInt();
        System.out.println("Enter the ending index");
        int u=obj1.nextInt();
        System.out.println("Elements that are between the given range:");
        for(int i=w;i<=u;i++)
        {
            System.out.println(num[i]);
        }
       System.out.println("TO FIND THE MAXIMAL ELEMENT OF THE GIVEN LIST:");
       obj.maxi_ele(num,w,u);
}
}
class generic<T>
{
    int count;
    int x,y;
    int begin;
    int end;
public <T extends Number>void odd_integer(T[] value)
    {
    for(int i=0;i<value.length;i++)
    {
        if(value[i].intValue()%2!=0)
        {
            count++;
        } 
        }
        System.out.println("count:"+count);
    }
public <T>void exchange(T[] value,int x,int y)
    {
        T temp=value[x];
        value[x]=value[y];
        value[y]=temp;
    }
    public <T extends Number>void maxi_ele(T[] value,int begin,int end)
    {
        int max=value[begin].intValue();
      for(int i=begin;i<=end;i++)
      {
          if(value[i].intValue()>max)
          {
              max=value[i].intValue();
              
          }
            
            
        }
      System.out.println("Maximum element:"+max);
    }
    
    
}
