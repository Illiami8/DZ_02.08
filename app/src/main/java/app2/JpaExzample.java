package app2;

import app.controler.helper.EntityManagerHelper;
import com.Cherepovski.Car;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class JpaExzample {

    public static void main(String[] args) {
        EntityManager em = EntityManagerHelper.getInstance().getEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
 //вставка новых обьектов
       // Car car = new Car();
       // car.setModel("BMW");
       // car.setReleaseDate(new Date(2015,07,12)); //-уже устарело(
       // car.setReleaseDate(new Date(LocalDate.of(2015, 7, 12).toEpochDay()));
       // em.persist(car);

//*Чтение из базы данных
       // Car car= em.find(Car.class,1L);
      //  System.out.println(car);
//*Обновляем значение даты
       // car.setReleaseDate(Date.from(LocalDate.of(2022,1,12).atStartOfDay(ZoneId.systemDefault()).toInstant()));
       // Car updateCar = em.merge(car);
      //  System.out.println(car);

//
Car opel = Car.builder()
       .model("Opel Astra")
       .releaseDate(Date.from(LocalDate.of(2022,1,12).atStartOfDay(ZoneId.systemDefault()).toInstant()))
       .build();
em.persist(opel);
// Чтение Рено
        TypedQuery<Car> queryOpel = em.createQuery("select car from Car car where car.model='Opel Astra'", Car.class);
        Car opelAstra = queryOpel.getSingleResult();
        System.out.println(opelAstra);
        // Удаление заранее прочитанного Рено
        em.remove(opelAstra);
        //   Administrator administrator = em.find(Administrator.class,2L);
        // System.out.println("!!!"+ administrator);

        //Students students = em.find(Students.class,2L);
        //    System.out.println("!!!"+ students);

        tx.commit();
        em.close();
        //sessionFactory.close();

    }
}


