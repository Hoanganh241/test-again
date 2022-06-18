package com.example.testagain.service;

import com.example.testagain.entity.Road;
import com.example.testagain.repository.RoadRepository;
import org.h2.mvstore.Page;
import org.springframework.stereotype.Service;
@Service
public class CommonService
{
    final RoadRepository roadRepository;
    public RoadService(RoadRepository roadRepository) {
        this.roadRepository = roadRepository;
    }

    public Page<Road> finadAll(int page, int limit)
}
