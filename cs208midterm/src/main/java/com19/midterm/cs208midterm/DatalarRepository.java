package com19.midterm.cs208midterm;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface DatalarRepository extends CrudRepository<Datalar, Integer> {

}

