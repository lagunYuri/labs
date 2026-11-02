package org.example;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class App {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        File file = new File("d:/Lab14/z1.txt");
        File fileparent = file.getParentFile();



        if (Files.exists(file.toPath())) {
            System.out.println("Файл существует в" + file.getAbsolutePath() + "\n" + "Rod = " + fileparent.getAbsolutePath());
        }

        try {
            List<String> aboutCatlist = Files.readAllLines(file.toPath());
            for (String s : aboutCatlist) {
                System.out.println(s);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        File file1 = new File("d:/Lab14/z2.txt");
        try {
            List<String> lineslist = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                lineslist.add(scanner.nextLine());
            }
            Files.write(file1.toPath(), lineslist);

            List<String> strings = Files.readAllLines(Paths.get(file1.getPath()));
            for (String a : strings) {
                int b = Integer.parseInt(a);
                double sqrt = Math.sqrt(b);

                if (sqrt * sqrt == b) {
                    System.out.print(" Число полный квадрат ");
                }
                System.out.println(b);
            }
        } catch (NumberFormatException e) {
            System.out.println("Элемент не число " + e);
        } catch (IOException e) {
            System.out.println(e);
        }







        Random random = new Random();


        try(FileWriter fwriter = new FileWriter("d:/Lab14/f.txt")){

            for(int i = 0; i<10; i++){

                fwriter.write(random.nextInt(445) + "\n");
            }


        }
        catch (IOException e){
            System.out.println("Ошибка записи в файл");

        }
        try(FileWriter hwriter = new FileWriter("d:/Lab14/h.txt") ; FileWriter gwriter = new FileWriter("d:/Lab14/g.txt");BufferedReader bufferedReader = new BufferedReader(new FileReader("d:/Lab14/f.txt"))){

String a;
           while ((a = bufferedReader.readLine())!= null){
              int b = Integer.parseInt(a);
               b = b%10;
               if(b%2 == 0){

                   gwriter.write(a + "\n");
               }
               else{
                   hwriter.write(a + "\n");
               }


           }


        }
        catch (IOException e){
            System.out.println("aaaaaaaaaaa");

        }




        File chastoti = new File("d:/Lab14/chastoti.txt");

        try (FileWriter chastWriter = new FileWriter(chastoti)) {
            for (int i = 0; i < 5; i++) {
                chastWriter.write(scanner.nextDouble() + "\n");
            }
        } catch (IOException e) {
            System.out.println(e);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода!");
            scanner.nextLine();
        }





        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(chastoti))) {
            String a;
            while ((a = bufferedReader.readLine()) != null) {
                System.out.println(a);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

File f = new File("d:/Lab14/f.txt");
        int count = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(f))) {
            String a;
            while ((a = bufferedReader.readLine()) != null) {
                int b = Integer.parseInt(a);
                if (b > 0) {
                    count++;
                }
            }
            System.out.println(count);
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла");
        }





    }



}