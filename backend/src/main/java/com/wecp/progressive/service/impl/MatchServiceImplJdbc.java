package com.wecp.progressive.service.impl;

import java.util.List;

import com.wecp.progressive.entity.Match;
import com.wecp.progressive.service.MatchService;

public class MatchServiceImplJdbc implements MatchService {

    @Override
    public List<Match> getAllMatches() {
       return List.of();
    }

    @Override
    public Match getMatchById(int matchId) {
       return null;
    }

    @Override
    public Integer addMatch(Match match) {
     return null;
    }

    @Override
    public void updateMatch(Match match) {
    }

    @Override
    public void deleteMatch(int matchId) {
    }

}