package com.masha.myFirstTestProject.chapter13;
/* Display a text file.
   To use this program, specify the name
   of the file that you want to see.
   For example, to see a file called TEST.TXT,
   use the following command line:
    java ShowFile TEST.TXT;
       */

import java.io.*;

class ShowFile {
    public static void main(String args[]) {
        int i;
        FileInputStream fin = null;

        // First, confirm that a file name has been specified / Сначала убедиться, что имя файла указано
        if (args.length != 1) {
            System.out.println("Usage: ShowFile filename");
            return;
        }

        // Attempt to open the file. / Попытка открыть файл
        try {
            fin = new FileInputStream(args[0]);
        do {
            i = fin.read();
            if (i != -1) System.out.print((char) i);
        } while (i != -1);

        } catch (IOException e) {
            System.out.println("Ошибка I/O:"+e);
        } finally {
        //Закрыть файл при выходе из блока try.
            try {
               if (fin != null)
                        fin.close();
            } catch (IOException e) {
                System.out.println("Error Closing File");
            }
        }
    }
}