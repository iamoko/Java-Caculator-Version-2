import javax.swing.*; // for the Jbuttons,JLabels and JPannels
import java.awt.event.*; // For the events used in the program
import javax.swing.border.*; // Borders usdd by the JPanels
import java.awt.*; // For the Layouts used in the program
import java.awt.Dimension; // Resizing the JLabel

class buttons extends JFrame implements ActionListener{
	protected JButton fact,opb,clb,qr,atan,acos,asin,ps,num0,num1,num2,num3,num4,num5,num6,num7,num8,num9,add,sub,div,mul,eq,clear,dot,sin,tan,cos,sqrt,sqr,bS,pom,inv;
	protected JPanel gen,display,nom,geni,genio,p1,p2,p3,calc;
	protected JLabel entry = new JLabel("0",JLabel.RIGHT);
	protected int count = 0;
	protected char sign='+';
	protected double first, second, result = 0.0;
	buttons(){
		entry.setPreferredSize(new Dimension(275,45));
		entry.setFont(new Font("TimesRoman", Font.BOLD, 15));
		gen = new JPanel();
		display = new JPanel();
		nom = new JPanel(new GridLayout(1,5,4,4));
		geni = new JPanel();
		p3 = new JPanel();
		genio = new JPanel();
		p1 = new JPanel(new GridLayout(8,4,4,4));
		p2 = new JPanel(new GridLayout(1,5,4,4));

		fact = new JButton("!");
		opb  = new JButton("-");
		clb  = new JButton(",");
		qr  = new JButton("Quard");

		atan = new JButton("atan");acos = new JButton("acos");asin = new JButton("asin");
		ps = new JButton("%");
		num0 = new JButton("0");num1 = new JButton("1");num2 = new JButton("2");
		num3 = new JButton("3");num4 = new JButton("4");num5 = new JButton("5");
		num6 = new JButton("6");num7 = new JButton("7");num8 = new JButton("8");
		num9 = new JButton("9");
		add = new JButton("+");sub = new JButton("-");div = new JButton("/");
		mul = new JButton("x");eq = new JButton("=");	dot = new JButton(".");
		sin = new JButton("sin");cos = new JButton("cos");tan = new JButton("tan");
		sqrt = new JButton("sqrt");sqr = new JButton("x^2");clear = new JButton("C");
		bS = new JButton("Delete");pom = new JButton("+/-");inv = new JButton("1/X");

		clear.setPreferredSize(new Dimension(45,60));
		//Different colors used for different buttons
		int close = 60, made = 120;
		Color mint = new Color(255/3,255/3,255/3);
		Color nmint = new Color(close,close,close);
		Color blue = new Color(0,0,made);
		Color red = new Color(made,0,0);
		//Signs
		setBackground(Color.WHITE); p2.add(entry);
		add.setBackground(blue); add.setForeground(Color.WHITE);
		bS.setBackground(red); bS.setForeground(Color.WHITE);
		clear.setBackground(red); clear.setForeground(Color.WHITE);
		eq.setBackground(Color.BLACK); eq.setForeground(Color.WHITE);
		sub.setBackground(blue); sub.setForeground(Color.WHITE);
		div.setBackground(blue); div.setForeground(Color.WHITE);
		mul.setBackground(blue); mul.setForeground(Color.WHITE);
		asin.setBackground(Color.BLACK); asin.setForeground(Color.WHITE);		

		acos.setBackground(Color.BLACK); acos.setForeground(Color.WHITE);
		fact.setBackground(Color.BLACK); fact.setForeground(Color.WHITE);
		opb.setBackground(Color.BLACK); opb.setForeground(Color.WHITE);
		clb.setBackground(Color.BLACK); clb.setForeground(Color.WHITE);
		qr.setBackground(Color.BLACK); qr.setForeground(Color.WHITE);
		atan.setBackground(Color.BLACK); atan.setForeground(Color.WHITE);
		ps.setBackground(Color.BLACK); ps.setForeground(Color.WHITE);
		sin.setBackground(Color.BLACK); sin.setForeground(Color.WHITE);
		cos.setBackground(Color.BLACK); cos.setForeground(Color.WHITE);
		tan.setBackground(Color.BLACK); tan.setForeground(Color.WHITE);
		sqrt.setBackground(Color.BLACK); sqrt.setForeground(Color.WHITE);
		pom.setBackground(Color.BLACK); pom.setForeground(Color.WHITE);
		sqr.setBackground(Color.BLACK); sqr.setForeground(Color.WHITE);
		inv.setBackground(Color.BLACK); inv.setForeground(Color.WHITE);
		dot.setBackground(Color.BLACK); dot.setForeground(Color.WHITE);
	
		num0.setBackground(mint); num0.setForeground(Color.WHITE);
		num1.setBackground(mint); num1.setForeground(Color.WHITE);
		num2.setBackground(mint); num2.setForeground(Color.WHITE);
		num3.setBackground(mint); num3.setForeground(Color.WHITE);
		num4.setBackground(mint); num4.setForeground(Color.WHITE);
		num5.setBackground(mint); num5.setForeground(Color.WHITE);
		num6.setBackground(mint); num6.setForeground(Color.WHITE);
		num7.setBackground(mint); num7.setForeground(Color.WHITE);
		num8.setBackground(mint); num8.setForeground(Color.WHITE);
		num9.setBackground(mint); num9.setForeground(Color.WHITE);
		p1.add(fact);p1.add(opb);p1.add(clb);p1.add(qr);
		p1.add(atan);

		p1.add(acos);
		p1.add(asin);
		p1.add(ps);
		p1.add(sin);p1.add(cos);p1.add(tan);p1.add(sqrt);
		p1.add(sqr);p1.add(pom);p1.add(inv);p1.add(mul);
		p1.add(num7);p1.add(num8);
		p1.add(num9);p1.add(div);p1.add(num4);
		p1.add(num5);p1.add(num6);p1.add(sub);
		p1.add(num1);p1.add(num2);p1.add(num3);
		p1.add(add);p1.add(dot);p1.add(num0);
		p1.add(bS);p1.add(eq);
		geni.setBorder(new LineBorder(null, 1));
		geni.add(p1);

		p1.setBackground(nmint);
		p2.setBorder(new LineBorder(Color.BLACK,1));
		gen.add(geni, BorderLayout.SOUTH);
		geni.setBackground(nmint);
		genio.add(p2);
		genio.setBorder(new LineBorder(null, 1));
		genio.setBackground(nmint);
		display.add(genio, BorderLayout.NORTH);
		genio.add(clear);
		display.add(clear, BorderLayout.CENTER);
		p2.setBackground(mint);entry.setForeground(Color.WHITE);
		calc = new JPanel();
		int same = 20;
		Color background = new Color(same,same,same);
		//setting colors
		gen.setBackground(background);
		display.setBackground(background);
		calc.setBackground(background);
		add(gen, BorderLayout.SOUTH);
		calc.add(display, BorderLayout.EAST);
		add(calc);

		acos.addActionListener(this);atan.addActionListener(this);
		asin.addActionListener(this);ps.addActionListener(this);

		num0.addActionListener(this);num1.addActionListener(this);
		num2.addActionListener(this);num3.addActionListener(this);
		num4.addActionListener(this);num5.addActionListener(this);
		num6.addActionListener(this);num7.addActionListener(this);
		num8.addActionListener(this);num9.addActionListener(this);
		add.addActionListener(this);sub.addActionListener(this);
		div.addActionListener(this);mul.addActionListener(this);
		eq.addActionListener(this);dot.addActionListener(this);
		sin.addActionListener(this);cos.addActionListener(this);
		tan.addActionListener(this);sqrt.addActionListener(this);
		sqr.addActionListener(this);clear.addActionListener(this);
		inv.addActionListener(this);bS.addActionListener(this);
		pom.addActionListener(this);fact.addActionListener(this);
		opb.addActionListener(this);clb.addActionListener(this);
		qr.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		double a=0,b=0,c=0;
		functions obj = new functions();
		String text = "0", convert;
		text = entry.getText();
		if((e.getSource()==num9)||(e.getSource()==num8)||(e.getSource()==num7)||(e.getSource()==num6)||(e.getSource()==num5)||(e.getSource()==num4)||(e.getSource()==num3)||(e.getSource()==num2)||(e.getSource()==num1)||(e.getSource()==num0)||(e.getSource()==opb)|| (e.getSource()==clb)){
			if(count>=1){ //checks if an operation has been performed and resets the dispalyed text to empty
				text = "0";
				count = 0;
			}
			text = ((text.length()==1) && (text.charAt(0)=='0'))? "":text;
			if(e.getSource()==num9)	entry.setText(""+text+""+9);
			if(e.getSource()==num8) entry.setText(""+text+""+8);
			if(e.getSource()==num7) entry.setText(""+text+""+7);
			if(e.getSource()==num6) entry.setText(""+text+""+6);
			if(e.getSource()==num5) entry.setText(""+text+""+5);
			if(e.getSource()==num4) entry.setText(""+text+""+4);
			if(e.getSource()==num3) entry.setText(""+text+""+3);
			if(e.getSource()==num2) entry.setText(""+text+""+2);
			if(e.getSource()==num1) entry.setText(""+text+""+1);
			if(e.getSource()==num0) entry.setText(""+text+""+0);
			if(e.getSource()==opb) entry.setText(""+text+"-");
			else if(e.getSource()==clb) entry.setText(""+text+",");
		}else if((e.getSource()==sqrt)||(e.getSource()==tan) || (e.getSource()==atan) ||(e.getSource()==qr)|| (e.getSource()==acos)||(e.getSource()==fact)||(e.getSource()==asin)  || (e.getSource()==ps)||(e.getSource()==cos)||(e.getSource()==sin)||(e.getSource()==sqr)||(e.getSource()==inv)){
			count+=1;
			if(e.getSource()==inv){
				try{
					entry.setText(clearString(""+(1/(Double.parseDouble(entry.getText())))));
				}catch(ArithmeticException excp){
					entry.setText("Divide by 0.");
				}
			}else if(e.getSource()==sqrt){
				try{
					entry.setText(clearString(""+(Math.sqrt(Double.parseDouble(entry.getText())))));
				}catch(ArithmeticException excp){
					entry.setText("Divide by 0.");
				}
			}else if(e.getSource()==tan){
				try{
					entry.setText(clearString(""+(Math.tan((Double.parseDouble(entry.getText()))))));
				}catch(ArithmeticException excp){
					entry.setText("Divide by 0.");
				}
			}else if(e.getSource()==cos){
				try{
					entry.setText(clearString(""+(Math.cos((Double.parseDouble(entry.getText()))))));
				}catch(ArithmeticException excp){
					entry.setText("Divide by 0.");
				}
			}else if(e.getSource()==sin){
				try{
					entry.setText(clearString(""+(Math.sin((Double.parseDouble(entry.getText()))))));
				}catch(ArithmeticException excp){
					entry.setText("Divide by 0.");
				}	
			}else if(e.getSource()==sqr){
				try{
					entry.setText(clearString(""+(Math.pow((Double.parseDouble(entry.getText())),2))));	
				}catch(ArithmeticException excp){
					entry.setText("Divide by 0.");
				}
			}else if(e.getSource()==asin){
				try{
					entry.setText(clearString(""+(Math.asin((Double.parseDouble(entry.getText()))))));	
				}catch(ArithmeticException excp){
					entry.setText("Divide by 0.");
				}
			}else if(e.getSource()==acos){
				try{
					entry.setText(clearString(""+(Math.acos((Double.parseDouble(entry.getText()))))));	
				}catch(ArithmeticException excp){
					entry.setText("Divide by 0.");
				}
			}else if(e.getSource()==atan){
				try{
					entry.setText(clearString(""+(Math.atan((Double.parseDouble(entry.getText()))))));	
				}catch(ArithmeticException excp){
					entry.setText("Divide by 0.");
				}
			}else if(e.getSource()==ps){
				try{
					entry.setText(""+(Double.parseDouble(entry.getText())/100)+"%");	
				}catch(ArithmeticException excp){
					entry.setText("Divide by 0.");
				}
			}else if(e.getSource()==fact){
				entry.setText(clearString(""+obj.fact(Double.parseDouble(entry.getText()))));
			}else if(e.getSource()==qr){ // create a quardratic 
				entry.setText("Enter values ....   a, b, c");
				

			}
		}else if(e.getSource()==dot){
			if(count>=1){ //checks if an operation has been performed and resets the dispalyed text to empty
				text = "0";
				count = 0;
			}
			if(text.indexOf(".")>=0){// checking if dot(.) exists in the string
				//shows that the dot(.) exists in string. therefor can't be added again
			}else{
				if((text.charAt(0)=='0') && (text.length()==1)){
					entry.setText("0.");
				}else{
					entry.setText(text+".");
				}
			}
		}else{
			try{
				count+=1;
				if(e.getSource()!=eq){
					first = Double.parseDouble(entry.getText());
					if(e.getSource()==add) sign = '+';
					else if(e.getSource()==sub) sign = '-';
					else if (e.getSource()==div) sign = '/';
					else if (e.getSource()==mul) sign = '*';
				}else{
					if(text.indexOf(',')>=0){
						int m = 0;
						for(String replaced:text.split(",")){
							if(m == 0){
								a = Double.parseDouble(replaced);
							}else if(m == 1){
								b = Double.parseDouble(replaced);
							}else if(m == 2){
								c = Double.parseDouble(replaced);
							}
							m++;
						}	

						entry.setText(""+obj.quardratic(a,b,c));

					}else{
						second = Double.parseDouble(entry.getText());
						switch(sign){
							case '+': result = first +second; break;
							case '-': result = first -second; break;
							case '*': result = first *second; break;
							case '/': result = first /second; break;
							default: result = second+0; break;
						}
						sign = ' ';
						entry.setText(clearString(""+result));
					}
					
					
				}	
			}catch(ArithmeticException excp){
				entry.setText("Wrong command");
			}			//the Arithmetic operators +-/* used in the calculator	
		}
		if(e.getSource()==clear) entry.setText("0");
		else if(e.getSource()==bS) entry.setText(clearString(""+deletelast(text)));
		else if(e.getSource()==pom){
			if(text.indexOf("-")>=0){
				text = entry.getText();
				entry.setText(clearString(""+deleteFirst(text)));
			}else entry.setText(clearString("-"+text));
		}	
	}	
	public String deletelast(String str){
		String last = "0";
		if((str.length()>1) && str!=null && str.charAt(0)!=0){
			return str.substring(0,str.length()-1);
		}else{
			return last;
		}
	}
	public String deleteFirst(String str){
		if((str.length()>1) && str!=null && str.charAt(0)=='-'){
			return str.substring(1);
		}else return str; 
	}
	public String clearString(String str){
		if(str.indexOf(".0")>=0) return str.substring(0, str.length()-2);
		else return str;
	}	
}
class functions{
	public String quardratic(double a, double b,double c){
		double d = (Math.pow(b,2)-4*a*c);
		String solution;
		if(d>=0){
			//call the final calculating methods
			return ("X1 = "+(noncomp(d,b,a)) + " , X2 = "+(noncomp1(d,b,a)) );
		}else{
			solution = ("X1 = ("+(-b) + " + "+(Math.abs(d))+"i)/"+(2*a) + " , X2 = ("+(-b) + " - "+(Math.abs(d))+"i)/"+(2*a));
			return solution;
		}
	}
	public double noncomp(double d,double b, double a){
		return (-b-Math.pow(d,0.5))/(2*a);
	}
	public double noncomp1(double d, double b, double a){
		return (-b+Math.pow(d,0.5))/(2*a);
	}
	public double fact(double num){
		if(num<=1){
			return 1;
		}else{
			return (num*fact(num-1));
		}
	}
}
public class calculatorV2{
	public static void main(String[] args) {
		buttons frame = new buttons();
		frame.setTitle("Amoko Version 2");
		frame.pack();
		frame.setResizable(false);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}