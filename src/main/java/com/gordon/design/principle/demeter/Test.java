package com.gordon.design.principle.demeter;

/**
 * Created by gordon
 */
public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);

    }
}
