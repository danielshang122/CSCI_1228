package A5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Arrays;

public class A5Driver {
	public static int currentEnrollment = 0;
	public static final int ENROLLMENT_LIMIT = 40;
	public static Student[] students = new Student[ENROLLMENT_LIMIT];
	private static String filePath = "studentList.text";

	// ensure all references are initialized to null
	public static void main(String args[]) {

		for (int i = 0; i < students.length; i++) {
			students[i] = null;
		}
		mainLoop(students, currentEnrollment);
	}

	public static void mainLoop(Student[] students, int currentEnrollment) {
		System.out.print(
				"Enter (N)ew student, (S)ave students, (D)isplay students, (O)rdered display students or (Q)uit: ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		switch (input.toLowerCase()) {
		case "n":
			String firstName;
			String lastName;
			int age;
			String id;
			double gpa;
			System.out.print("Please enter student's first name: ");
			firstName = scanner.nextLine();
			System.out.print("Please enter student's last name : ");
			lastName = scanner.nextLine();
			System.out.print("Please enter student's age       : ");
			age = scanner.nextInt();
			System.out.print("Please enter student's ID number : ");
			id = scanner.next();
			System.out.print("Please enter student's GPA       : ");
			gpa = scanner.nextDouble();
			students[currentEnrollment] = new Student(firstName, lastName, age, id, gpa);
			mainLoop(students, ++currentEnrollment);
		case "s":
			try (BufferedWriter out = new BufferedWriter(
					new OutputStreamWriter(new FileOutputStream(filePath), "UTF-8"))) {
				for (int i = 0; students[i] != null; i++) {
					out.write(students[i].toString());
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			mainLoop(students, currentEnrollment);
		case "d":
			try (BufferedReader in = new BufferedReader(
					new InputStreamReader(new FileInputStream(filePath), "UTF-8"))) {
				String textInput;
				while ((textInput = in.readLine()) != null) {
					System.out.println(textInput);
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				mainLoop(students, currentEnrollment);
			}
		case "o":
			try (BufferedReader in = new BufferedReader(
					new InputStreamReader(new FileInputStream(filePath), "UTF-8"))) {
				String textInput;
				String[] splitedText;
				int index = 0;
				while ((textInput = in.readLine()) != null) {
					splitedText = textInput.split(" ");
					firstName = splitedText[2];
					lastName = splitedText[5];
					age = Integer.parseInt(splitedText[7]);
					textInput = in.readLine();
					splitedText = textInput.split(" ");
					id = splitedText[1];
					gpa = Double.parseDouble(splitedText[3]);
					students[index]=new Student(firstName, lastName, age, id, gpa);
					index++;
				}
				Student[] studentsToSort = new Student[index];
				for(int i=0;students[i]!=null;i++) {
					studentsToSort[i]=students[i];
				}
				Arrays.sort(studentsToSort);
				for(Student student:studentsToSort) {
						System.out.println(student.toString());
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				mainLoop(students, currentEnrollment);
			}
		case "q":
			System.exit(0);
		}
	}
}
