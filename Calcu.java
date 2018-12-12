
import java.awt.*;
import java.awt.event.*;
class Ax implements ActionListener
{
Button b_1,b_2,b_3,b_4,b_5,b_6,b_7,b_8,b_9,b_0,b_plus,b_minus,b_multi,b_div,b_equal,b_clear,b_clearall,b_back,b_percentage,b_dot,b_sqrt;
TextField t1;
double d1,d2,d3;
int count =0,count1=0,count2=0,count3=0,count4=0,countplus=0,countminus=0,countmulti=0,countdiv=0;
String s1="",s2="",str="";
Object ob;
Ax()
{ 
Frame f=new Frame("Calculator");
FlowLayout fl=new FlowLayout(FlowLayout.CENTER);

//f.setLayout(fl);

Panel p=new Panel();
p.setLayout(null);
p.setBackground(Color.GREEN);



b_1=new Button("1");
b_2=new Button("2");
b_3=new Button("3");
b_4=new Button("4");
b_5=new Button("5");
b_6=new Button("6");
b_7=new Button("7");
b_8=new Button("8");
b_9=new Button("9");
b_0=new Button("0");
b_plus=new Button("+");
b_div=new Button("/");
b_dot=new Button(".");
b_minus=new Button("-");
b_percentage=new Button("%");
b_equal=new Button("=");
b_clear=new Button("Ce");
b_clearall=new Button("C");
b_back=new Button("<---");
b_multi=new Button("*");
b_sqrt=new Button("sqrt");
t1=new TextField(30);
b_1.addActionListener(this);
b_2.addActionListener(this);
b_3.addActionListener(this);
b_4.addActionListener(this);
b_5.addActionListener(this);
b_6.addActionListener(this);
b_7.addActionListener(this);
b_8.addActionListener(this);
b_9.addActionListener(this);
b_0.addActionListener(this);
b_plus.addActionListener(this);
b_minus.addActionListener(this);
b_multi.addActionListener(this);
b_div.addActionListener(this);
b_dot.addActionListener(this);
b_percentage.addActionListener(this);
b_equal.addActionListener(this);
b_clear.addActionListener(this);
b_clearall.addActionListener(this);
b_back.addActionListener(this);
b_sqrt.addActionListener(this);
t1.setBounds(10,10,300,30);
p.add(t1);	
b_back.setBounds(10,40,60,30);
p.add(b_back);	
b_clearall.setBounds(70,40,60,30);
p.add(b_clearall);	
b_clear.setBounds(130,40,60,30);
p.add(b_clear);	
b_7.setBounds(10,70,60,30);
p.add(b_7);	
b_8.setBounds(70,70,60,30);
p.add(b_8);	
b_9.setBounds(130,70,60,30);
p.add(b_9);	
b_4.setBounds(10,100,60,30);
p.add(b_4);	
b_5.setBounds(70,100,60,30);
p.add(b_5);	
b_6.setBounds(130,100,60,30);
p.add(b_6);	
//b_plus,b_minus,b_multi,b_div,b_equal,b_clear,b_clearall,b_back,b_percentage,b_dot;
b_0.setBounds(10,160,120,30);
p.add(b_0);
b_dot.setBounds(130,160,60,30);
p.add(b_dot);
b_plus.setBounds(190,130,60,30);
p.add(b_plus);
b_equal.setBounds(250,130,60,60);
p.add(b_equal);
b_1.setBounds(10,130,60,30);
p.add(b_1);
b_2.setBounds(70,130,60,30);
p.add(b_2);
b_3.setBounds(130,130,60,30);
p.add(b_3);
b_minus.setBounds(190,160,60,30);
p.add(b_minus);
b_multi.setBounds(190,100,60,30);
p.add(b_multi);
b_div.setBounds(250,100,60,30);
p.add(b_div);
b_percentage.setBounds(190,70,60,30);
p.add(b_percentage);
b_sqrt.setBounds(250,70,60,30);
p.add(b_sqrt);






f.add(p);
f.setSize(300,500);
f.setVisible(true);
f.setBackground(Color.YELLOW);
}
public void actionPerformed(ActionEvent ae)
{double d1,d2,d3;
ob= ae.getSource();
if((ob==b_dot)&&(count1==0)&&(count2==0)&&(count3==0)&&(count4==0))
	{
	s1=s1+".";
	t1.setText(s1);
                          count++;
}
if((ob==b_1)&&(count1==0)&&(count2==0)&&(count3==0)&&(count4==0))
	{
	s1=s1+"1";
	t1.setText(s1);
                          count++;
}


if((ob==b_2)&&(count1==0)&&(count2==0)&&(count3==0)&&(count4==0))
	{
	s1=s1+"2";
	t1.setText(s1);
                          count++;
}

if((ob==b_3)&&(count1==0)&&(count2==0)&&(count3==0)&&(count4==0))
	{
	s1=s1+"3";
	t1.setText(s1);
                          count++;
}

if((ob==b_4)&&(count1==0)&&(count2==0)&&(count3==0)&&(count4==0))
	{
	s1=s1+"4";
	t1.setText(s1);
                          count++;
}

if((ob==b_5)&&(count1==0)&&(count2==0)&&(count3==0)&&(count4==0))
	{
	s1=s1+"5";
	t1.setText(s1);
                          count++;
}


if((ob==b_6)&&(count1==0)&&(count2==0)&&(count3==0)&&(count4==0))
	{
	s1=s1+"6";
	t1.setText(s1);
                          count++;
}
if((ob==b_7)&&(count1==0)&&(count2==0)&&(count3==0)&&(count4==0))
	{
	s1=s1+"7";
	t1.setText(s1);
                          count++;
}
if((ob==b_8)&&(count1==0)&&(count2==0)&&(count3==0)&&(count4==0))
	{
	s1=s1+"8";
	t1.setText(s1);
                          count++;
}
if((ob==b_9)&&(count1==0)&&(count2==0)&&(count3==0)&&(count4==0))
	{
	s1=s1+"9";
	t1.setText(s1);
                          count++;
}
if((ob==b_0)&&(count1==0)&&(count2==0)&&(count3==0)&&(count4==0))
	{
	s1=s1+"0";
	t1.setText(s1);
                          count++;
}
 if(ob==b_plus)
{t1.setText("");
count1++;
}
if((count1!=0)&&(ob==b_1))
{              
         s2=s2+"1";
t1.setText(s2);
 countplus++;
              
}


if((count1!=0)&&(ob==b_2))
{              
         s2=s2+"2";
t1.setText(s2);
 countplus++;
              
}
if((count1!=0)&&(ob==b_3))
{              
         s2=s2+"3";
                 t1.setText(s2);      
   countplus++;         
}
if((count1!=0)&&(ob==b_4))
{              
         s2=s2+"4";
t1.setText(s2);
   countplus++;                   
}
if((count1!=0)&&(ob==b_5))
{              
         s2=s2+"5";
t1.setText(s2);
   countplus++;             
}
if((count1!=0)&&(ob==b_6))
{              
         s2=s2+"6";
t1.setText(s2);
   countplus++;              
}
if((count1!=0)&&(ob==b_7))
{              
         s2=s2+"7";
t1.setText(s2);
  countplus++;                   
}
if((count1!=0)&&(ob==b_8))
{              
         s2=s2+"8";
t1.setText(s2);
                  countplus++; 
}
if((count1!=0)&&(ob==b_9))
{              
         s2=s2+"9";
t1.setText(s2);
                       countplus++;
}
if((count1!=0)&&(ob==b_0))
{              
         s2=s2+"0";
t1.setText(s2);
                   countplus++;
}
if((countplus!=0)&&(ob==b_equal))
{                                    d1=Double.parseDouble(s1);

		d2=Double.parseDouble(s2);
		d3=d1+d2;
		t1.setText(String.valueOf(d3));
s1="";s2="";str="";
count =0;count1=0;count2=0;count3=0;count4=0;countplus=0;countminus=0;countmulti=0;countdiv=0;
d1=d3;d2=0;d3=0;
}

//subtract

 if(ob==b_minus)
{t1.setText("");
count2++;
}
if((count2!=0)&&(ob==b_1))
{              
         s2=s2+"1";
t1.setText(s2);
 countminus++;                           
}

if((count2!=0)&&(ob==b_2))
{              
         s2=s2+"2";
t1.setText(s2);
 countminus++;                           
}
if((count2!=0)&&(ob==b_3))
{              
         s2=s2+"3";
t1.setText(s2);
   countminus++;                         
}
if((count2!=0)&&(ob==b_4))
{              
         s2=s2+"4";
  t1.setText(s2);                    
countminus++;      }
if((count2!=0)&&(ob==b_5))
{              
         s2=s2+"5";
   t1.setText(s2);                   
countminus++;      }
if((count2!=0)&&(ob==b_6))
{              
         s2=s2+"6";
   t1.setText(s2);                   
countminus++;      }
if((count2!=0)&&(ob==b_7))
{              
         s2=s2+"7";
   t1.setText(s2);                  
countminus++;      }
if((count2!=0)&&(ob==b_8))
{              
         s2=s2+"8";
   t1.setText(s2);                   
countminus++;      }
if((count2!=0)&&(ob==b_9))
{              
         s2=s2+"9";
   t1.setText(s2);  
countminus++;                     
}
if((count2!=0)&&(ob==b_0))
{              
         s2=s2+"0";
   t1.setText(s2);       
countminus++;         
}

if((countminus!=0)&&(ob==b_equal))
{                                    d1=Double.parseDouble(s1);

		d2=Double.parseDouble(s2);
		d3=d1-d2;
		t1.setText(String.valueOf(d3));
s1="";s2="";str="";
s1="";s2="";str="";
count =0;count1=0;count2=0;count3=0;count4=0;countplus=0;countminus=0;countmulti=0;countdiv=0;
d1=d3;d2=0;d3=0;
}



//mutiply



 if(ob==b_multi)
{t1.setText("");
count3++;
}
if((count3!=0)&&(ob==b_1))
{              
         s2=s2+"1";
t1.setText(s2);
countmulti++;
                    
}


if((count3!=0)&&(ob==b_2))
{              
         s2=s2+"2";
t1.setText(s2);
countmulti++;
                    
}
if((count3!=0)&&(ob==b_3))
{              
         s2=s2+"3";
t1.setText(s2);
countmulti++;
                  
}
if((count3!=0)&&(ob==b_4))
{              
         s2=s2+"4";t1.setText(s2);
countmulti++;
                      
}
if((count3!=0)&&(ob==b_5))
{              
         s2=s2+"5";t1.setText(s2);
countmulti++;
                      
}
if((count3!=0)&&(ob==b_6))
{              
         s2=s2+"6";t1.setText(s2);
countmulti++;
                    
}
if((count3!=0)&&(ob==b_7))
{              
         s2=s2+"7";t1.setText(s2);
countmulti++;
                     
}
if((count3!=0)&&(ob==b_8))
{              
         s2=s2+"8";t1.setText(s2);
countmulti++;
                      
}
if((count3!=0)&&(ob==b_9))
{              
         s2=s2+"9";t1.setText(s2);
countmulti++;
                     
}
if((count3!=0)&&(ob==b_0))
{              
         s2=s2+"0";t1.setText(s2);
countmulti++;
                   
}

if((countmulti!=0)&&(ob==b_equal))
{                                    d1=Double.parseDouble(s1);

		d2=Double.parseDouble(s2);
		d3=d1*d2;
		t1.setText(String.valueOf(d3));
s1="";s2="";str="";
s1="";s2="";str="";
count =0;count1=0;count2=0;count3=0;count4=0;countplus=0;countminus=0;countmulti=0;countdiv=0;
d1=d3;d2=0;d3=0;
}






//divide



 if(ob==b_div)
{t1.setText("");
count4++;
}

if((count4!=0)&&(ob==b_1))
{              
         s2=s2+"1";
                   t1.setText(s2);
countdiv++;
}

if((count4!=0)&&(ob==b_2))
{              
         s2=s2+"2";
                   t1.setText(s2);
countdiv++;
}
if((count4!=0)&&(ob==b_3))
{              
         s2=s2+"3";
  t1.setText(s2);
countdiv++;
                 
}
if((count4!=0)&&(ob==b_4))
{              
         s2=s2+"4";
     t1.setText(s2);
countdiv++;               
}
if((count4!=0)&&(ob==b_5))
{              
         s2=s2+"5";
     t1.setText(s2);
countdiv++;               
}
if((count4!=0)&&(ob==b_6))
{              
         s2=s2+"6";
     t1.setText(s2);
countdiv++;                
}
if((count4!=0)&&(ob==b_7))
{              
         s2=s2+"7";
    t1.setText(s2);
countdiv++;          
}
if((count4!=0)&&(ob==b_8))
{              
         s2=s2+"8";
     t1.setText(s2);
countdiv++;          
}
if((count4!=0)&&(ob==b_9))
{              
         s2=s2+"9";
     t1.setText(s2);
countdiv++;                 
}
if((count4!=0)&&(ob==b_0))
{              
         s2=s2+"0";
     t1.setText(s2);
countdiv++;            
}
if((countdiv!=0)&&(ob==b_equal))
{                                    d1=Double.parseDouble(s1);

		d2=Double.parseDouble(s2);
		d3=d1/d2;
		t1.setText(String.valueOf(d3));
s1="";s2="";str="";
s1="";s2="";str="";
count =0;count1=0;count2=0;count3=0;count4=0;countplus=0;countminus=0;countmulti=0;countdiv=0;
d1=d3;d2=0;d3=0;
}




//sqrt


 if(ob==b_sqrt)
{d1=Double.parseDouble(s1);
t1.setText(String.valueOf(Math.sqrt(d1)));
s1="";s2="";str="";
count =0;count1=0;count2=0;count3=0;count4=0;countplus=0;countminus=0;countmulti=0;countdiv=0;
d1=0;d2=0;d3=0;
}

//clear all

if(ob==b_clearall)
{t1.setText("");

s1="";s2="";str="";

count =0;count1=0;count2=0;count3=0;count4=0;countplus=0;countminus=0;countmulti=0;countdiv=0;
d1=0;d2=0;d3=0;
}
//backspace

if((ob==b_back)&&(count1==0)&&(count2==0)&&(count3==0)&&(count4==0))
{s1=s1.substring(0,(s1.length())-1);
t1.setText(s1);
}
if((ob==b_back)&&((count1!=0)||(count2!=0)||(count3!=0)||(count4!=0)))
{s2=s2.substring(0,(s2.length())-1);
t1.setText(s2);
}



//if(ob==b_2)
//{               s2=s2+"2";
    //                     t1.setText(s2);
  //                    d1=Double.parseDouble(s1);
//		d2=Double.parseDouble(s2);
//		d3=d1+d2;
//		t1.setText(String.valueOf(d3));
//
//}








}
}
class Calcu
{
public static void main(String as[])
	{
	new Ax();
	}
}