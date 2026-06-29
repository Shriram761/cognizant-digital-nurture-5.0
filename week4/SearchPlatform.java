import java.util.Arrays;

class Product{
    int productId;
    String productName;
    String category;

    public Product(int productId,String productName,String category) {
        this.productId =productId;

        this.productName=productName;
        this.category=category;
    }

    public String toString() {return "ID: "+productId+" | Name: "+productName;}
}

public class SearchPlatform{

    static int linSearch(Product[] arr,int targetId) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].productId == targetId) return i;
        }
        return -1;
    }



    static int binSearch(Product[] arr,int targetId) {
        int l=0;
        int r=arr.length-1;

        while(l <= r) {
            int mid = l + (r - l) / 2;
            if(arr[mid].productId == targetId)   return mid;
            if(arr[mid].productId < targetId)  l = mid + 1;
            else r = mid - 1;

        }
        return -1;
    }

    public static void main(String[] args){
        Product[] prods = {
                new Product(105,"Wireless Mouse","Electronics"),
                new Product(101,"Mechanical Keyboard","Electronics"),
                new Product(109,"Gaming Monitor","Electronics"),
                new Product(102,"Office Chair","Furniture")};

        int searchId=109;

        int linRes=linSearch(prods,searchId);


        System.out.println("Linear Search:");

        if(linRes!=-1) {
            System.out.println("Found at index " +linRes +" -> "+prods[linRes]);}
         else {System.out.println("Product not found.");}

        System.out.println("\n------------------\n");

        Arrays.sort(prods,(a,b)->a.productId-b.productId);

        int binRes=binSearch(prods,searchId);


        System.out.println("Binary Search (after sorting):");

        if(binRes!=-1) {
            System.out.println("Found at index " +binRes+" -> "+prods[binRes]);
        } else {System.out.println("Product not found.");}
    }
}