package tn.esprit.walidkhrouf.Repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.*;
import tn.esprit.walidkhrouf.Entities.*;

public interface ISubscriptionRepository  extends CrudRepository<Subscription,Integer> {
    List<Subscription> findByTypeSub(TypeSubscription typeSub);
    @Query("select sub from Subscription sub order by sub.startDate asc ")
    List<Subscription> getByStartDate();
}
