package tn.esprit.walidkhrouf.Services;


import tn.esprit.walidkhrouf.Entities.Subscription;

import java.util.List;

public interface ISubscriptionServices {

    Subscription addSubscription(Subscription subscription);
    Subscription updateSubscription(Subscription subscription);
    Subscription retriveSubscription(int numSub);
    List<Subscription> retriveAll();
    void removeSubscription(int numSub);


}
