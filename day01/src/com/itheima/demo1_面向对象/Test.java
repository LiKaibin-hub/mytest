

        //面向过程
        int [] arr = {10,20,30,40,50};
        for (int i = 0;i<arr.length;i++){
            if(i==0){
                System.out.print("["+arr [i]+",");
            }else if(i==arr.length-1){
                System.out.print(arr [i]+"]");
            }else {
                System.out.print(arr[i]+",");
            }
    
        }


        //面向对象
        System.out.println(Arrays.toString(arr));



    }
}
