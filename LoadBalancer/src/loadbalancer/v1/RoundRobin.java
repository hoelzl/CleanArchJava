package loadbalancer.v1;

public class RoundRobin extends LoadBalancer {

    public RoundRobin(){

        super.algorithm = Algorithm.ROUND_RBON;
    }

    @Override
    public void balance() {

        System.out.println("Apply Round Robin");
    }
}
