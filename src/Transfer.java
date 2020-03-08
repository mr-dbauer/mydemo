public class Transfer {
    public static void tr(String t){
       String[] W = t.split("\\s");// Разбиение строки на слова с помощью разграничителя (пробел)
        if (W.length == 3) {
            TransferTwo Www = new TransferTwo();
            TransferTwo Wwb = new TransferTwo();
            Calca Rr = new Calca();
            Www.trtw(W[0]);//переводит первую цифру из String в int
            Wwb.trtw(W[2]);//переводит вторую цифру из String в int
            if ((W[1].equals("+") || W[1].equals("-") || W[1].equals("*") || W[1].equals("/")) && (Www.trtw(W[0]) >= 1 && Www.trtw(W[0]) <= 10 && Wwb.trtw(W[2]) >= 1 && Wwb.trtw(W[2]) <= 10)) {
                Rr.calca(Www.trtw(W[0]), Wwb.trtw(W[2]), W[1]);//определяет операцию между цифрами
                Rr.calca(Www.trtw(W[0]), Wwb.trtw(W[2]), W[1]);//определяет операцию между цифрами
                Trasforming Sw = new Trasforming();
                Sw.Ss(Rr.calca(Www.trtw(W[0]), Wwb.trtw(W[2]), W[1]), W[0], W[2]);
                System.out.println("Ваш ответ: " + Sw.z);
            } else {
                System.out.println("ОШИБКА: Невереный диапазон значений или неизвестная математическая операция!");
            }
        } else {System.out.println("ОШИБКА: Некорректно введено выражение!");}
    }
}

