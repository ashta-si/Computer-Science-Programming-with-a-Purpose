/*
% java


 Name          : Gobal Krishnan V
 Date of Birth : 18/06/1995
 Compilation   : javac BandMatrix.java
 Execution     : java BandMatrix 8 0

 %java BandMatrix 8 0
 *  0  0  0  0  0  0  0
 0  *  0  0  0  0  0  0
 0  0  *  0  0  0  0  0
 0  0  0  *  0  0  0  0
 0  0  0  0  *  0  0  0
 0  0  0  0  0  *  0  0
 0  0  0  0  0  0  *  0
 0  0  0  0  0  0  0  *
 */

// step 1 : (Diagonal) if width == 0, then (0,0),(1,1),(2,2),(3,3),(4,4),(5,5),(6,6),(7,7)
// step 2 : (Diagonal) if width == 1, then [step1 output] + (0,1),(1,2),(2,3),(3,4),(4,5),(5,6),(6,7), (1,0),(2,1),(3,2),(4,3),(5,4),(6,5),(7,6),
// step 3 : (Diagonal) if width == 2, then [step2 output] + (2,0),(3,1),(4,2),(5,3),(6,4),(7,5), (0,2),(1,3),(2,4),(3,5),(4,5),(5,7)
// for step 1 = i and j are equal
// for step 2 = i look previous output, j only increased by 1, for first half and for 2nd half it flipped.
// for step 3 = i look like step1 output, j only increased by 2, if look from step2, it just increased by 1, for first half and for 2nd half it flipper.
// step 1 = i == j
// step 2 = i == j && (i<j+1) && ((i+1)>(j))
// step 3 = i == j && (i<j+2) && ((i+2)>(j))
// j==i-2 || j==i-1 || j==i-0 || i==j-0 || i==j-1 || i==j-2 == for checking
//

public class BandMatrix{
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);

        if( (n <0) || (width < 0)) return;

        for(int i = 0; i < n ; i++ ){

            for(int j = 0, k = 0; j < n ; j++){

                if( Math.abs(i-j) <= width) {
                    System.out.print("*  ");
                }else{

                    System.out.print("0  ");
                }
            }
            System.out.println("");

        }
    }
}

