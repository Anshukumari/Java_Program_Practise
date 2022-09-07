public class DynamicArray {
    private int capacity ;
    private int currentLength;
    private String[] array;

    public DynamicArray()
    {
        this.capacity=3;
        this.currentLength=0;
        this.array = new String[3];
    }

    public String get(int index)
    {
        return this.array[index];
    }

    public void push(String string)
    {
        if(capacity==currentLength)
        {
            String[] tempArray = new String[2*capacity];
            for(int i=0;i<=array.length;i++)
            {
                tempArray[i]=array[i];
            }
            array = tempArray;
            capacity *=2;
        }
        this.array[currentLength] = string;
        currentLength++;
    }

    public void delete(int index)
    {
        if(index>-1 && index < currentLength)
        {
            if(index==currentLength-1)
                pop();
            else
            {
                for(int i=index;i<currentLength-1;i++)
                {
                    array[i]=array[i+1];
                }
                currentLength--;
            }
        }
        else {
            System.err.println("Index out of bounds");
        }
    }

    public String[] getArray()
    {
        String[] arr= new String[currentLength];
        for(int i=0;i<currentLength;i++)
        {
            arr[i] = array[i];
        }
        return  arr;
    }
    public int length()
    {
        return  currentLength;
    }

    public void pop()
    {
        if(currentLength>0)
        {
            --currentLength;
        }
    }

    public void replace(String string, int index)
    {
        if(index > -1 && index < currentLength)
        array[index] = string;
        else
            System.out.println("Index out of bound");
    }
    public static void main(String[] args){
        DynamicArray dynamicarray = new DynamicArray();
        dynamicarray.push("apple");
        dynamicarray.push("mango");
        dynamicarray.push("banana");
        System.out.println(dynamicarray.length());
        System.out.println(dynamicarray.get(0));
        dynamicarray.pop();
        dynamicarray.replace("coconut",0);
        System.out.println(dynamicarray.length());
        dynamicarray.delete(1);
        System.out.println(dynamicarray.get(1));
        System.out.println(dynamicarray.length());
    }
}
