package loadbalancer.v1;

public class App {

    public static void main(String[] args) {

        LoadBalancer roundRobin = new RoundRobin();
        LoadBalancer weightedRoundRobin = new WeightedRoundRobin();

        Controller controller = new Controller();
        controller.setLoadBalancer(roundRobin);
        controller.balance();

        controller.setLoadBalancer(weightedRoundRobin);
        controller.balance();
    }
}
