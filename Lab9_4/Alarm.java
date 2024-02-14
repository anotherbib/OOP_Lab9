public class Alarm {
    private Mediator mediator;

    public void setMediator(Mediator mediator){
        this.mediator = mediator;
    }

    public void doAlarm() {
        System.out.println("Alarm is sending event to all...");
        mediator.doTask();
    }
    public void endAlarm(String from) {
        System.out.println("Alarm event ended from " + from);
    }

}