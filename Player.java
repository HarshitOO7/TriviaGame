
public class Player {
    private int playerId;
    private int points=0;

    public Player(int playerId) {
        this.playerId = playerId;
    }
    
    /** 
     * @return playerId - id of the player
     */
    public int getPlayerId() {
        return playerId;
    }

    
    /** 
     * @param playerId
     */
    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    
    /** 
     * @return points - total points of the player
     */
    public int getPoints() {
        return points;
    }

    
    /** 
     * @param points
     */
    public void setPoints(int points) {
        this.points = points;
    }
    //increase points by 1
    public void incPoints(){
        points++;
    }
    
}
