package operatingsystemscheduler;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bhanuka
 */
public class ExecutionLog {
    
    private int startTime;
    private int endTime;
    
    public ExecutionLog(int start){
        this.startTime = start;
        this.endTime = start;
    }
    
    public int getStartTime(){
        return this.startTime;
    }
    
    public int getEndTime(){
        return this.endTime;
    }
    
    public void setEndTime(int end){
        this.endTime = end;
    }
    
    public void print(){
        System.out.println("Start Time : "+ this.startTime);
        System.out.println("End Time   : "+ this.endTime);
    }
}
