package A03Encapsuulation.E04FirstAndReserveTeam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        Team team = new Team("Black Eagles");

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split(" ");
            Person p = (new Person(input[0], input[1], Integer.parseInt(input[2]), Double.parseDouble(input[3])));

            team.addPlayer(p);
        }

        System.out.println(team.getFirstTeam().size());
        System.out.println(team.getReserveTeam().size());
    }
}
