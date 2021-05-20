package com.futebol.futeboldata.Times;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "times")
public class TimeController {
    
    private final TimeService timeService;

    @Autowired
    public TimeController(TimeService timeService) {
        this.timeService = timeService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Time>> getAllTimes() {
        List<Time> timeList = timeService.findAllTimes();
        return new ResponseEntity<>(timeList, HttpStatus.OK);
    }

    @GetMapping("/all/{league}")
    public ResponseEntity<List<Time>> getTimeByLeague(@PathVariable("league") String league) {
        List<Time> timeListLeague = timeService.findTimeByLeague(league);
        return new ResponseEntity<>(timeListLeague, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Time> addNewTime(@RequestBody Time time) {
        Time newTime = timeService.addTime(time);
        return new ResponseEntity<>(newTime, HttpStatus.CREATED);
    }
    
    @PutMapping("/update")
    public ResponseEntity<Time> updateTime(@RequestBody Time time) {
        Time updateTime = timeService.updateTime(time);
        return new ResponseEntity<>(updateTime, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteTime(@PathVariable("id") Long id) {
        timeService.deleteTime(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
}
