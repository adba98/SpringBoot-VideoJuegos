package com.sp0.videogames.repository;

import com.sp0.videogames.domain.Distributor;
import com.sp0.videogames.domain.VideoGames;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DistributorRepository extends JpaRepository<Distributor, Integer> {

    List<Distributor> findAllByOrderByName();

}
