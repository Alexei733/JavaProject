package Hw_8;

public class CapitalizeWords {


    public class hf {



    /*
    Написать алгоритм CapitalizeWorlds, который принимает на вход предложение
    с единичным пробелом между словами,
    и возвращает предложение, в котором все слова написаны с большой буквы
    "          happy birthday!  " ----> "Happy Birthday!"
    "  join jacob smith jr." ----> "Jon jacob Smith Jr."
*/

        public  String CapitalizeWorlds(String sentence) {
            //пустой String = "";
            //String str = null;

            if (sentence != null && sentence.length() != 0) {
                sentence = sentence.trim();

                sentence = sentence.substring(0, 1).toUpperCase() + sentence.substring(1);


                for (int i = 1; i < sentence.length(); i++) {

                    if (sentence.charAt(i) == ' ') {
                        sentence = sentence.substring(0, i + 1)
                                + sentence.substring(i + 1, i + 2).toUpperCase()
                                + sentence.substring(i + 2);


                    }

                }


                return sentence;

            }

            return " ";
        }

        public  void main(String[] args) {
            System.out.println("      malamama! Postman     enD  ");
            System.out.println(CapitalizeWorlds("        happy birtday!"));
            System.out.println(CapitalizeWorlds("   happy birtday!"));
            System.out.println(CapitalizeWorlds(""));
            System.out.println(CapitalizeWorlds(null));

        }

    }


}
