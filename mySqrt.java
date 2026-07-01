class mySqrt {
    public int sqrtt(int x) {
        if(x==0)
        return 0;
        else if (x==1)
        return 1;
       int  start=1;
       int end=x;
        while(start<=end)
        { int mid = start + (end-start)/2;
            long square = (long) mid * mid;
         if (square > x)
        { end = mid -1 ;}
        else if (square < x){ start = mid +1;}
        else return mid;
        }  return end;
}
}
}
