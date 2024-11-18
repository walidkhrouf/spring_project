package tn.esprit.walidkhrouf.Services;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.walidkhrouf.Entities.*;
import tn.esprit.walidkhrouf.Repositories.ISubscriptionRepository;

import java.util.*;
import java.util.stream.Collectors;
@AllArgsConstructor
@Service
public class SubscriptionServicesImpl {

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


    public Set<Subscription> getSubscriptionByType(TypeSubscription type) {
        return subscriptionRepository.findByTypeSub(type).stream()
                .sorted((s1, s2) -> s1.getStartDate().compareTo(s2.getStartDate()))
                .collect(Collectors.toSet());
    }

}
