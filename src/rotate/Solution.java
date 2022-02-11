package rotate;

/**
 * @author tachai on 2022/2/11 9:44 下午
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Solution {

    public void rotate(int[][] matrix){

    }


    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        int n = matrix.length;
        int[][] tempData = new int[n][n];

        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                tempData[j][n-i-1]=matrix[i][j];
            }
        }


        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=tempData[i][j];
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }
}
