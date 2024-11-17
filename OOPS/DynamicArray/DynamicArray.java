package JAVA.OOPS.DynamicArray;

public class DynamicArray {
    private int [] data;
    private int nextIndex;

    public DynamicArray() {
        data = new int [5];
        nextIndex = 0;
    }

    public int size (){
        return nextIndex;
    }

    public void add (int element){

        if(nextIndex==data.length){
            restructure();
        }

        data[nextIndex]=element;
        nextIndex++;

    }

    public void set(int index, int element){
        if(index>nextIndex){
            return;
        }
        else if(index<nextIndex){
            data[index] = element;
        }else{
            add(element);
        }
    }

    public int get(int index){
        if(index>=nextIndex){
            return -1;
        }
        return data[index];
    }

    public boolean isEmpty(){
        return (size() == 0) ? true : false;
    }

    public int removeLast(){

        if(size()==0){
            return -1;
        }
        int value = data[nextIndex-1];
        data[nextIndex-1]=0;
        nextIndex--;
        return value;
    }

    private void restructure() {
        int[] temp = data;
        data = new int [data.length*2];
        for (int i =0;i<temp.length;i++){
            data[i]=temp[i];
        }

    }



}
