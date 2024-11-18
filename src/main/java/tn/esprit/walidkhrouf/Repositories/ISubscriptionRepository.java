package tn.esprit.walidkhrouf.Repositories;

import org.springframework.data.repository.CrudRepository;
import java.util.*;
import tn.esprit.walidkhrouf.Entities.*;

public interface ISubscriptionRepository  extends CrudRepository<Subscription,Integer> {
    List<Subscription> findByTypeSub(TypeSubscription typeSub);
}
