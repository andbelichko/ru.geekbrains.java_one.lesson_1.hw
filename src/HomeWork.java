

public class HomeWork {


    private static boolean checkWin(char symb) {
        for (int i = 0; i < field.length; i++){
            for(int j = 0; j < field.length; j++){
                if(field[i][field.length - 3] == symb && field[i][field.length - 2] == symb && field[i][field.length - 1] == symb) return true;
                if(field[field.length - 3][j] == symb && field[field.length - 2][j] == symb && field [field.length - 1][j] == symb) return true;
                if(field [i][i] == symb && field[field.length - 2][field.length - 2] == symb && field[field.length - 1][field.length - 1] == symb) return true;
                if(field [field.length - 1][i] == symb && field[field.length - 2][field.length - 2] == symb && field[i][field.length - 1] == symb) return true;
            }

        }
        return false;

    }

}











