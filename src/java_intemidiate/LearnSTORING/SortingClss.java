package java_intemidiate.LearnSTORING;

public class SortingClss {


    public static void main(String[] args) {

        
        int [] notsorted = { 55, 89,69,75,2,41,14,3};
        
                for (int a= 0 ; a < notsorted.length; a++){

                    for (int b= a+1 ; b < notsorted.length; b++){

                        int tmp;

                        if (notsorted [b] <notsorted[a]){

                            tmp = notsorted[a];

                            notsorted[a] = notsorted[b];

                            notsorted[b]= tmp;








                        


                            
                            
                        }

                    }
                    System.out.println(notsorted[a]);
                }
    }
}
