package bubblesort;

public class bubbleSort {
    public static void main(String[] args) {
        int[] itemList = new int[]{70,61,72,83,38};
        itemSort(itemList);

    }
    static void itemSort(int[] itemList){
        for(int i=0; i < itemList.length; i++){
            for(int j=0; j < itemList.length-1; j++){
                if(itemList[j] > itemList[j+1]){
                    int temp = itemList[j];
                    itemList[j] = itemList[j+1];
                    itemList[j+1] = temp;
                }
            }
        }
        for(int i=0; i < itemList.length; i++){
            System.out.print(itemList[i] + " ");
        }
    }

}
