package loadbalancer.v1;

public class WeightedRoundRobin extends LoadBalancer{

    public WeightedRoundRobin(){

        super.algorithm = Algorithm.WEIGHTED_ROUND_ROBIN;
    }

    @Override
    public void balance() {

        System.out.println("Apply Weighted Round Robin");
    }
}
