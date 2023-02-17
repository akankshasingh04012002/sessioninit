

public class Main
{
    public static void main(String[] args) 
    {
        
        int array[] = {5,10,50,40,20};
        
        int newArray[] ={5,10,50,40,20};
        
        int sortedArray [] = sortArray(array);
        
        print(sortedArray,newArray);
                
                
    }
    
    /* function for sorting the given Array*/
    
    public static int[] sortArray(int array[])
    {
        
        for(int firstindex= 0; firstindex<array.length; firstindex++)
        {
            
                for(int secondindex= firstindex+1;secondindex<array.length;secondindex++)
                {
                    int temp = 0;
                    
                    if(array[firstindex]>array[secondindex])
                    {
                        
                        temp = array[secondindex];
                        
                        array[secondindex] = array[firstindex];
                        
                        array[firstindex] = temp;
                        
                    }
                }
        }
        return array;
    }
    
    /* function which is printing the actual index of the given array */
    
    public static void print(int sortedArray[],int newArray[])
    {
        for(int firstindex =0 ; firstindex<sortedArray.length; firstindex++){
                    
                for(int secondindex = 0; secondindex<sortedArray.length;secondindex++){
                        
                    if(newArray[firstindex] == sortedArray[secondindex])
                    {
                        System.out.print(" "+secondindex);
                        break;
                    }
                }
        }
        
    }
}
