package org.dy.test;

public class QuickSort {
    int[] arr = {49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};

    public QuickSort(){
        quick(arr);
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }
    private int getMiddle(int[] list, int low, int hight){
        int tmp = list[low];
        while (low < hight){
            while (low<hight && list[hight]>=tmp){
                hight--;
            }
            list[low] = list[hight];
            while (low<hight&&list[low]<=tmp){
                low++;
            }
            list[hight] = list[low];
        }

        list[low] = tmp;
        return low;
    }
    private void _quickSort(int[] list, int low, int hight){
        if (low < hight){
            int middle = getMiddle(list,low,hight);
            _quickSort(list,low,middle-1);
            _quickSort(list,middle+1,hight);
        }
    }

    public void quick(int[] a){
        if (a.length>0){
            _quickSort(a,0,a.length-1);
        }
    }
}
