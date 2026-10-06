// import java.util.ArrayList;

// public class ComputeArray {
//     public static int[] computeArray(int[] array) {
//         // int[] res;

//         ArrayList<Integer> list = new ArrayList<>();

//         for (int i = 0; i < array.length; i++) {
//             if (array[i] % 3 == 0) {
//                 list.add(array[i]*5);
//                 // res = append()
//             }else if (array[i] % 3 == 1) {
//                 list.add(array[i] + 7);
//             }else if (array[i] % 3 == 2) {
//                 list.add(array[i]);
//             }
//             // list.add(array)

//         }

//         int[]res = new int[list.size()];

//         for (int i = 0; i < list.size(); i++){
//             res[i] = list.get(i);
//         }

//         return res;
//     }
// }


public class ComputeArray {
    public static int[] computeArray(int[] array) {
        int[] res = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                res[i] = array[i] * 5;
            }else if (array[i] % 3 == 1 || array[i] % 3 == -1) {
                res[i] = array[i] + 7;
            }else if (array[i] % 3 == 2 || array[i] % 3 == -2) {
                res[i] = array[i];
            }
        }

        return res;
    }
}