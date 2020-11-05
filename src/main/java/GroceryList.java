import java.util.Arrays;
public class GroceryList {
    // instance variables 
    // array of food items 
    private String[] arr;
   
    //constructor with no arguments
    public GroceryList() {
        // our grocery list will have a max size of 10
        this.arr = new String[10]; 
    }

    //add stuff
    public void add(String item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = item;
                break;
            }
        }
    }


     //remove stuff 
     public void remove(String item){
         for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(item)) {
                this.arr[i] = null;
                // shift items to the left in the array after removing a item
                for (int j = i; j < arr.length-1; j++) {
                    arr[j] = arr[j+1];
                }
                break;
            }
        }
    }


     //print out grocery list
     public String toString() {
         String str = ("Grocery list: " + Arrays.toString(arr));
         return str;
     }

}