import static java.lang.Math.random;

void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите размер массива: ");
    int a = scanner.nextInt();
    int array[] = new int[a];

//    for(int i = 0; i < array.length; i++){
//        System.out.print("Введите значение элемента" + i);
//        int b = scanner.nextInt();
//        array[i] = b;
//    }
    Random random = new Random();


    for(int i = 0; i< array.length; i++){

        array[i] =  random.nextInt(61) -30;



    }

    System.out.println("Исходный массив:");
    for(int i = 0; i < array.length; i++){
        System.out.println( i  + "=" + array[i]);
    }

    //int arr[] = new int[a];
    for(int i = 0; i < array.length /2 ; i++){
        int t = array[array.length - i - 1];
        array[array.length - i - 1] = array[i];
        array[i] = t;
    }

    System.out.println("Итоговый:");
    for(int i = 0; i < array.length; i++){
        System.out.println(i  + "=" + array[i]);
    }


    System.out.print("Введите число строк: ");
    int n = scanner.nextInt();

    System.out.print("Введите число столбцов: ");
    int m = scanner.nextInt();

    int array2[][] = new int[n][m];



    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            System.out.print(i + " " + j + "=");
            array2[i][j] = scanner.nextInt();
        }
    }


    System.out.println("Исходный:");
    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            System.out.print(array2[i][j] + " " );
        }
        System.out.println();
    }


    int count = 0;
    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            if((i + j) % 2 == 0){
                count++;
            }
        }
    }


    int arr1[] = new int[count];
    int index = 0;

    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            if((i + j) % 2 == 0){
                arr1[index] = array2[i][j];
                index++;
            }
        }
    }


    System.out.println("Итоговый");
    for(int i = 0; i < count; i++){
        System.out.println(i + "=" + arr1[i]);
    }

    scanner.close();
}