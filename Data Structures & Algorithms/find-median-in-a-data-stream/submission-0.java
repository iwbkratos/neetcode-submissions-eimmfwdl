class MedianFinder {

    PriorityQueue<Integer> max;
    PriorityQueue<Integer> min;

    public MedianFinder() {
        min = new PriorityQueue<Integer>(); 
        max = new PriorityQueue<Integer>((a,b)->b-a);
    }
    
    public void addNum(int num) {
        if(max.size()==0)
            max.add(num);
        else if(num <= max.peek())
        {
            max.add(num);
        }
        else
        {
            min.add(num);
        }

        if(max.size() - min.size() > 1)
        {
            int temp = max.peek();
            max.remove();
            min.add(temp);
        }
        if( max.size() - min.size() < 0)
        {
            int temp = min.peek();
            min.remove();
            max.add(temp);
        }
    }
    
    public double findMedian() {
        
        int size = max.size() + min.size();

        if(size%2 == 1)
        {
            return max.peek();
        }
        else
        {
            return (double)(max.peek() + min.peek())/2;
        }
    }
}
