package com.wecp.progressive.controller;

import com.wecp.progressive.entity.Team;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeamController {
    @GetMapping("/team")
    public ResponseEntity<List<Team>> getAllTeams() {
        return ResponseEntity.ok(null);
    }
    @GetMapping("/team/{teamID}")
    public ResponseEntity<Team> getTeamById(@PathVariable int teamID) {
        return null;
    }
    @PostMapping("/team")
    public ResponseEntity<Integer> addTeam(@RequestBody Team team) {
        return null;
    }
    @PutMapping("/team/{teamID}")
    public ResponseEntity<Void> updateTeam(@PathVariable int teamID,@RequestBody Team team) {
        return null;
    }
    @DeleteMapping("/team/{teamID}")
    public ResponseEntity<Void> deleteTeam(@PathVariable int teamID) {
        return null;
    }
    @GetMapping("/team/fromArrayList")
    public ResponseEntity<List<Team>> getAllTeamsFromArrayList() {
        return null;
    }
   @PostMapping("/team/toArrayList")
    public ResponseEntity<Integer> addTeamToArrayList(@RequestBody Team team) {
        return null;
    }
    @GetMapping("/teamId/fromArrayList/sorted")
    public ResponseEntity<List<Team>> getAllTeamsSortedByNameFromArrayList() {
        return null;
    }
}