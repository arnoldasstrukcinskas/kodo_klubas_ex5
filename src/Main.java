public class Main {
    public static void main(String[] args) {
        String Main = "WtHvcJrNBhjRWgmdqwbnGHswXBdsNCenfEkiEQhmswqanjWRrWtrEdfBGHNeekGYopwqQasjklkWUJcnuybxKKbxasjkwxmncecvLUIuysgkjhdaLkDFASVXZCMWsHGdQNbnkpolDryinboteSjDg";
        System.out.println(Main);
        /////
        String firstRow = "qwertyuiop";
        String secondRow = "asdfghjkl";
        String thirdRow = "zxcvbnm";

        String firstRowUpper = "QWERTYUIOP";
        String secondRowUpper = "ASDFGHJKL";
        String thirdRowUpper = "ZXCVBNM";



        //susikuriau array, kur viena raide negalima
        /*
        char[] notAllowedChar = firstRow.toCharArray();
        String[] notAllowedString = new String[notAllowedChar.length];
        for (int i = 0; i < notAllowedChar.length; i++) {
            notAllowedString[i] = String.valueOf(Character.toUpperCase(notAllowedChar[i]));
        }
        //////////
        char[] notAllowedChar1 = secondRow.toCharArray();
        String[] notAllowedString1 = new String[notAllowedChar1.length];
        for (int i = 0; i < notAllowedChar1.length; i++) {
            notAllowedString1[i] = String.valueOf(Character.toUpperCase(notAllowedChar1[i]));
        }
        ////////
        char[] notAllowedChar2 = thirdRow.toCharArray();
        String[] notAllowedString2 = new String[notAllowedChar2.length];
        for (int i = 0; i < notAllowedChar2.length; i++) {
            notAllowedString2[i] = String.valueOf(Character.toUpperCase(notAllowedChar2[i]));
        }*/



        //susikuriau array 2 negalimu simboliu
        String[] notAllowedPairs = new String[firstRow.length() - 1];
        String[] notAllowedPairs1 = new String[secondRow.length() - 1];
        String[] notAllowedPairs2 = new String[thirdRow.length() - 1];

        String[] notAllowedPairsUpper = new String[firstRow.length() - 1];
        String[] notAllowedPairsUpper1 = new String[secondRow.length() - 1];
        String[] notAllowedPairsUpper2 = new String[thirdRow.length() - 1];



        //// issiskaidziau egiptietiskas eilutes po 2 char
        for (int i = 0; i < firstRow.length() - 1; i++) {
            notAllowedPairs[i] = firstRow.substring(i, i + 2);
            notAllowedPairsUpper[i] = firstRowUpper.substring(i, i + 2);
        }
        ////
        for (int k = 0; k < secondRow.length() - 1; k++) {
            notAllowedPairs1[k] = secondRow.substring(k, k + 2);
            notAllowedPairsUpper1[k] = secondRowUpper.substring(k, k + 2);
        }
        ////
        for (int l = 0; l < thirdRow.length() - 1; l++) {
            notAllowedPairs2[l] = thirdRow.substring(l, l + 2);
            notAllowedPairsUpper2[l] = thirdRowUpper.substring(l, l + 2);
        }


        ///////// istryniau dvejas raides
        for (int i = 0; i < notAllowedPairs1.length; i++)
        {
            if (Main.contains(notAllowedPairs[i]))
            {
                Main = Main.replace(notAllowedPairs[i], "");
                //firstRow = firstRow.replace(notAllowedPairs[i], "");
            }
            if (Main.contains(notAllowedPairsUpper[i]))
            {
                Main = Main.replace(notAllowedPairsUpper[i], "");
                //firstRowUpper = firstRowUpper.replace(notAllowedPairsUpper[i], "");
            }
        }

        for (int i = 0; i < notAllowedPairs1.length; i++)
        {
            if (Main.contains(notAllowedPairs1[i]))
            {
                Main = Main.replace(notAllowedPairs1[i], "");
                //secondRow = secondRow.replace(notAllowedPairs1[i], "");
            }
            if(Main.contains(notAllowedPairsUpper1[i]))
            {
                Main = Main.replace(notAllowedPairsUpper1[i], "");
                secondRowUpper = secondRowUpper.replace(notAllowedPairsUpper1[i], "");
            }
        }
        for (int i = 0; i < notAllowedPairs2.length; i++) {
            if (Main.contains(notAllowedPairs2[i])) {
                Main = Main.replace(notAllowedPairs2[i], "");
            }
            if(Main.contains(notAllowedPairsUpper2[i])) {
                Main = Main.replace(notAllowedPairsUpper2[i], "");
            }
        }
        //String Main = "asdasdadsJmKiLNT";
        String[] lastTryUppers = new String[Main.length()];
        String[] lastTryLowers = new String[Main.length()];
        char[] oneMore = Main.toCharArray();
        for(int i = 0; i < lastTryUppers.length - 1; i++)
        {
            if(Character.isUpperCase(oneMore[i]) && Character.isUpperCase(oneMore[i + 1]))
            {
                lastTryUppers[i] = String.valueOf(oneMore[i]) + String.valueOf(oneMore[i + 1]);
                if(lastTryUppers[i] != null) {
                    Main = Main.replace(lastTryUppers[i], "");
                }
            }
            if(Character.isLowerCase(oneMore[i]) && Character.isLowerCase(oneMore[i + 1]))
            {
                    lastTryLowers[i] = String.valueOf(oneMore[i]) + String.valueOf(oneMore[i + 1]);
                    if(lastTryLowers[i] != null) {
                        Main = Main.replace(lastTryLowers[i], "");
                    }
            }
            System.out.println(lastTryUppers[i] + " " + lastTryLowers[i]);
        }
        System.out.println(Main);
        /* kitas variantas

        char[] lastTryUppers = new char[Main.length()];
        char[] lastTryLowers = new char[Main.length()];
        char[] oneMore = Main.toCharArray();

        for (int i = 0; i < lastTryUppers.length - 1; i++) {
            System.out.println(oneMore[i]);
            if (Character.isUpperCase(oneMore[i]) && Character.isUpperCase(oneMore[i + 1])) {
                lastTryUppers[i] = oneMore[i];
                Main = Main.replace(String.valueOf(lastTryUppers[i]), "");
            }
            if (Character.isLowerCase(oneMore[i]) && Character.isLowerCase(oneMore[i + 1])) {
                lastTryLowers[i] = oneMore[i];
                Main = Main.replace(String.valueOf(lastTryLowers[i]), "");
            }
            System.out.println(lastTryUppers[i]);
        }*/



        ///issitrinu raides, kurios vienodos ir viena didzioji, kita mazoji
        /*
        for (int i = 0; i < notAllowedString.length; i++) {
            if (Main.contains(notAllowedString[i])) {
                Main = Main.replace(notAllowedString[i], "");
            }
        }
        for (int i = 0; i < notAllowedString1.length; i++) {
            if (Main.contains(notAllowedString1[i])) {
                Main = Main.replace(notAllowedString1[i], "");
            }
        }
        for (int i = 0; i < notAllowedString2.length; i++) {
            if (Main.contains(notAllowedString2[i])) {
                Main = Main.replace(notAllowedString2[i], "");
            }
        }
*/
    }
}
//WtHvcJrNBRWgmdGHswXBdsNCenfEkiEQhmswqanjWRrWtrEBGHNeekGYopwqQlkWUJcnuybxKKbxwxmnceLUIuysgkjhdaLkDFASVXZCMWsHGdQNkpolDryinboteSjDg
//rNBRWgmdswdsenfEkihmswqanjrWEBGHNkopwqQWUJcnuybxbxwxmnceLUIuysgkjhdaLkDFASVXZCMWQNkpolDryinboteSjDg