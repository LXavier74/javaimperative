package projet01;
// commentaire de LA XAVIER
// Ce commentaire est uniquement la pour la branche XAVIER


import java.util.*;
import java.lang.Math;

public class Programme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Run effectué!!!");
		Date maDate;
		int i1=23;
		System.out.println(i1);
		maDate = new Date();
		System.out.println(maDate);
		Object o1 = new Object();
		System.out.println(o1);
		System.out.println("------");
		Programme monProg = new Programme();
		monProg.atelier2();
		//monProg.atelier3();
	//	monProg.atelier4();
		// monProg.atelier5();
		//monProg.atelier6();
		//monProg.atelier7();
//monProg.atelier8();
		//monProg.atelier9();
		monProg.atelier10();
	}

public void info()
{
	
}


	
public void atelier2()
{
	int nombre= 12;
	float nombreF = -5.5f;
	boolean bool = false;
	String message = "Hello World !";
	System.out.println("Int :" + nombre + " float :" + nombreF + " booléen :"+ bool + " String "+ message);
}
public void atelier3()
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Quel est votre nom :");
	String nom = sc.nextLine();
	System.out.println("Quel est votre prénom :");
	String prenom = sc.nextLine();
	System.out.println("Quel est votre age :");
	String age = sc.nextLine();
	System.out.println("Vous êtes " + nom + " "+ prenom+ ", vous avez " + age + " ans");
 sc.close();
}
public void atelier4()
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Rentrez un premier entier :");
	int a = sc.nextInt();
	System.out.println("Rentrez un deuxième entier :");
	int b = sc.nextInt();
	System.out.println(a+b);
	System.out.println(a*b);
	System.out.println(a-b);
	System.out.println(a%b);
	System.out.println(a+b / (a-b));
	System.out.println(a+(b-a)/b);
	System.out.println(a==b);
	System.out.println(a!=b);
	System.out.println(a>b);
	System.out.println(a>=b);
	System.out.println(a<b);
	System.out.println(a<=b);
	
	
	System.out.println("Rentrez une valeur booléenne :");
	boolean c = sc.nextBoolean();
	System.out.println("Rentrez un deuxième booléen :");
	boolean d = sc.nextBoolean();
	System.out.println(c&&d);
	System.out.println(c||d);
	System.out.println(!c);



}

private void atelier5()
{
	byte a = 127;
	short b = 32767;
	b=a;
	// a=b; impossible
	System.out.println(b);
}
private void atelier6()
{
String s = "chaine de caractère";
String s2 = new String("Une autre chaine de caractère");
String s3 = new String("Une chaine de caractère");
String s4 = "chaine de caractère";
System.out.println(s==s2);
System.out.println(s==s3);
System.out.println(s==s4);
System.out.println(s=="Une chaîne de caractère");
System.out.println("---");

System.out.println(s.equals(s2));
System.out.println(s.equals(s3));
System.out.println(s.equals(s4));
System.out.println(s.equals("Une chaîne de caractère"));
System.out.println("---");
System.out.println(s.length());
System.out.println(s.toUpperCase());
System.out.println(s.indexOf("c"));
}

private void atelier7()
{
double a = 10.40400;
double b = 5.8;
double min = Math.min(a, b);
double max= Math.max(a, b);
double abs = Math.abs(a);
double rdm = Math.random();
System.out.println(min + " "+  max + " " + abs+ " " +rdm);
}

private void atelier8()
{
	boolean a = true;
	boolean b = false;
	byte c = 1;
	byte d = 2;
	if (a==true)
	{
		System.out.println("la valeur est true");
	}
	if (b==false)
	{
		System.out.println("la valeur est false");
	}
	
	if (c==d)
	{
		System.out.println("c est égal à d");
	}
	else if (c==1 && d==2)
	{
		System.out.println("c est égal à 1 et d est égal à 2");

	}

	if (c!=2)
	{
		System.out.println("c est différent de  d");
	}
	if (c>d)
	{
		System.out.println("c est supérieur à  d");
	}
	else if (c<d)
	{
		System.out.println("d est supérieur à  c");
	}
	
	int x = 5;
	switch(x)
	{
	case 1:
		System.out.println(x);
		break;
	case 2:
		System.out.println(x);
		break;
	case 3:
		System.out.println("false");
		break;
	case 4:
		System.out.println(x);
		break;
	case 5:
		System.out.println("true");
		break;
		
		default:System.out.println(11);
		break;
	}
}
public void atelier9(){
int i =1;
	while(i<6)
	{
		System.out.println(i);
		i++;
	}
	do 
	{
		System.out.println("Voici un message");
	}
	while (i==0);
	for (i=1;i<6;i++)
	{
		System.out.println(i);
	}
			
}
public void atelier10() {
	int i = 0;
	int j = 0;
	int k = 0;

String[] pokemon = {"Salameche", "Pikachu", "Carapuce", "Bulbizarre", "Racaillou"};
Arrays.sort(pokemon);
for (i = 0; i < pokemon.length; i++) {
	System.out.println(pokemon[i]);
}
while(j <pokemon.length)
{
	System.out.println(pokemon[j]);
	j++;
}

do {
	System.out.println(pokemon[k]);
	k++;
}
while
 (k <pokemon.length);
 
for(String p: pokemon)
{
	System.out.println(p);
}

for (int j2=0;j2 <pokemon.length;j2++)
{
	if (pokemon[j2]=="Carapuce")
	{
		System.out.println(j2+1);
	}
}

String[][] evolution = {{"Pikachu", "Salameche", "Carapuce", "Onyx"}, {"Raichu","Bulbizarre", "Tortank", "Racaillou"}};

for(int x = 0; x < evolution.length; x++){
	   for( int d = 0; d < evolution[x].length; d++){
		  System.out.println(evolution[x][d]);  
	   }
	}




}


}
