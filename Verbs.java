import java.util.Scanner;
import java.util.*;
public class Verbs {
	public static void main(String[] args) {
		String pronoun[] = { "I", "She", "He" };
		String verb[] = { "read", "write", "watch",
		"climb", "ride", "drink", "eat", "talk", "hear",
		"to leave", "to reserve", "to move", "to carry",
		"to study", "to go", "to follow", "to gather",
		"to burn", "to memerize", "to come in",
		"to mention", "to search", "to sit", "to happen",
		"to attend", "to go out", "to push", "to dance",
		"to travel", "to live", "to thank", "to hit",
		"to appear", "to work", "to do", "to cut",
		"to write", "to wear", "to own", "to land",
		"to draw", "to plant", "to fall", "to drink",
		"to laugh", "to request", "to learn", "to open",
		"to kill", "to close", "to break", " to hold",
		"to look", "to return", "to ride", "to steal",
		"to hear", "to make", "to cook", "to know",
		"to wash", "to understand", "to jump", "to hate",
		"to play", "to go down", "to escape"};
		String noun[] = { "book", "pen", "television", "ladder", "car", "tea", "water", "food", "friend", "music" };
		String words[] = { "lion", "house", "apple", "cloth", "camel", "panda", "tail", "bread", "man", "juice", "deer", "coffee", "lemon","tiger", "telephone", "flower","hand"};
		String Apronoun[] = { "آنا", "هي", "هو" };
		String Averb[] = { "قرا", "كتب", "شاهد", "صعد", "ركب", "شرب", "آكل", "تحدث", "سمع" };
		String Anoun[] = { "كتاب", "قلم", "تلفاز", "سلم", "سياره", "شاي", "ماء", "طعام", "صديق", "هوسيقي" };
		String Awords[] = {"أسد", "بيت", "تفاحم", "ثون", "جمل", "حصان", "خبن", "د"};
		Random rand=new Random();
		int randomNum=rand.nextInt(2);
		Random rand1=new Random();
		int random1=rand1.nextInt(3);
		Random rand2=new Random();
		int random2=rand2.nextInt(9);
		Random rand3=new Random();
		int random3=rand3.nextInt(9);
		String randomP=pronoun[random1];
		String randomV=verb[random2];
		String randomN=noun[random3];
		String randomS=randomP+" "+randomV+" "+randomN;
		if (randomNum==0) {
			System.out.println(randomS);
		}
		String randomAP=Apronoun[random1];
		String randomAV=Averb[random2];
		if (randomP.equals("I")) {
			randomAV="أ"+randomAV;
		}
		else if (randomP.equals("She")) {
			randomAV="ت"+randomAV;
		}
		else if (randomP.equals("He")) {
			randomAV="ي"+randomAV;
		}
		String randomAN="ال"+Anoun[random3];
		String randomAS=randomAP+" "+randomAV+" "+randomAN;
		if (randomNum==1) {
			System.out.println(randomAS);
		}
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter a sentence.");
		String sentence = scnr.nextLine();
		int len = sentence.length();
		int i = 0;
		int j = 0;
		String pronoun1="";
		for (j = 0; pronoun.length > j; j++) {
			if (sentence.contains(pronoun[j])) {
				//System.out.print(Apronoun[j] + " ");
				if (pronoun[j] == "I") {
					Averb[j] = "ا" + Averb[j];
					pronoun1="I";
				}
				if (pronoun[j] == "She") {
					Averb[j] = "ت" + Averb[j];
					pronoun1="She";
				}
				if (pronoun[j] == "He") {
					Averb[j] = "ي" + Averb[j];
					pronoun1="He";
				}
			}
		}
		for (j = 0; verb.length > j; j++) {
			if (sentence.contains(verb[j])) {
				if (pronoun1=="I") {
					//System.out.print("ا"+Averb[j]+" ");
				}
				if (pronoun1=="She") {
					//System.out.print("ت"+Averb[j]+" ");
				}
				if (pronoun1=="He") {
					//System.out.print("ي"+Averb[j]+" ");
				}
			}
		}
		if (sentence.contains("with")) {
			//System.out.print("مع"+" ");
		}
		if (sentence.contains("my")) {
			//System.out.print("لي"+" ");
		}
		if (sentence.contains("the")) {
			//System.out.print("ال"+" ");
		}
		for (j = 0; noun.length > j; j++) {
			if (sentence.contains(noun[j])) {
				//System.out.print(Anoun[j]+" ");
			}
		}
		for (j = 0; Apronoun.length > j; j++) {
			if (sentence.contains(Apronoun[j])) {
				//System.out.print(pronoun[j] + " ");
				if (pronoun[j] == "ا") {
					//verb[j] = "I" + verb[j];
					pronoun1="I";
				}
				if (pronoun[j] == "ت") {
					//verb[j] = "She" + verb[j];
					pronoun1="She";
				}
				if (pronoun[j] == "He") {
					//Averb[j] = "ي" + Averb[j];
					pronoun1="He";
				}
			}
		}
		for (j = 0; Averb.length > j; j++) {
			if (sentence.contains(Averb[j])) {
				if (pronoun1=="I") {
					//System.out.print(/*"ا"+*/verb[j]+" ");
				}
				if (pronoun1=="She") {
					//System.out.print(/*"ت"+*/verb[j]+" ");
				}
				if (pronoun1=="He") {
					//System.out.print(/*"ي"+*/verb[j]+" ");
				}
			}
		}
		if (sentence.contains("مع")) {
			//System.out.print("with"+" ");
		}
		if (sentence.contains("لي")) {
			//System.out.print("my"+" ");
		}
		if (sentence.contains("ال")) {
			//System.out.print("the"+" ");
		}
		for (j = 0; Anoun.length > j; j++) {
			if (sentence.contains(Anoun[j])) {
				//System.out.print(noun[j]+" ");
			}
		}
		if (randomNum==0) {
			if (sentence.equals(randomAS)) {
				System.out.print("That is correct!");
			}
			else {
				System.out.print(randomAS);
			}
		}
		if (randomNum==1) {
			if (sentence.equals(randomS)) {
				System.out.print("That is correct!");
			}
			else {
				System.out.print(randomS);
			}
		}
	}
}

