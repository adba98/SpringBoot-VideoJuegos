package com.sp0.videogames.services;

import com.sp0.videogames.domain.Distributor;
import com.sp0.videogames.domain.VideoGames;
import com.sp0.videogames.repository.DistributorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistributorService {

    private final DistributorRepository distributorRepository;

    public DistributorService(DistributorRepository distributorRepository) {
        this.distributorRepository = distributorRepository;
    }

    public List<Distributor> findAll() {
        return distributorRepository.findAllByOrderByName();
    }

}
