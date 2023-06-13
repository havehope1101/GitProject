import java.time.LocalDate;
import java.util.Date;

public class StopWatch {
    private Date startTime;
    private Date endTime;
    public StopWatch(){

    }

    public StopWatch(Date startTime, Date endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

//    public Date start(){
//      return this.startTime = java.time.LocalDate.now();
//    }
//
//    public Date stop() {
//       return this.endTime = java.time.LocalDate.now();
//    }

//    public LocalDate getElapsedTime() {
//        return ();
//    }
}
