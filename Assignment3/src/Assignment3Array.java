import java.util.Scanner;

public class Assignment3Array {

	public static void main(String[] args) {
		//Credit card
		
				Scanner in=new Scanner(System.in);
				
				System.out.println("Welcome to Bank Harimau, please enter any key to continue.");
				System.out.print("Please enter your name: ");
				String name = in.next();
				System.out.print("Please enter your identity card number: ");
				String ic = in.next();
				System.out.print("Please enter a phone number registered under your name: ");
				int phone = in.nextInt();
				System.out.println("Please note that this phone number will be registered under your bank account. ");
				System.out.print("Please enter your state name: ");
				String state = in.next();
				
				System.out.println("Here comes the crucial question to justify whether you are qualified to apply credit card or not. ");
				System.out.print("Please enter your age: ");
				int age = in.nextInt();
				if(age>=18) {
					System.out.println("Congratulations! You are qualified to move onto the next step.");
				} else if(age<18) {
					System.out.println("Oops, seems like you are not qualified to apply credit cards.");
				}
				
				System.out.println("Here is the break section for those who want to apply credit cards. ");
				for(int i=0; i<6; i++) {
					for(int p=0; p<i; p++) {
						System.out.print("*");
					}
					System.out.println("");
				}
				
				System.out.println("Please wait for a five-digit code on your registered phone number just now. ");
				String[] code = new String[5];
				System.out.println("Enter the five-digit code one by one by tapping enter here: ");
				for(int i=0; i<code.length; i++) {
					code[i] = in.next();
				}
				System.out.println();
				
				System.out.println("Here is the five-digit code you have typed. ");
				for(int i=0; i<code.length; i++) {
					System.out.println(code[i]);
				}
				System.out.println();
				
				System.out.print("Please enter your income per annum: ");
				int income = in.nextInt();
				if(income>=24000) {
					System.out.println("Congratulations! You are qualified to apply credit cards from Bank Harimau");
				} else if(income<24000) {
					System.out.println("Oops, you have not achieved the minimum eligibility for new credit card holders.");
				}
				
				if(income>=50000) {
					System.out.println("Type of credit card(s) provided are 'Platinum Credit Card', 'Gold Credit Card' and 'Signature Credit Card'.");
				} else if(income<50000 && income>=24000) {
					System.out.println("Type of credit card(s) provided are 'Classic Credit Card' and 'Harimau Credit Card");
				}
				System.out.println();
				
				System.out.println("Our customer service will contact you to choose the type of credit card(s) you would like to apply after paying the total fees. ");
				
				System.out.println("Please wait while we try to serve you with the best service. ");
				for(int i=0; i<20; i++) {
					System.out.print("--");
				}System.out.println("");
				
				System.out.println("Thank you for connecting with our best customer service. ");
				for(int i=0; i<20; i++) {
					System.out.print("--");
				}
				System.out.println("");
				
				String [][] creditcardList = {{"Platinum Credit Card", "Gold Credit Card", "Signature Credit Card"},
											  {"Classic Credit Card", "Harimau Credit Card"}
				};
				if(income>=50000) {
					System.out.println("The type of credit card you would like to apply is "+ creditcardList[0][0]);
				} else if(income>=24000 && income<50000) {
					System.out.println("The type of credit card you would like to apply is " + creditcardList[1][1]);
				}
				
				for(int i=0; i<20; i++) {
					System.out.print("--");
				}
				System.out.println("");
				
				System.out.println("HERE COMES THE FACT TIME ");
				System.out.println("DO YOU KNOW THAT ");
				int[] customerList = {10, 40, 24, 5, 32};
				int total = 0; 
				for(int i=0; i<customerList.length; i++) {
					total += customerList[i];
				}
				System.out.println("THE TOTAL NUMBER OF CUSTOMERS APPLYING BANK HARIMAU CREDIT CARD(S) IN YOUR STATE AREA IS " + total);
				
				for(int i=0; i<20; i++) {
					System.out.print("--");
				}
				System.out.println("");
				
				if(income>=50000) {
					System.out.println("The annual fees is RM130 and the interest rate per month is 1.30% to 1.70%.");
				} else if(income>=24000 && income<50000) {
					System.out.println("The annual fees is RM60 and the interest rate per month is 1.25% to 1.50%.");
				}
				
				int[][] cardAmount = {{1, 2, 3, 4},
									  {1, 2, 3, 4}		
				};
				if(income>=50000) {
					System.out.println("The maximum amount of credit cards you can apply is " + cardAmount[0][1]);
				} else if(income>=24000 && income<50000) {
					System.out.println("The maximum amount of credit cards you can apply is " + cardAmount[1][0]);
				}
				
				System.out.print("Please enter the amount of credit cards you would like to apply: ");
				int card = in.nextInt();
				System.out.println();
				
				System.out.println("Please note that we have a surcharge of RM3 for service charges. ");
				for(int i=0; i<20; i++) {
					System.out.print("--");
				} 
				System.out.println("");
				
				System.out.println("Please wait while we calculate the total fees for this one-time service. ");
				System.out.println();
				
				for(int i=0; i<20; i++) {
					System.out.print("--");
				}
				System.out.println("");
				
				int sum2 = card*60*3;
				if(income>=24000 && income<50000) {
					System.out.println("The total fees that you have to pay is " + "RM" + sum2);
				} else if(income>=50000) {
					int sum1 = card*130*3;
					System.out.println("The total fees that you have to pay is " + "RM" + sum1);
				}
				
				System.out.print("Please wait while we connect to our payment system. ");
				System.out.println();
				
				for(int i=0; i<20; i++) {
					System.out.print("---");
				}
				System.out.println("");
				
				double[][] water = {{1.7, 2.7, 3.7, 4.7},
									{5.7, 6.7, 7.7, 8.7}
				};
				System.out.println("Please drink at least " + water[0][2] + "litres of water a day in this pandemic situation and don't forget to wear mask in public. ");
				System.out.println("MALAYSIA PRIHATIN. ");
				
				for(int i=0; i<20; i++) {
					System.out.print("---");
				}
				System.out.println("");
				
				System.out.println("Please move on to pay the total fees. ");
				System.out.println();
				
				int [] secure = {12, 63, 80, 5, 13};
				System.out.print("Here are the security codes to use to retrieve your credit card at our nearest bank branches. ");
				for(int i=0; i<secure.length; i++) {
					System.out.println(secure[i]);
				}
				System.out.println("DO REMEMBER TO SHOW THESE NUMBERS TO OUR FRONT HELP CENTER. ");
				
				for(int i=0; i<20; i++) {
					System.out.print("---");
				}
				System.out.println("");
				
				String [][] service = { {"Mr.", "Mrs.", "Ms."},
										{"Mohamed", "Mahfuzah", "Athirah"}
				};
				System.out.println(service[0][0] + " " + service[1][0] + " is glad to be in your service. ");
				System.out.println();
				
				System.out.println("We will inform you when the credit card(s) is ready by the number of 03-1234567. ");
				System.out.println("Thank you for using Bank Harimau. Please come again, thank you. ");
				
				for(int i=0; i<6; i++) {
					for(int p=5; p>i; p--) {
						System.out.print("*");
					}
					System.out.println("");
				}
				

			}


	}


