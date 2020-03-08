public class Trasforming {
    public static int d,k,g;
    public static String z,x;
    public static int Ss (int S, String Ss, String SS) {
        if((Ss.equals("I")|| Ss.equals("II") || Ss.equals("III")|| Ss.equals("IV")|| Ss.equals("V")|| Ss.equals("VI")|| Ss.equals("VII")|| Ss.equals("VIII")|| Ss.equals("IX")|| Ss.equals("X")) && (SS.equals("I")|| SS.equals("II") || SS.equals("III")|| SS.equals("IV")|| SS.equals("V")|| SS.equals("VI")|| SS.equals("VII")|| SS.equals("VIII")|| SS.equals("IX")|| SS.equals("X"))) {
            k = S % 10;
            g = (int) Math.floor(S/10);
            if (S < 0) {
                switch (g){
                    case 1: z = "X";
                        break;
                    case 2: z = "XX";
                        break;
                    case 3: z = "XXX";
                        break;
                    case 4: z = "XL";
                        break;
                    case 5: z = "L";
                        break;
                    case 6: z = "LX";
                        break;
                    case 7: z = "LXX";
                        break;
                    case 8: z = "LXXX";
                        break;
                    case 9: z = "XC";
                        break;
                    case 10: z = "C";
                        break;
                    default: z = "";
                }
                switch (k) {
                    case -1: z = "-"+ z + "I";
                        break;
                    case -2: z = "-"+ z + "II";
                        break;
                    case -3: z = "-"+ z + "III";
                        break;
                    case -4: z = "-"+ z + "IV";
                        break;
                    case -5: z = "-"+ z + "V";
                        break;
                    case -6: z = "-"+ z + "VI";
                        break;
                    case -7: z = "-"+ z + "VII";
                        break;
                    case -8: z = "-"+ z + "VIII";
                        break;
                    case -9: z = "-"+ z + "IX";
                        break;
                    default: z = "-"+ z + "";
                }

            } else if (S==0) {
                z = "nulla";
            } else {
                switch (g) {
                    case 1:
                        z = "X";
                        break;
                    case 2:
                        z = "XX";
                        break;
                    case 3:
                        z = "XXX";
                        break;
                    case 4:
                        z = "XL";
                        break;
                    case 5:
                        z = "L";
                        break;
                    case 6:
                        z = "LX";
                        break;
                    case 7:
                        z = "LXX";
                        break;
                    case 8:
                        z = "LXXX";
                        break;
                    case 9:
                        z = "XC";
                        break;
                    case 10:
                        z = "C";
                        break;
                    default:
                        z = "";
                }
                switch (k) {
                    case 1:
                        z = z + "I";
                        break;
                    case 2:
                        z = z + "II";
                        break;
                    case 3:
                        z = z + "III";
                        break;
                    case 4:
                        z = z + "IV";
                        break;
                    case 5:
                        z = z + "V";
                        break;
                    case 6:
                        z = z + "VI";
                        break;
                    case 7:
                        z = z + "VII";
                        break;
                    case 8:
                        z = z + "VIII";
                        break;
                    case 9:
                        z = z + "IX";
                        break;
                    default:
                        z = z + "";
                }
            }
        } else if((Ss.equals("1")|| Ss.equals("2") || Ss.equals("3")|| Ss.equals("4")|| Ss.equals("5")|| Ss.equals("6")|| Ss.equals("7")|| Ss.equals("8")|| Ss.equals("9")|| Ss.equals("10")) && (SS.equals("I")|| SS.equals("II") || SS.equals("III")|| SS.equals("IV")|| SS.equals("V")|| SS.equals("VI")|| SS.equals("VII")|| SS.equals("VIII")|| SS.equals("IX")|| SS.equals("X"))) {
            System.out.println("Так делать нельзя!");
        } else if((Ss.equals("I")|| Ss.equals("II") || Ss.equals("III")|| Ss.equals("IV")|| Ss.equals("V")|| Ss.equals("VI")|| Ss.equals("VII")|| Ss.equals("VIII")|| Ss.equals("IX")|| Ss.equals("X")) && (SS.equals("1")|| SS.equals("2") || SS.equals("3")|| SS.equals("4")|| SS.equals("5")|| SS.equals("6")|| SS.equals("7")|| SS.equals("8")|| SS.equals("9")|| SS.equals("10"))) {
            System.out.println("Так делать нельзя!");
        } else {
            z = String.valueOf(S);
        }
            return d;
    }
}
