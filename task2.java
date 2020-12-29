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
//4. Создайте метод, который берет массив целых чисел и возвращает массив, в
//котором каждое целое число является суммой самого себя + всех предыдущих
//чисел в массиве.
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
 
//5. Создайте функцию, которая возвращает число десятичных знаков, которое имеет
//число (заданное в виде строки). Любые нули после десятичной точки
//отсчитываются в сторону количества десятичных знаков. 
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
 
//6. Создайте функцию, которая при заданном числе возвращает соответствующее
//число Фибоначчи. 
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
    
	
//7. Почтовые индексы состоят из 5 последовательных цифр. Учитывая строку,
//напишите функцию, чтобы определить, является ли вход действительным
//почтовым индексом. Действительный почтовый индекс выглядит следующим
//образом:
//– Должно содержать только цифры (не допускается использование нецифровых цифр).
//– Не должно содержать никаких пробелов.
//– Длина не должна превышать 5 цифр. 
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
    
//8Пара строк образует странную пару, если оба из следующих условий истинны:
//– Первая буква 1-й строки = последняя буква 2-й строки.
//– Последняя буква 1-й строки = первая буква 2-й строки.
//– Создайте функцию, которая возвращает true, если пара строк представляет собой
//странную пару, и false в противном случае. 
    public static boolean isStrangePair(String a, String b){
        if ((a=="") & (b=="")) return true; // вернуть true если строки пустые
        return (a.charAt(0)==b.charAt(b.length()-1))&(b.charAt(0)==a.charAt(a.length()-1));
    }
    
//9. Создайте две функции: isPrefix(word, prefix-) и isSuffix (word, -suffix).
//– isPrefix должен возвращать true, если он начинается с префиксного аргумента.
//– isSuffix должен возвращать true, если он заканчивается аргументом суффикса.
//– В противном случае верните false. 
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
    }
}
