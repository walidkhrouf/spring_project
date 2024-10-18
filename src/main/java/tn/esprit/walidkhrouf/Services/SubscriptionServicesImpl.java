package tn.esprit.walidkhrouf.Services;


import tn.esprit.walidkhrouf.Entities.Subscription;
import tn.esprit.walidkhrouf.Repositories.ISubscriptionRepository;

public class SubscriptionServicesImpl {

    private ISubscriptionRepository subscriptionRepository;

    public Subscription addSubscription(Subscription subscription)
    {
        return subscriptionRepository.save(subscription);
    }

}
