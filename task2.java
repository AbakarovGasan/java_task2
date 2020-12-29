public class task2{
    //1. Создайте функцию, которая повторяет каждый символ в строке n раз
    public static String repeat(String g, int n){
        if (n<=0) return "";
        String r = "";
        int j;
        for (char a: (g.toCharArray())){
            // выполнить для каждого символа в строке
            // Lists.charactersOf - возвращает список символов в строке
            
            j = 0;
            while (j<n){
                // повторить n раз
                r+=a;
                j+=1;
            }
        }
        return r;
    }
    //2. Напишите функцию, которая возвращает позицию второго вхождения " zip " в
//строку, или -1, если оно не происходит по крайней мере дважды. Ваш код должен
//быть достаточно общим, чтобы передать все возможные случаи, когда "zip" может
//произойти в строке. 
    public static int differenceMaxMin(int [] args){
        if (args.length==0) return -1; //если длина массива равна 0
        // иначе присвоить числу max и min первое число из массива
        int max = args[0];
        int min = args[0];
        
        //проверить весь массив
        for (int a: args){
            if (max<a) max=a; // ecли число больше mах
            if (min>a) min=a; // если число меньше min
            // примечание: число не может быть больше max и меньше min одновременно
        }
        return max-min;
    }
 //3. Создайте функцию, которая принимает массив в качестве аргумента и возвращает
//true или false в зависимости от того, является ли среднее значение всех элементов
//массива целым числом или нет. 
    public static boolean isAvgWhole(int [] array){
        return (((java.util.Arrays.stream(array).sum())%array.length)==0);
        // если среднее значение массива целое число, то остаток деления суммы 
        // массива на длину массива равен нулю;
    }
    
    public static int [] cumulativeSum(int [] array){
        // метод, который берет массив целых чисел и возвращает массив, в
        // котором каждое целое число является суммой самого себя + всех предыдущих
        // чисел в массиве
        int i;
        for (i=1; i < (array.length); i+=1 ){
            array[i]+=array[i-=1];
        };
        return array;
    }
    
    public static int getDecimalPlaces(String number){
        // проверить, является ли строка числом
        try{
            Float.parseFloat(number); // если не является числом,
            // то вызовется исключение java.lang.NumberFormatException
            int j = number.indexOf(".");
            if (j==-1){
                return 0; //если строка не содержит разделитель,
                // то не содержит десятичных чисел соответственно
            }
            return number.length() - j - 1; //вернуть число десятичных знаков
        }
        catch(java.lang.NumberFormatException e){
            return -1; //если нет, вернуть -1
        }
        
    }
    
    public static int Fibonacci(int n){
        // функция возвращает n-ное число из последовательности чисел фибонначи
        int n0 = 1;
		int n1 = 1;
		int n2;
		for(int i = 0; i <= n; i++){
			n2=n0+n1;
			n0=n1;
			n1=n2;
		}
        return n1;
    } 
    
    public static boolean isValid(String number){
        // проверить, является ли строка числом
        try{
            Integer.parseInt(number); // если не является числом,
            // то вызовется исключение java.lang.NumberFormatException
            return number.length()==5; // возвращает true если размер строки = 5
        }
        catch(java.lang.NumberFormatException e){
            return false; //если нет, вернуть false
        }
    }
    
    public static boolean isStrangePair(String a, String b){
        if ((a=="") & (b=="")) return true; // вернуть true если строки пустые
        return (a.charAt(0)==b.charAt(b.length()-1))&(b.charAt(0)==a.charAt(a.length()-1));
    }
    
    public static boolean isPrefix(String a, String b){
        b=b.substring(0, b.length()-1);
        return a.indexOf(b)==0;
    }
    
    public static boolean isSuffix(String a, String b){
        b=b.substring(1, b.length());
        return a.lastIndexOf(b)==a.length()-b.length();
    }
    
    public static int boxSeq(int a){
        if (a%2 == 0) return a; 
        else return a+2;
    }
    
    public static void main(String [] args){
        System.out.println(repeat("hello, ", 3));
        System.out.println(isSuffix("hi, i", "-i"));
    }
}
