import java.util.Random;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);

		/*
		  כתבו תוכנית אשר מדפיסה על המסך את כל המספרים הזוגיים מ 50- עד 380.

		 for(int i=-50;i<=380;i++ )
		{
			if(i%2==0)
				System.out.println(i);
		}
////////////////////////////////////////////////////////////////////////////////////////////
		 * כתבו תוכנית שקולטת אות מהמשמש.
אם הקיש A – התוכנית תגריל מספר מ1-1000 ותציג אותו על המסך.
אם הקיש B – התוכנית תקלוט מהמשתמש את השם שלו ותדפיס אותו הפוך
(מהסוף להתחלה).
אם הקיש C – התכנית תקלוט מספר ותדפיס כמה ספרות יש לו.
לכל אות אחרת התוכנית תבקש מהמשתמש להקליד מחדש .
System.out.println("Enter char :");
		char ch=in.next().charAt(0);
		switch(ch)
		{
		case('A'):
			Random rnd=new Random();
		int randint=rnd.nextInt(1000-1)+1;
		System.out.println(randint);
		break;
		case ('B'):
			System.out.println("Enter your name : ");
		String name=in.next();
		for(int i=name.length()-1;i>=0;i--)
			System.out.print(name.charAt(i));
			break;
		case('C'):
			System.out.println("Enter number : ");
		int num=in.nextInt();
		int max=0;
		for(int i=String.valueOf(num).length()-1;i>=0; i--)
			max++;
		System.out.println(max);
		break;
		default:
			System.out.println("Enter A,B or C ");
		}
		 */
		//////////////////////////////////////////////////////////////////////////////////
		/*
		 *כתבו תוכנית שקולטת אינסוף מספרים עד אשר הוקש מספר שלילי. לאחר מכן התוכנית 
תדפיס את המספר הכי גדול שהוקש.

		System.out.println("Enter number : ");
		int Num;
		int maxNum=0;
		do
		{
			Num=in.nextInt();
			if(maxNum<Num)
				maxNum=Num;
		}while(Num>0);
		System.out.println(maxNum+" is max number");
		 */
		/////////////////////////////////////////////////////////////////////////////////////////////////////
		/*
		כתבו תוכנית שקולטת  תעודת זהות מהמשתמש.
		התוכנית תדפיס האם היא תקנית (9 ספרות , רק ספרות).   

		System.out.println("Enter ID : ");
		int id=in.nextInt();
		int count = 0;
		while(id!=0) {
			id/=10;
			count++;
		}
		if(count!=9) {
			System.out.println("This is not ID.");}
			else if(String.valueOf(id).matches("[0-9]+")){
				System.out.println("right ID");}
			else
				System.out.println("Enter another number ID");
		 */
		////////////////////////////////////////////////////////////////////////
	/*
		כתבו תוכנית שקולטת מחרוזת מהמשתמש. 
		התוכנית צריכה לעבור על האותיות, לפני כל אות גדולה
		התוכנית תצטרך לשים רווח (" ").
		לדוגמא: abCdeFg - - > ab Cde Fg
		 */
		System.out.println("Enter sentence : ");
		String str=in.next();
		String temp="";
		for(int i=0;i<=str.length();i++)
		{
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
			temp=str.substring(0,i-1);
			temp+="  ";
			temp+=str.substring(i, str.length());
			str=temp;
			i++;
			}
		}
		System.out.println(str);
////////////////////////////////////////////////////////////////////////////////////////
		/*
		 כתבו תוכנית שמגרילה מספר מ3-10. 
על התוכנית לצייר על המסך ריבוע של כוכביות 
לפי גודל המספר שהוגרל.

Random rnd = new Random();
int num = rnd.nextInt(10-3)+3;
		
for (int i = 0; i <=num-2; i++)
	System.out.print("*");
System.out.println();

	  
for (int i = 0; i <=num-2; i++) {
	 System.out.print("*");
for (int j = 0; j <= num-2; j++) {
	 System.out.print(" ");
}
System.out.println("*");
}

for (int i = 0; i <= num-2; i++)
              System.out.print("*");
System.out.println();
*/
	}
}
