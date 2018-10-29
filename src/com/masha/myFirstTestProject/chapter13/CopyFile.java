package com.masha.myFirstTestProject.chapter13;
/*Копирование файла.
Для использования этой программы укажите
имена исходного и целевого файлов.
Например, чтобы скопировать файл FIRST.TXT в файл
SECOND.TXT, используйте следующую командную строку:
java CopyFile FIRST.TXT SECOND.TXT
*/
import java.io.*;

class CopyFile {
    public static void main(String args[]) throws IOException
    {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        // First, confirm that both files has been specified.
        if(args.length != 2) {
            System.out.println("Usage: CopyFile from to");
            return;
        }

        // Copy a File.
        try {
            // Attempt to open the files.
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);

            do {
                i = fin.read();
                if(i != -1) fout.write(i);
            } while(i != -1);

        } catch(IOException e) {
            System.out.println("I/O Error: " + e);
        } finally {
            try {
                if(fin != null) fin.close();
            } catch(IOException e2) {
                System.out.println("Error Closing Input File");
            }
            try {
                if(fout != null) fout.close();
            } catch(IOException e2) {
                System.out.println("Error Closing Output File");
            }
        }
    }
}
