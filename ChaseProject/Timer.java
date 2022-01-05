package ChaseProject;



public class Timer
{
    private double startTime;
    
    
    public Timer()
    {
        startTime = System.currentTimeMillis();
        
    }

    public double elapsedMilliseconds()
    {
        return System.currentTimeMillis() - startTime;
        
    }
    
    public double elapsedSeconds()
    {
        return this.elapsedMilliseconds()/1000;
        
    }
    
    public void reset()
    {
        startTime = System.currentTimeMillis();
        
    }
    
}
