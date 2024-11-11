package tn.esprit.walidkhrouf.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.walidkhrouf.Entities.Subscription;
import tn.esprit.walidkhrouf.Repositories.ISubscriptionRepository;

import java.util.List;

@Service
public class SubscriptionServicesImpl {
    @Autowired
    private ISubscriptionRepository subscriptionRepository;

    public Subscription addSubscription(Subscription subscription)
    {
        return subscriptionRepository.save(subscription);
    }


    public Subscription updateSubscription(Subscription subscription)
    {
        return subscriptionRepository.save(subscription);
    }

    public Subscription retriveSubscription(int numSub)
    {
        return subscriptionRepository.findById(numSub).orElse(null);
    }

    public List<Subscription> retriveAll() {
        return (List<Subscription>)subscriptionRepository.findAll();
    }

    public void removeSubscription(int numSub) {
        subscriptionRepository.deleteById(numSub);
    }

}
