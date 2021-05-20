package com.futebol.futeboldata.Times;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

@Service
public class TimeService {
    
    private final TimeRepository timeRepository;

    public TimeService(TimeRepository timeRepository) {
        this.timeRepository = timeRepository;
    }

    public List<Time> findAllTimes() {
        return timeRepository.findAll();
    }

    public Time addTime(Time time) {
        time.setId(Double.valueOf(Math.random()).longValue());
        return timeRepository.save(time);
    }

    public Time updateTime(Time time) {
        return timeRepository.save(time);
    }

    @Transactional
    public void deleteTime(Long id) {
        timeRepository.deleteTimeById(id);
    }
    
    public List<Time> findTimeByLeague(String league) {
        return timeRepository.findTimeByLeague(league);
            
    }
    

}
