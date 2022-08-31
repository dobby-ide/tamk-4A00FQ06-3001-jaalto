

public class Program {

    int searchArray(int[] array, int value){
        for(int i=0;i<array.length;i++){
            if(array[i]==value){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Program program= new Program();
        int[] array= {1,2,3,4,5,6,7,8,9};
        int result=program.searchArray(array, 3);
        System.out.println(result);
    }
}
