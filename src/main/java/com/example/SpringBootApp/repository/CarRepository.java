package com.example.SpringBootApp.repository;

import com.example.SpringBootApp.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

//asociados a entidades debe haber REPOSITORIOS:

/**
 * @Repository: el repository la capa de persistencia que tiene acceso a los datos y que puede manipularlos.
 *
 * Como un repositorio suna interface y , no puede tener codigo
 */
@Repository
public interface CarRepository extends JpaRepository<Car, Long>{ //repositorio asociado a Car

    //METODOS que se crean en repositorio PARA REALIZAR BUSQUEDASen la base de datos Car...
    List<Car> findByDoors(Integer doors);

    List<Car> findByManufacturerAndModel(String manufacturer, String model);

    List<Car> findByDoorsGreaterThanEqual(Integer doors);

    List<Car> findByModelContaining(String model);

    List<Car> findByYearIn(List<Integer> years);//encontar Car de un año specifico
    //encontar Car entre un año x hasta un año y
    List<Car> findByYearBetween(Integer startYear, Integer endYear);

    //deme los Car de x fecha a y echa
    List<Car> findByReleaseDateBetween(LocalDate startDate, LocalDate endDate);

    //deme los Car disponibles
    List<Car> findByAvailableTrue();

    Long deleteAllByAvailableFalse();
}
