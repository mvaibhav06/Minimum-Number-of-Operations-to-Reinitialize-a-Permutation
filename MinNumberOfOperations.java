public class MinNumberOfOperations {
    public int reinitializePermutation(int n) {
        int[] perm = new int[n];
        int counter = 0;

        int[] input = new int[n];
        for(int i=0; i<n; i++){
            input[i] = i;
        }

        while(true){

            for(int i=0; i<n; i++){
                if(i%2 == 0){
                    perm[i] = input[i/2];
                }else{
                    perm[i] = input[(n/2) + (i-1)/2];
                }
            }
            counter++;
            int k=0;
            for(k=0; k<n; k++){
                if(perm[k]!=k){
                    break;
                }
            }
            if(k == n){
                return counter;
            }
            input = perm;
            perm = new int[n];
        }
    }
}
