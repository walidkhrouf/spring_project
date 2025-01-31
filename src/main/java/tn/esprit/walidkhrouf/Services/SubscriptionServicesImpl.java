package tn.esprit.walidkhrouf.Services;


import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import tn.esprit.walidkhrouf.Entities.*;
import tn.esprit.walidkhrouf.Repositories.ISubscriptionRepository;

import java.util.*;
import java.util.stream.Collectors;
@AllArgsConstructor
@Slf4j
@ToString
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
    //cron= second minute heure jourDuMois mois jourDeLaSemaine
    @Scheduled(cron = "*/60 * * * * *")
    public void getByStartDate() {
        for (Subscription subscription :subscriptionRepository.getByStartDate()) {
            log.info(subscription.toString());
        }
    }
}
