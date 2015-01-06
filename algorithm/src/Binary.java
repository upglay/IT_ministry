/**
 * Created by upglay on 2015-01-06.
 */
public class Binary {
    protected int size;
    protected int[] A;
    protected int p=0;

    public Binary(int n){
        this.size = n;
        A = new int[size];
        for(int i=0;i<n;i++)
            A[i] = 0;
    }

    void solve(int n){
        if(n < 1){
            for(int i=0;i<size;i++) {
                System.out.print(A[i]);
            }
            System.out.print("\n");
            p++;
        }
        else{
            A[n - 1] = 0;
            solve(n - 1);
            A[n - 1] = 1;
            solve(n - 1);
        }
    }
}
