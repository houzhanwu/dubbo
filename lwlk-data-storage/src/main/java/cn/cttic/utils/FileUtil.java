package cn.cttic.utils;

import java.io.File;
import java.util.Comparator;

import cn.cttic.Application;

public class FileUtil {

	public static void getAllPath(String inputPath) {
		File file = new File(inputPath);
		File[] files = file.listFiles();
		if (files == null) {
			return;
		}
		for (File f : files) {
			if (f.isFile()) {
				if (f.getAbsolutePath().indexOf("201707") != -1) {

					Application.allPathResult.add(f);
				}
			} else if (f.isDirectory()) {
				getAllPath(f.getAbsolutePath());
			}
		}
	}

	public static class CompratorByLastModified implements Comparator<File> {

		public int compare(File f1, File f2) {
			long diff = f2.lastModified() - f1.lastModified();
			if (diff > 0) {
				return 1;
			} else if (diff == 0) {
				return 0;
			} else {
				return -1;
			}
		}
	}
}
