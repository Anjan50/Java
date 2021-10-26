class SortingAlgo 
{

	/* =====Bubble Sort===== */
    public void bubbleSort(int arr[]) 
    {
        for (int i = 0; i < arr.length-1; i++) 
        {
            for (int j = 0; j < arr.length-i-1; j++) 
            {
                if (arr[j] > arr[j+1]) 
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
    /* =====Selection Sort===== */
    public void selectionSort(int arr[])
    {
        for (int i = 0; i < arr.length-1; i++)
        {
        	int min = i;
            for (int j = i+1; j < arr.length; j++) 
            {
            	if (arr[j] < arr[min])
            	{
            		min = j;
            	}        
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
            }
        }
    }
    
    /* =====Insertion Sort===== */
    public void insertionSort(int arr[])
    {
        for (int i = 1; i < arr.length; ++i) 
        {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) 
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
   
    /* =====Merge Sort===== */
    public void mergeSort(int arr[], int l, int r)
    {
        if (l < r) {
            int m =l+ (r-l)/2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
       
    }
    public void merge(int arr[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; ++i)
        {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; ++j)
        {
            R[j] = arr[m + 1 + j];
        }
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) 
        {
            if (L[i] <= R[j]) 
            {
                arr[k] = L[i];
                i++;
            }
            else 
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) 
        {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) 
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
 
    /* =====Quick Sort===== */
    public void quickSort(int[] a, int p, int r)
    {
        while(p<r)
        {
            int q=partition(a,p,r);
            if (q-p <= r-(q+1))
            {
                quickSort(a,p,q);
                p=q+1;
            }
            else
            {
                quickSort(a,q+1,r);
                r=q;
            }
        }
    }
    public int partition(int[] a, int p, int r) {

        int x = a[p];
        int i = p-1;
        int j = r+1;

        while (true) {
            while (++i < r && a[i] < x);
            while (--j > p && a[j] > x);

            if (i < j) {
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            } else {
                return j;
            }
        }
    }

}
