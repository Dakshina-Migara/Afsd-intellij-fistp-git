package lk.acpt.app.controll;

public final class Tes {
    public static void main(String[] args) {

        //refrence variable eka object eka atharinawa
        //object eka heap eke ohe pawi pawi innawa addreess ekak nethuhwa
        Controll controll = new Controll();
        controll = null;


        //currunt object eka ain karala aluth object ekak dagannawa
        Controll con = new Controll();
        con = new Controll();

        //garbage collector eka manually
        System.gc();




//        //boxxing
//        int val1 = 23;
//        Integer val2 = val1;
//
//        //unboxing
//        Integer val3 = 24;
//        int val4 = val3;

        final int val5 = 23;

    }

    public static void dance(){

    }
}
