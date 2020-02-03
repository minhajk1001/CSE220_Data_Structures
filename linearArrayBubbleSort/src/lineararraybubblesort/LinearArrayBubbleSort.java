package lineararraybubblesort;

public class LinearArrayBubbleSort {

    public static void main(String[] args) {
        int linerArr[] = new int[20];
        //generates random numbers
        for (int i = 0; i < linerArr.length; i++) {
            int x = (int) Math.ceil(Math.random() * 100);
            linerArr[i] = x;
        }
        
        //print original array
        System.out.println("#Original Array:");
        for(int i: linerArr)
            System.out.print(i+" ");
        System.out.println();
        
        //bubble sort
        int condition = linerArr.length;
        for(int i=0; i<linerArr.length; i++){
            for(int j=0; j<condition-1; j++){
                if(linerArr[j] > linerArr[j + 1]){
                    int temp = linerArr[j];
                    linerArr[j] = linerArr[j + 1];
                    linerArr[j + 1] = temp;
                }
            }
            condition--;
        }
        
        //print sorted array
        System.out.println("#Bubble Sorted Array");
        for(int i: linerArr)
            System.out.print(i+" ");
        System.out.println();
    }

}
