package tn.esprit.walidkhrouf.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.walidkhrouf.Entities.Skier;
import tn.esprit.walidkhrouf.Entities.Subscription;

import tn.esprit.walidkhrouf.Services.SubscriptionServicesImpl;

@RequiredArgsConstructor
@RestController
@RequestMapping("subscription")
public class SubscriptionRestController {

    private final SubscriptionServicesImpl subscriptionServices;
    @PostMapping("/add")
    public Subscription saveSubscription(@RequestBody Subscription subscription)
    {
        return subscriptionServices.addSubscription(subscription);

    }
    @GetMapping("/get/{numSub}")
    public Subscription getSubscription (@PathVariable int numSub)
    {
        return subscriptionServices.retriveSubscription(numSub);
    }

    @PutMapping("/update/{numSub}")
    public Subscription updateSub(@RequestBody Subscription subscription)
    {
        return subscriptionServices.updateSubscription(subscription);

    }
    @DeleteMapping("/delete/{numSub}")
    public void deleteSub(@PathVariable int numSub) {
        subscriptionServices.removeSubscription(numSub);
    }


}