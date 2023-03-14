package Programs;

import Interface.Interface_1280x720;
import Interface.Interface_720x400;
import Utilities.MyArrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

public class Start {

    public static void main(String[] args) {
//        Interface_1280x720 inter1 = new Interface_1280x720();
//        inter1.setVisible(true);
//        // inter1.main(null);
//
//        Interface_720x400 inter2 = new Interface_720x400();
//        inter2.setVisible(true);
//        // inter2.main(null);

        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        MyArrays.print(array);

        MyArrays.add(array, 5);

        MyArrays.print(array);

    }


}
