package com.company;

import java.util.List;
import java.util.Scanner;

public class MatchList {
    public void isCouple(int numberOfTeams, List<String> teams){
        if(numberOfTeams % 2 != 0){
            teams.add("Bay");
            numberOfTeams++;
        }
    }

    public void teamList(int numberOfTeams, List<String> teams){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<numberOfTeams;i++){
            System.out.println("Enter team name: ");
            String team = sc.next();
            teams.add(team);
        }
    }


}
