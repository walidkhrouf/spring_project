package tn.esprit.walidkhrouf.Repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.walidkhrouf.Entities.Subscription;

public interface ISubscriptionRepository  extends CrudRepository<Subscription,Integer> {
}
