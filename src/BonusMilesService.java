public class BonusMilesService {
    public int calculate (int ticketPrice) {
        int milesBonus = 20;
        int miles = ticketPrice / milesBonus;
        return miles;
    }
}
