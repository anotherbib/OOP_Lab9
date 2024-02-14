public class Sprinkler implements HomeAppliance{
    private Mediator mediator;
    public void setMediator(Mediator mediator){
        this.mediator = mediator;
    }
    public void doTask() {
        System.out.println("I am sprinkler,... doing my task");
        mediator.endAlarm("Sprinkler");
    }
}
