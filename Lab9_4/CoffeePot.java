public class CoffeePot implements HomeAppliance{
    private Mediator mediator;

    public void setMediator(Mediator mediator){
        this.mediator = mediator;
    }

    public void doTask() {
        System.out.println("I am coffe pot,... doing my task");
        mediator.endAlarm("Coffee Pot");
    }

}
