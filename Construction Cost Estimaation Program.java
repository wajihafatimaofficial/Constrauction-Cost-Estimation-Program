
import java.util.Scanner;


public class AA {  
public static void main(String args[]){ 
 
 
{System.out.println(" ");} 
 
         {System.out.println("              HOUSE CONSTRUCTION COST AND MATERIAL ESTIMATION SSYSTEM" ); }
           
         {System.out.println("             **********************************************************" ); } 
         
         {System.out.println(" " );  }
 Scanner scan = new Scanner(System.in) ;
          

              
  
           {    System.out.println("          Enter house category in square yards" );} 
 
   {        System.out.println(" ");} 
 
 {          System.out.println("          120     240    400    600    1000" ); }
 
           {System.out.println (" ");} { System.out.print ("          " );}  

           int sqyards = scan.nextInt();
           
             
 
           {System.out.println (" ");}
           
          {         System.out.println("          Enter number of storeys" );} 
        
          {System.out.println (" ");} { System.out.print ("          " );}  
          
            int storeys = scan.nextInt();
         
           {  System.out.println(" ");}

           
           { System.out.println("          Area in square yards: "+sqyards );}              
           
             { System.out.println(" " );} 
           
        {    System.out.println("          Total Storeys: "+storeys );}              
     
         { System.out.println(" " );}        

 
{ System.out.println("          The construction etimation for "+sqyards+" sq yards and "+storeys+" storey(s) house");}  
  {        System.out.println(" ");} 

 { System.out.println("        *********************************************************************");} 
 
         {        System.out.println(" ");} 

         

 
//declaring material and labour quantity per square yard
 
double c=5.5;

long cement=(long)c;

double g=5.9;

long gravel=(long)g;

double rebar=0.016;

 

double s=5.9;

long sand=(long)s;

long  blocks=352; 

long total_labour=1;

long storey=1;


long total_storey=storey+storeys;

switch(sqyards)
{
case 120:
total_labour=8;
break;

case 240:
total_labour=16;
break;

case 400:
total_labour=24;
break;

case 600:
total_labour=32;
break;

case 1000:
total_labour=40;
break;
}
 
//calculating material and labour quantity per square yard


long total_blocks= sqyards * blocks*total_storey;

long total_cement= sqyards * cement*total_storey;

long total_gravel=sqyards*gravel*total_storey;


double total_rebar=sqyards*rebar*total_storey;
   

long total_sand=sqyards*sand*total_storey;
 
 
//declaring material and labour cost per square yard 

long blocksCost=25;

 
double cementcost=5.16;

long cementCost=(long)cementcost;

long gravelCost=75;

long wiringCost=125000;

long rebarCost=1958 ;

long sandCost=250;

long sanitaryCost=1666 ;

long woodCost=3333  ;

 
long labourCost=300;

long paintCost=2500;

long doors_windowsCost=1458 ;


//calculating material and labour cost per square yard 

long total_blocksCost=sqyards*blocksCost*total_storey;

long total_cementCost=sqyards*cementCost*total_storey;

long total_gravelCost=sqyards*gravelCost*total_storey;

long total_wiringCost=sqyards*wiringCost*total_storey;

long total_rebarCost=sqyards*rebarCost*total_storey;
 
long total_sandCost=sqyards*sandCost*total_storey;
 
long total_sanitaryCost=sqyards*sanitaryCost*total_storey;

long total_woodCost=sqyards*woodCost*total_storey;

long total_labourCost=sqyards*labourCost*total_storey;

long total_paintCost=sqyards*paintCost*total_storey;

long total_doors_windowsCost=sqyards*doors_windowsCost*total_storey;

long totall= total_blocksCost +total_labourCost +total_cementCost + total_gravelCost + total_wiringCost + total_rebarCost + total_sandCost + total_sanitaryCost + total_woodCost +total_paintCost +  total_doors_windowsCost;
 
long totalcost=totall *total_storey ;

//printing results


{ System.out.println("          Material               Cost" ); }
{ System.out.println(" " );} 

{ System.out.println("         **********              *****" ); }

{ System.out.println(" " );} 

{ System.out.println("          Blocks              :  "+total_blocksCost +" PKR     (" +total_blocks+" blocks)  " ); }

{ System.out.println(" " );} 

{ System.out.println("          Cement              :  "+total_cementCost +" PKR     (" + total_cement+" KG)     "  ); }


{ System.out.println(" " );} 
 
{ System.out.println("          Sand                :  " +total_sandCost +"  PKR     ("+total_sand+" KG ) "   ); } 

{ System.out.println(" " );} 

 
{ System.out.println("          Gravel              :  "+total_gravelCost +" PKR     (" +total_gravel+ " KG  )");}  

{ System.out.println(" " );} 

{ System.out.println("          Labour              :  "+ total_labourCost +" PKR     ("+total_labour +" LABOURS)  "  );} 

{ System.out.println(" " );} 

{ System.out.println("          Rebar               :  "+ total_rebarCost+" PKR     (" +total_rebar +" TON(S))  " ); }

{ System.out.println(" " );}
 
{ System.out.println(" " );} 

{ System.out.println("          Extras                cost");}
{ System.out.println(" " );} 

{ System.out.println("         **********             *****" ); }

{ System.out.println(" " ); }

{ System.out.println("          Wood work           : "+total_woodCost +" PKR" );} 


{ System.out.println(" " );} 


 {System.out.println("          Wiring              : "+total_wiringCost +" PKR"  );} 

 { System.out.println(" " );} 

{ System.out.println("          Sanitary            : "+total_sanitaryCost  +" PKR" );}

{ System.out.println(" " );} 

{ System.out.println("          Door and windows    : "+ total_doors_windowsCost +" PKR" ); 
}

{ System.out.println(" " );} 

{ System.out.println("          Paint               : "+total_paintCost +" PKR" );} 

{ System.out.println(" " );} 

{ System.out.println("          total cost of house : "+ totalcost  +" PKR" ); }

{ System.out.println(" " );}
 
 


 



}

 
 
}  