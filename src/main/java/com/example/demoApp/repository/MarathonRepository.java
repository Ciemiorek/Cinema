package com.example.demoApp.repository;

import com.example.demoApp.domain.Marathon;
import org.springframework.data.repository.CrudRepository;

public interface MarathonRepository extends CrudRepository<Marathon,Long> {
}
