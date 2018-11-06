import java.util.Scanner;
import java.util.*;
public class CommonPhrases {
	public static void main(String[] args) {
		String phrases[]={"What is your name", "My name is"};
		String Aphrases[]={"ما اسمك", "انا اسمي", "اهلاً", "مرحبا", "سلام", "صباح الخير", "شحرا"};
		String Lion="أسد";
		String House="بيت";
		String Apple="تفاحه";
		String Cloth="ثوب";
		String Camel="جمل";
		String Horse="حصان";
		String Bread="خبز";
		String Bear="دب";
		String Chicken="دجاج";
		String Tail="زيل";
		String Man="رجل";
		String Olive="زيتون";
		String Sugar="سكر";
		String Sun="شمس";
		String Box="صندوق";
		String Weak="ضعيف";
		String Tall="طويف";
		String Envelope="ظرف";
		String Juice="عصير";
		String Deer="غزال";
		String Strawberries="فراوله";
		String Coffee="قهوه";
		String Dog="كلب";
		String Lemon="ليمون";
		String Banana="موز";
		String Tiger="نمر";
		String Phone="هاقف";
		String Flower="ورده";
		String Hand="يد";
		String Zero="صفر";
		String One="واحر";
		String Two="إثنان";
		String Three="ثلاثه";
		String Four="أربعه";
		String Five="خمسه";
		String Six="سته";
		String Seven="سبعه";
		String Eight="ثمانيه";
		String Nine="تسعه";
		String Ten="عشره";
		String Eleven="أحدعشر";
		String Twelve="إثنى عشر";
		String Twenty="عشرين";
		String Thirty="ثلاثين";
		String Forty="أربعين";
		String Fifty="خمسين";
		String Choices[]={Lion,House,Apple,Cloth,Camel,Horse,Bread, Bear,Chicken,Tail,Man,Olive,Sugar,Sun,Box,Weak,Tall,Envelope,Juice,Deer,Strawberries,Coffee,Dog,Lemon,Banana,Tiger,Phone,Flower,Hand};
		String EChoices[]={"Lion","House","Apple","Cloth","Camel","Horse","Bread", "Bear","Chicken","Tail","Man","Olive","Sugar","Sun","Box","Weak","Tall","Envelope","Juice","Deer","Strawberries","Coffee","Dog","Lemon","Banana","Tiger","Phone","Flower","Hand"};
		Random rand=new Random();
		int randomNum=rand.nextInt(26);
		//String phrase=phrases[];
		//int len=phrase.length();
		Random rand1=new Random();
		//int random1=rand1.nextInt(len);
		System.out.println(Choices[randomNum]);
		String answer=EChoices[randomNum];
		Scanner scnr=new Scanner(System.in);
		System.out.println();
		String word=scnr.nextLine();
		if (word.equals(answer)
				) {
			System.out.print("That is correct!");
		}
		else {
			System.out.print(EChoices[randomNum]);
		} 
		}
;		/*Random rand2=new Random();
		int random2=rand2.nextInt(9);
		Random rand3=new Random();
		int random3=rand3.nextInt(9);*/
		/*for (int i=0; len>i && phrase.indexOf(" ", i)>0; i++) {
			int word=phrase.indexOf(" ", i);
			if (word==phrase.indexOf(" ", i+1)) {
				System.out.print("");
			}
			else {
				System.out.println(phrase.indexOf(" ", i));
				if (random1<word) {
					System.out.println(phrase.substring(word));
				}
			}*/
			//System.out.print(phrase.indexOf(" ", 9));
		}