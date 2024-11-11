package tn.esprit.walidkhrouf.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.walidkhrouf.Entities.Piste;

import tn.esprit.walidkhrouf.Entities.Skier;
import tn.esprit.walidkhrouf.Services.PisteServicesImpl;


@RequiredArgsConstructor
@RestController
@RequestMapping("piste")
public class PisteRestController {

    private final PisteServicesImpl pisteServices;
    @PostMapping("/add")
    public Piste savePiste(@RequestBody Piste piste)
    {
        return pisteServices.addPiste(piste);

    }
    @GetMapping("/get/{numPiste}")
    public Piste getPiste (@PathVariable int numPiste)
    {
        return pisteServices.retrivePiste(numPiste);
    }

    @PutMapping("/update/{numPiste}")
    public Piste updatePiste(@RequestBody Piste piste)
    {
        return pisteServices.updatePiste(piste);

    }
    @DeleteMapping("/delete/{numPiste}")
    public void deletePiste(@PathVariable int numPiste) {
        pisteServices.removePiste(numPiste);
    }
}
