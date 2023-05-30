package advancedSelenium;

import java.io.File;

public class OpenFolder {

	public static void main(String[] args) {
		File openFile = new File("C:\\Users\\mathi\\data");
		File[] newFile = openFile.listFiles();

		for (File file : newFile) {

			if (file.getName().contains("dma")) {
				System.out.println("file is created ");

				break;
			}

		}

	}
}
