public class MyArrays {

    public static int insert(int[] values, int currentSize, int pos, int newElement)
    {
        if(currentSize < values.length)
        {
            for(int i=currentSize-1; i > pos-1; i--)
            {
                values[i+1]=values[i];
            }

            values[pos-1]=newElement;
            currentSize++;
        }

        return currentSize;
    }

    public static int remove(int[] values, int currentSize, int pos)
    {
        for(int i = pos;i<currentSize;i++)
        {
            values[i]=values[i+1];
        }

        currentSize--;

        return currentSize;
    }
}
