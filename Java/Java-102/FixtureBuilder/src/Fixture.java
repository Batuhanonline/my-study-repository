import java.util.*;

public class Fixture implements IFixture{
    List<String> teams = new ArrayList();
    List<String> fixtureTeams = new ArrayList();
    Scanner scanner = new Scanner(System.in);

    int index = 0;

    public Fixture() {
        reqTeams();
    }

    @Override
    public void reqTeams() {
        boolean isReq = true;
        System.out.println("Fikstür uygulamamıza hoşgeldiniz.");

        while (isReq) {
            System.out.print("Bir takım ismi giriniz: ");
            try {
                String inputTeam = scanner.nextLine();
                if (inputTeam.equals("C")){
                    isReq = false;
                } else {
                    teams.add(inputTeam);
                }
            } catch (Exception e) {
                System.out.println("Lütfen geçerli bir değer giriniz!!!");
                System.out.println(e.toString());
            }
            System.out.println("Takım girmeyi bitirmek için --> C");
        }

        //Eğer tek sayıda bir takım listesi girilirse, çift sayıya tamamlamak için "Bay" adında bir takım daha eklenmelidir.
        //Bay ile karşılaşan takımlar o hafta maç yapmayacağı anlamına gelmektedir.

        if (!(teams.size() % 2 == 0)) {
            teams.add("Bay");
        }
    }

    @Override
    public void run() {
        Random random = new Random();

        int round = (teams.size() - 1) * 2;
        int match = teams.size() / 2;
        int counter;

        ArrayList<Integer> roundMatch = new ArrayList<>();

        for (int i = 1; i <= round; i++) {
            System.out.println("Round " + i);
            roundMatch.clear();
            counter = 0;

            while (counter < match) {
                int team1 = random.nextInt(teams.size());
                int team2 = random.nextInt(teams.size());
                String vs = teams.get(team1) + " vs " + teams.get(team2);
                if ((team1 != team2) && !(fixtureTeams.contains(vs)) && !(roundMatch.contains(team1)) && !(roundMatch.contains(team2))) {
                    roundMatch.add(team1);
                    roundMatch.add(team2);
                    fixtureTeams.add(vs);

                    System.out.println(vs);
                    counter++;
                }
            }
        }

        /*try {
            while (fixtureTeams.size() < ((teams.size() - 1) * 2) * (teams.size() / 2)) {
                int team1 = random.nextInt(teams.size());
                int team2 = random.nextInt(teams.size());
                String vs = teams.get(team1) + " vs " + teams.get(team2);
                System.out.println(vs);
                if ((team1 != team2) && !teams.contains(vs)) {
                    System.out.println(vs + " eklendi.");
                    fixtureTeams.add(vs);
                }
            }
        } catch (Exception e) {
            System.out.println("Fikstür oluşturma hatası");
        }


        try {
            for (int i = 1; i <= (teams.size() - 1) * 2; i++) {
                System.out.println("Round " + i);
                for (int j = 0; j < teams.size() / 2; j++) {
                    System.out.println(fixtureTeams.get(index));
                    this.index++;
                }
            }
        } catch (Exception e) {
            System.out.println("Fikstür yazdırma hatası.");
        }*/




    }
}
