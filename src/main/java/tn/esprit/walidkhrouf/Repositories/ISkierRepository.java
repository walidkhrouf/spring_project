package tn.esprit.walidkhrouf.Repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import tn.esprit.walidkhrouf.Entities.*;
import java.util.List;
import java.time.LocalDate;



public interface ISkierRepository  extends CrudRepository<Skier,Long> {
    Skier findByName(String name);
    Skier findByLastname(String lastname);
    Skier findByNameAndLastname(String name, String lastname);
    List<Skier> findByBirthDate(LocalDate birthDate);
    List<Skier> findBySubscription_TypeSub(TypeSubscription typeSubscription);
   @Query("select s from Skier s where s.subscription.typeSub=:typeSub")
   List<Skier> getSkiersByTypeSubscription(@Param("typeSub") TypeSubscription typeSubscription);
  @Query("select s from Skier s join s.registrations regs where regs.course.typeCourse=:typeC")
   List<Skier> getSkiersByTypeCourse(@Param("typeC") TypeCourse typeCourse);
}
