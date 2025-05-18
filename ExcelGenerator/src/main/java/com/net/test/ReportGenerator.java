package com.net.test;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportGenerator extends JpaRepository<MovieInfo, Integer>{

}
