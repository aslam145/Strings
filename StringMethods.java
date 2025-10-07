public class StringMethods {
    public static void main(String[] args) {
        // concatination
        String name1="aslam";
        String name2="pasha";
        System.out.println(name1+name2);
        // length of string
        String fullname=name1+name2;
        System.out.println(fullname.length());
        // charAt
        for(int i=0; i<fullname.length(); i++){
        System.out.print(fullname.charAt(i));
        }System.out.println();
        // compare
        // here we get 3 cases
        // 1->n1>n2=+ value
        // 2->n1<n2=-value
        // 3->n1==n2=0
        if(name1.compareTo(name2)==0){
        System.out.println("strings are equal");
        }else{
            System.out.println("strings are not equal");
        }
    }
}
