public class Main {
    public static void main(String[] args) {
// Задание 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        //Задание 2
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName);

        // Задание 3
        firstName = "Семён";
        middleName = "Семёнович";
        lastName = "Иванов";
        fullName = lastName + " " + firstName + " " + middleName;
        if (fullName.contains("ё")) {
            fullName = fullName.replace("ё", "е");
        }
        System.out.println(fullName);

        //Доп.задание 1

        String doubleChar = "The";
        char [] a = doubleChar.toCharArray();
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "" + a[i]);
        }
        System.out.println();

        //Доп. задание 2

        String makeOutWord = "<<>>";
        String makeOutWord2 = "Yay";
        int center = makeOutWord.length() / 2;
        StringBuilder sb = new StringBuilder(makeOutWord);
        sb = sb.insert(center, makeOutWord2);
        System.out.println(sb);

        //Доп. задание 3

        String d = "yo";
        String e = "java";
        if (d.length() == 0) {
            d = "@";
        } else if (e.length() == 0) {
            e = "@";
        }
        String f = d + e;
        System.out.println(f.charAt(0) + "" + f.charAt(f.length() - 1));

        // Доп. задание 4

        String lastTwo = "coding";
        String s = String.valueOf(lastTwo.substring(0, lastTwo.length() - 2) + lastTwo.charAt(lastTwo.length() - 1) + lastTwo.charAt(lastTwo.length() - 2));
        System.out.println(s);

        //Доп.задание 5

        String one = "Hello";
        String two = "java";
        StringBuilder three = new StringBuilder(one + two);
        if (one.length() > two.length()) {
            three = new StringBuilder(three.delete(0, one.length() - two.length()));
            System.out.println(three);
        }
        if (one.length() < two.length()) {
            three = new StringBuilder(three.delete(one.length(), one.length() + (two.length() - one.length())));
            System.out.println(three);
        } else if (one.length() == two.length()) {
            System.out.println(three);
        }

        //Доп.задание 6

        String countHi = "abc hi ho";
        int count = 0;
        char[] v = countHi.toCharArray();
        for (int i = 0; i < v.length; i++) {
            if (v[i] == 'h' && v[i + 1] == 'i') {
                count++;

            }
        }
        System.out.println(count);

        //Доп задание 7

        String repeatEnd = "Hello";
        int number = 3;
        String repeatEnd2 = repeatEnd.substring(repeatEnd.length() - number);
        repeatEnd2 = repeatEnd2.repeat(3);
        System.out.println(repeatEnd2);

        // Доп.задание 8

        String maxBlock = "hooppla";
        int sequence = 0;
        int max = 0;
        char[] seq = maxBlock.toCharArray();
        for (int i = 0; i < seq.length; i++) {
            if (i == 0) {
                sequence = 1;
            }
            if (sequence > max) {
                max = sequence;
            }
            if (i == seq.length - 1) {
                break;
            }
            if (seq[i] == seq[i + 1]) {
                sequence++;
            } else {
                sequence = 1;
            }

        }
        System.out.println(max);

        // Доп.задание 9

        String repeat = "Word";
        String separator = "X";
        int y = 3;
        String p = repeat + separator;
        p = p.repeat(y);
        StringBuilder u = new StringBuilder(p);
        u = new StringBuilder(u.reverse());
        u = new StringBuilder(u.delete(0, 1));
        u = new StringBuilder(u.reverse());
        System.out.println(u);

    }
}