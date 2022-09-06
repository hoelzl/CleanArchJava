package loadbalancer.v1;

public abstract class LoadBalancer {

    Algorithm algorithm;

    public abstract void balance();
}
