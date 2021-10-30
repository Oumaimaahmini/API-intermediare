package repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import model.Intermediaire;


@Repository
public interface IntermediaireRepository  extends CrudRepository<Intermediaire, Long>{

}


