package tn.iit.microservice01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.iit.microservice01.entity.MatchResult;
import tn.iit.microservice01.service.MatchResutService;

import java.util.List;

@RestController
@RequestMapping("api/matchResult")
public class MatchResultController {

    @Autowired
    MatchResutService matchResultService;

    @GetMapping("")
    List<MatchResult> getAll() {
        return  matchResultService.getAll();
    }

    @GetMapping("byMatch/{id}")
    MatchResult getbyMatch(@PathVariable Long id) {
        return  matchResultService.getByMatch(id);
    }
    @PostMapping("save")
    MatchResult saveMatchResult(@RequestBody MatchResult matchResult){
        return  matchResultService.save(matchResult);
    }

    @PutMapping("update/{id}")
    MatchResult updateMatchResult(@PathVariable Long id, @RequestBody  MatchResult matchResult){
        return  matchResultService.Update(id, matchResult);
    }

    @DeleteMapping("delete/{id}")
    boolean deleteMatchResult(@PathVariable Long id){
        return  matchResultService.delete(id);
    }
}
