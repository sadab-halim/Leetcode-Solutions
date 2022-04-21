class MyHashSet {

    int[] arr;
    
    public MyHashSet() {
     arr=new int[1000001];    
    }
    
    public void add(int key) {   
        arr[key]=1;    //O(1)
    }
    
    public void remove(int key) {
        arr[key]=0;    //O(1)
    }
    
    public boolean contains(int key) {
        //O(1)
        if(arr[key]==0) return false;
        else return true;
    }
}
