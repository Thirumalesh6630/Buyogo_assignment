package com.traini8.registry.service;

import com.traini8.registry.model.TrainingCenter;
import com.traini8.registry.repository.TrainingCenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TrainingCenterService {

    @Autowired
    private TrainingCenterRepository trainingCenterRepository;

    public TrainingCenter saveTrainingCenter(TrainingCenter trainingCenter) {
        return trainingCenterRepository.save(trainingCenter);
    }

    public List<TrainingCenter> getAllTrainingCenters() {
        return trainingCenterRepository.findAll();
    }
}