
/**
 * Created by marti on 2017.04.26..
 */
public class One {

    private int[] nums;
    private int upto;

    public One(int upto) {
        this.nums = new int[]{3, 5};
        this.upto = upto;
    }

    public void setNums(int[] nums) {
        this.nums = nums;
    }


    public int multiples() {
        int result = 0;
        for (int i=1; i< this.upto;i++) {
            for (int j : this.nums)
            if (i % j == 0) {
                result += i;
                break;
            }
        }
        return result;
    }

}


