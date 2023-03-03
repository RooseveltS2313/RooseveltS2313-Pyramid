
public class Application {
    /**
     * This class contains a main method that allows you to manually test the Pyramid lab.
     * No changes you make here affect the test case results. You must still run & pass the test cases.
     * All implementation code should be written in the Pyramid class.
     *
     * example output:
     *      size 3:
     *      *
     *      **
     *      ***
     *
     *      size 5:
     *      *
     *      **
     *      ***
     *      ****
     *      *****
     *
     * @param args
     */
    public static void main(String[] args) {
        Pyramid pyr = new Pyramid();
        System.out.println("Current output for a size 3 pyramid: ");
        System.out.println(pyr.returnPyramid(3));
        System.out.println("Current output for a size 5 pyramid: ");
        System.out.println(pyr.returnPyramid(5));

        String pyramid = "";
        int n = 5;
        
        for (int i = 0; i <= n; i++){
            for (int j = 0; j < i; j++){
               pyramid = pyramid + "*";
            }
            pyramid = pyramid + "\n";
        }
       
        System.out.println(pyramid);
    }
}
