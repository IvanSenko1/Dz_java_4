package task_1;

import java.io.*;
import java.nio.charset.*;

public class task_1 {
	public static void main(String[] args) {
		try {
			try (FileWriter writingToFile = new FileWriter("Task_1/Task_1.txt", Charset.forName("UTF-8"))) {
				writingToFile.append("Работа с файлом: загрузка строки в файл!");
				writingToFile.flush();
			}
			String line = "";
			try (FileReader readingFromFile = new FileReader("Task_1/Task_1.txt", Charset.forName("UTF-8"))) {
				while (readingFromFile.ready()) {
					line += (char)readingFromFile.read();
				}
			}
			System.out.println("\n\033[34m" + line + "\033[0m");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}