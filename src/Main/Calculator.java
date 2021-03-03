package Main;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Calculator extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	Color cc;
	JTextField t;
	JButton ac,c,b7,b8,b9,mltply,b4,b5,b6,minus,b1,b2,b3,plus,modulus,op,b0,dot,divide,equal;
	Calculator()
	{
		super("Calculator");
		
		Font font1 = new Font("SansSerif", Font.BOLD, 30);
		Font font2 = new Font("SansSerif", Font.BOLD, 24);
		Font font3 = new Font("SansSerif", Font.BOLD, 40);
		cc=new Color(55,55,55);
		
		t=new JTextField();
		t.setText("0");
		t.setBounds(3,6,280,50);
		t.setFont(font3);
		t.setEditable(false);
		t.setHorizontalAlignment(SwingConstants.RIGHT);
		t.setBackground(Color.DARK_GRAY);
		t.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		t.setForeground(Color.WHITE);
		
		modulus=new MyButton("%");
		modulus.setBounds(3,60,70,70);
		modulus.addActionListener(this);
		modulus.setFont(font1);
		modulus.setBackground(cc);
		modulus.setForeground(Color.WHITE);
		modulus.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		modulus.setFocusPainted(false);
		
		ac=new MyButton("AC");
		ac.setBounds(73,60,70,70);
		ac.addActionListener(this);
		ac.setFont(font2);
		ac.setBackground(cc);
		ac.setForeground(Color.WHITE);
		ac.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		ac.setFocusPainted(false);
		
		c=new MyButton("C");
		c.setBounds(143,60,70,70);
		c.addActionListener(this);
		c.setFont(font2);
		c.setBackground(cc);
		c.setForeground(Color.WHITE);
		c.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		c.setFocusPainted(false);
		
		divide=new MyButton("/");
		divide.setBounds(213,60,70,70);
		divide.addActionListener(this);
		divide.setFont(font1);
		divide.setBackground(cc);
		divide.setForeground(Color.WHITE);
		divide.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		divide.setFocusPainted(false);
		
		b7=new MyButton("7");
		b7.setBounds(3,130,70,70);
		b7.addActionListener(this);
		b7.setFont(font1);
		b7.setBackground(cc);
		b7.setForeground(Color.WHITE);
		b7.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		b7.setFocusPainted(false);
		
		b8=new MyButton("8");
		b8.setBounds(73,130,70,70);
		b8.addActionListener(this);
		b8.setFont(font1);
		b8.setBackground(cc);
		b8.setForeground(Color.WHITE);
		b8.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		b8.setFocusPainted(false);
		
		b9=new MyButton("9");
		b9.setBounds(143,130,70,70);
		b9.addActionListener(this);
		b9.setFont(font1);
		b9.setBackground(cc);
		b9.setForeground(Color.WHITE);
		b9.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		b9.setFocusPainted(false);
		
		mltply=new MyButton("*");
		mltply.setBounds(213,130,70,70);
		mltply.addActionListener(this);
		mltply.setFont(font1);
		mltply.setBackground(cc);
		mltply.setForeground(Color.WHITE);
		mltply.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		mltply.setFocusPainted(false);
		
		b4=new MyButton("4");
		b4.setBounds(3,200,70,70);
		b4.addActionListener(this);
		b4.setFont(font1);
		b4.setBackground(cc);
		b4.setForeground(Color.WHITE);
		b4.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		b4.setFocusPainted(false);
		
		b5=new MyButton("5");
		b5.setBounds(73,200,70,70);
		b5.addActionListener(this);
		b5.setFont(font1);
		b5.setBackground(cc);
		b5.setForeground(Color.WHITE);
		b5.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		b5.setFocusPainted(false);
		
		b6=new MyButton("6");
		b6.setBounds(143,200,70,70);
		b6.addActionListener(this);
		b6.setFont(font1);
		b6.setBackground(cc);
		b6.setForeground(Color.WHITE);
		b6.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		b6.setFocusPainted(false);
		
		minus=new MyButton("-");
		minus.setBounds(213,200,70,70);
		minus.addActionListener(this);
		minus.setFont(font1);
		minus.setBackground(cc);
		minus.setForeground(Color.WHITE);
		minus.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		minus.setFocusPainted(false);
		
		b1=new MyButton("1");
		b1.setBounds(3,270,70,70);
		b1.addActionListener(this);
		b1.setFont(font1);
		b1.setBackground(cc);
		b1.setForeground(Color.WHITE);
		b1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		b1.setFocusPainted(false);
		
		b2=new MyButton("2");
		b2.setBounds(73,270,70,70);
		b2.addActionListener(this);
		b2.setFont(font1);
		b2.setBackground(cc);
		b2.setForeground(Color.WHITE);
		b2.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		b2.setFocusPainted(false);
		
		b3=new MyButton("3");
		b3.setBounds(143,270,70,70);
		b3.addActionListener(this);
		b3.setFont(font1);
		b3.setBackground(cc);
		b3.setForeground(Color.WHITE);
		b3.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		b3.setFocusPainted(false);
		
		plus=new MyButton("+");
		plus.setBounds(213,270,70,70);
		plus.addActionListener(this);
		plus.setFont(font1);
		plus.setBackground(cc);
		plus.setForeground(Color.WHITE);
		plus.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		plus.setFocusPainted(false);
		
		op=new MyButton("+/-");
		op.setBounds(3,340,70,70); 
		op.addActionListener(this);
		op.setFont(font2);
		op.setBackground(cc);
		op.setForeground(Color.WHITE);
		op.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		op.setFocusPainted(false);
		
		b0=new MyButton("0");
		b0.setBounds(73,340,70,70); 
		b0.addActionListener(this);
		b0.setFont(font1);
		b0.setBackground(cc);
		b0.setForeground(Color.WHITE);
		b0.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		b0.setFocusPainted(false);
		
		dot=new MyButton(".");
		dot.setBounds(143,340,70,70); 
		dot.addActionListener(this);
		dot.setFont(font1);
		dot.setBackground(cc);
		dot.setForeground(Color.WHITE);
		dot.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		dot.setFocusPainted(false);
		
		equal=new MyButton("=");
		equal.setBounds(213,340,70,70);	
		equal.addActionListener(this);
		equal.setFont(font1);
		equal.setBackground(cc);
		equal.setForeground(Color.WHITE);
		equal.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		equal.setFocusPainted(false);
		
		addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                dispose();  
            }  
        }); 
		
		add(t);
		add(modulus);
		add(ac);
		add(c);
		add(divide);
		add(b7);
		add(b8);
		add(b9);
		add(mltply);
		add(b4);
		add(b5);
		add(b6);
		add(minus);
		add(b1);
		add(b2);
		add(b3);
		add(plus);
		add(op);
		add(b0);
		add(dot);
		add(equal);
		
		ImageIcon img = new ImageIcon("C:\\Users\\hp\\Downloads\\Calculator.png");  
		setIconImage(img.getImage()); 
		setSize(300,450);
		setLayout(null);
		setVisible(true);
		setResizable(false);
		getContentPane().setBackground(Color.DARK_GRAY);
	}
	public static void main(String[] args) 
	{
		new Calculator();
	}
	static String a="";
	static String b="";
	static String last="";
	static String d="";
	static String optr="";
	public void actionPerformed(ActionEvent e)
	{
		JButton src=(JButton)e.getSource();
		String value=src.getText();
		if(t.getText().equals("Not Defined"))
		{
			t.setText("0");
		}
		if(value.equals("="))
		{
			try
			{
				while((!last.equals("") && !b.equals("") && d.equals("") && optr.equals("")) || (!d.equals("") && !optr.equals("")))
				{
					if(!last.equals("") && !b.equals("") && d.equals("") && optr.equals(""))
					{
						String temp="";
						if(last.equals("+"))
						{
							temp=String.valueOf(Integer.parseInt(a)+Integer.parseInt(b));					
						}
						else if(last.equals("-"))
						{
							temp=String.valueOf(Integer.parseInt(a)-Integer.parseInt(b));
						}
						else if(last.equals("*"))
						{
							temp=String.valueOf(Integer.parseInt(a)*Integer.parseInt(b));
						}
						else if(last.equals("/"))
						{
							temp=String.valueOf(Integer.parseInt(a)/Integer.parseInt(b));
						}
						else
						{
							temp=String.valueOf(Integer.parseInt(a)%Integer.parseInt(b));
						}
						t.setText(temp);
						a=temp;
						b="";
						last="";
						break;
					}
					else if(!d.equals("") && !optr.equals(""))
					{
						if(precedence(optr.charAt(0))>=precedence(last.charAt(0)))
						{
							String temp="";
							if(optr.equals("+"))
							{
								temp=String.valueOf(Integer.parseInt(b)+Integer.parseInt(d));					
							}
							else if(optr.equals("-"))
							{
								temp=String.valueOf(Integer.parseInt(b)-Integer.parseInt(d));
							}
							else if(optr.equals("*"))
							{
								temp=String.valueOf(Integer.parseInt(b)*Integer.parseInt(d));
							}
							else if(optr.equals("/"))
							{
								temp=String.valueOf(Integer.parseInt(b)/Integer.parseInt(d));
							}
							else
							{
								temp=String.valueOf(Integer.parseInt(b)%Integer.parseInt(d));
							}
							b=temp;
							d="";
							optr="";
						}
						else
						{
							String temp="";
							if(last.equals("+"))
							{
								temp=String.valueOf(Integer.parseInt(a)+Integer.parseInt(b));					
							}
							else if(last.equals("-"))
							{
								temp=String.valueOf(Integer.parseInt(a)-Integer.parseInt(b));
							}
							else if(last.equals("*"))
							{
								temp=String.valueOf(Integer.parseInt(a)*Integer.parseInt(b));
							}
							else if(last.equals("/"))
							{
								temp=String.valueOf(Integer.parseInt(a)/Integer.parseInt(b));
							}
							else
							{
								temp=String.valueOf(Integer.parseInt(a)%Integer.parseInt(b));
							}
							a=temp;
							b=d;
							last=optr;
							d="";
							optr="";
						}
					}
				}
			}
			catch(Exception p)
			{
				t.setText("Not Defined");
				a="";
				b="";
				last="";
			}
		}
		else if(!value.equals("C") && !value.equals("AC") && !value.equals(".") && !value.equals("+/-"))
		{
			if(a.equals("") && Character.isDigit(value.charAt(0)))
			{
				a=value;
				t.setText(a+last+b);
			}
			else if(!a.equals("") && last.equals(""))
			{
				if(value.equals("+") || value.equals("-") || value.equals("*") || value.equals("/") || value.equals("%"))
				{
					last=value;
				}
				else
				{
					a+=value;
				}
				t.setText(a+last+b);
			}
			else if(!a.equals("") && !last.equals(""))
			{
				if(b.equals("") && (value.equals("+") || value.equals("-") || value.equals("*") || value.equals("/") || value.equals("%")))
				{
					last=value;
					t.setText(a+last+b);
				}
				else if(Character.isDigit(value.charAt(0)) && optr.equals(""))
				{
					b+=value;
					t.setText(a+last+b);
				}
				else if(!b.equals("") && optr.equals(""))
				{
					try
					{
						if(precedence(value.charAt(0))<=precedence(last.charAt(0)))
						{
							String temp="";
							if(last.equals("+"))
							{
								temp=String.valueOf(Integer.parseInt(a)+Integer.parseInt(b));					
							}
							else if(last.equals("-"))
							{
								temp=String.valueOf(Integer.parseInt(a)-Integer.parseInt(b));
							}
							else if(last.equals("*"))
							{
								temp=String.valueOf(Integer.parseInt(a)*Integer.parseInt(b));
							}
							else if(last.equals("/"))
							{
								temp=String.valueOf(Integer.parseInt(a)/Integer.parseInt(b));
							}
							else
							{
								temp=String.valueOf(Integer.parseInt(a)%Integer.parseInt(b));
							}
							a=temp;
							b="";
							last=value;
							t.setText(a+last+b);
						}
						else
						{
							optr=value;
							t.setText(a+last+b+optr);
						}
					}
					catch(Exception p)
					{
						t.setText("Not Defined");
						a="";
						b="";
						last="";
					}
				}
				else if(!b.equals("") && !optr.equals(""))
				{
					if(d.equals("") && (value.equals("+") || value.equals("-") || value.equals("*") || value.equals("/") || value.equals("%")))
					{
						if(precedence(optr.charAt(0))==precedence(value.charAt(0)))
						{
							optr=value;
							t.setText(a+last+b+optr);
						}
						else
						{
							String temp="";
							if(last.equals("+"))
							{
								temp=String.valueOf(Integer.parseInt(a)+Integer.parseInt(b));					
							}
							else if(last.equals("-"))
							{
								temp=String.valueOf(Integer.parseInt(a)-Integer.parseInt(b));
							}
							a=temp;
							b="";
							last=value;
							optr="";
							t.setText(a+last);
						}
					}
					else if(Character.isDigit(value.charAt(0)))
					{
						d+=value;
						t.setText(a+last+b+optr+d);
					}
					else if(!d.equals(""))
					{
						try
						{
							String temp="";
							if(optr.equals("+"))
							{
								temp=String.valueOf(Integer.parseInt(b)+Integer.parseInt(d));					
							}
							else if(optr.equals("-"))
							{
								temp=String.valueOf(Integer.parseInt(b)-Integer.parseInt(d));
							}
							else if(optr.equals("*"))
							{
								temp=String.valueOf(Integer.parseInt(b)*Integer.parseInt(d));
							}
							else if(optr.equals("/"))
							{
								temp=String.valueOf(Integer.parseInt(b)/Integer.parseInt(d));
							}
							else
							{
								temp=String.valueOf(Integer.parseInt(b)%Integer.parseInt(d));
							}
							b=temp;
							d="";
							optr=value;
							t.setText(a+last+b+optr);
							if(precedence(optr.charAt(0))==precedence(last.charAt(0)))
							{
								temp="";
								if(last.equals("+"))
								{
									temp=String.valueOf(Integer.parseInt(a)+Integer.parseInt(b));					
								}
								else if(last.equals("-"))
								{
									temp=String.valueOf(Integer.parseInt(a)-Integer.parseInt(b));
								}
								a=temp;
								b="";
								last=optr;
								optr="";
								t.setText(a+last);
							}
						}
						catch(Exception p)
						{
							t.setText("Not Defined");
							a="";
							b="";
							last="";
						}
					}
				}
			}
		}
		else if(value.equals("C"))
		{
			if(a.equals("")) 
			{
				return;
			}
			else if(!a.equals("") && last.equals(""))
			{
				if(a.charAt(0)=='-' && a.length()==2)
				{
					a="";
				}
				else
				{
					a=a.substring(0,a.length()-1);
				}
				if(a.length()==0)
				{
					t.setText("0");
				}
			}
			else if(!a.equals("") && !last.equals("") && b.equals(""))
			{
				last="";
			}
			else if(!a.equals("") && !last.equals("") && !b.equals("") && optr.equals(""))
			{
				if(b.charAt(0)=='-' && b.length()==2)
				{
					b="";
				}
				else
				{
					b=b.substring(0,b.length()-1);
				}
			}
			else if(!a.equals("") && !last.equals("") && !b.equals("") && !optr.equals("") && d.equals(""))
			{
				optr="";
			}
			else if(!a.equals("") && !last.equals("") && !b.equals("") && !optr.equals("") && !d.equals(""))
			{
				if(d.charAt(0)=='-' && d.length()==2)
				{
					d="";
				}
				else
				{
					d=d.substring(0,d.length()-1);
				}
			}
			t.setText(a+last+b+optr+d);
		}
		else if(value.equals("AC"))
		{
			a="";
			b="";
			d="";
			last="";
			optr="";
			t.setText("0");
		}
		else if(value.equals("+/-"))
		{
			if(a.equals("")) 
			{
				return;
			}
			else if(!a.equals("") && last.equals(""))
			{
				if(a.charAt(0)=='-')
				{
					a=a.substring(1,a.length());
				}
				else if(Character.isDigit(a.charAt(0)))
				{
					a="-"+a;
				}
			}
			else if(!a.equals("") && !last.equals("") && b.equals(""))
			{
				return;
			}
			else if(!a.equals("") && !last.equals("") && !b.equals("") && optr.equals(""))
			{
				if(b.charAt(0)=='-')
				{
					b=b.substring(1,b.length());
				}
				else if(Character.isDigit(b.charAt(0)))
				{
					b="-"+b;
				}
			}
			else if(!a.equals("") && !last.equals("") && !b.equals("") && !optr.equals("") && d.equals(""))
			{
				return;
			}
			else if(!a.equals("") && !last.equals("") && !b.equals("") && !optr.equals("") && !d.equals(""))
			{
				if(d.charAt(0)=='-')
				{
					d=d.substring(1,d.length());
				}
				else if(Character.isDigit(d.charAt(0)))
				{
					d="-"+d;
				}
			}
			t.setText(a+last+b+optr+d);
		}
		else if(value.equals("."))
		{
			
		}
	}
	public static int precedence(char c)
	{
		if(c=='+' || c=='-')
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
}