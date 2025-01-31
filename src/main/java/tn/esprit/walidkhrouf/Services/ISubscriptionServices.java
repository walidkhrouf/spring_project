package tn.esprit.walidkhrouf.Services;


import tn.esprit.walidkhrouf.Entities.*;

import java.util.*;

public interface ISubscriptionServices {

    Subscription addSubscription(Subscription subscription);
    Subscription updateSubscription(Subscription subscription);
    Subscription retriveSubscription(int numSub);
    List<Subscription> retriveAll();
    void removeSubscription(int numSub);
    Set<Subscription> getSubscriptionByType(TypeSubscription type);
    void getByStartDate();

}
