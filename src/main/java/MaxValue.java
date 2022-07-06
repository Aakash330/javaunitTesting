public class MaxValue {

    public static int sfindTheMaxvalue(int[] r)
    {
        int max=0;
        for (int i=0;i<r.length;i++)
        {
            if(max<r[i])
            {
                max=r[i];
            }
        }
        return max;
    }
}
