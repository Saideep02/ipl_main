package com.wecp.progressive.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List; 

import com.wecp.progressive.entity.Cricketer;
import com.wecp.progressive.entity.Team;
import com.wecp.progressive.service.CricketerService;
import com.wecp.progressive.service.TeamService;

public class TeamServiceImplArraylist implements TeamService {
private List<Team> teamList;


    public TeamServiceImplArraylist() {
     this.teamList = new ArrayList<Team>();
    }


    @Override
    public List<Team> getAllTeams() {
   return teamList;
    }


    @Override
    public int addTeam(Team team) {
    teamList.add(team);
    return teamList.size();
    }


    @Override
    public List<Team> getAllTeamsSortedByName() {
    Collections.sort(teamList) ;
    return teamList;
    }


}