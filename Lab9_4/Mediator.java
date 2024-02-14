import java.util.ArrayList;

public class Mediator{
    ArrayList<HomeAppliance> appliance = new ArrayList<>();
    Alarm alarm;

    public void addAppliance(HomeAppliance appliance) {
        this.appliance.add(appliance);
    }

    public void doTask(){
        for(HomeAppliance appliance : appliance){
            appliance.doTask();
        }
    }

    public void addAlarm(Alarm alarm){
        this.alarm = alarm;
    }

    public Alarm getAlarm(){
        return alarm;
    }

    public void doAlarm(){
        alarm.doAlarm();
    }

    public void endAlarm(String from){
        alarm.endAlarm(from);
    }

}