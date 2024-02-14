public class App {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        HomeAppliance sprinkler = new Sprinkler();
        HomeAppliance coffeepot = new CoffeePot();
        Alarm alarm = new Alarm();
        mediator.addAlarm(alarm);
        mediator.addAppliance(sprinkler);
        mediator.addAppliance(coffeepot);

        alarm.setMediator(mediator);
        sprinkler.setMediator(mediator);
        coffeepot.setMediator(mediator);

        mediator.doAlarm();
    }
}
