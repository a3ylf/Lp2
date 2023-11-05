import java.io.DataInputStream;
import java.io.DataOutputStream;

public class multiplayerRoom {


    private int playermax;
    private String difficulty;

    private DataInputStream[] ins;
    private DataOutputStream[] outs;
    int players;
    int roomindex;
    public multiplayerRoom(int playermax, String difficulty){
        this.playermax = playermax;this.difficulty = difficulty;
        ins = new DataInputStream[playermax];
        outs = new DataOutputStream[playermax];
        players = 0;
    }
    public void setRoomindex(int index){
        roomindex = index;
    }
    public int getRoomindex(){
        return roomindex;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public int getPlayermax() {
        return playermax;
    }

    public DataInputStream[] getIns() {
        return ins;
    }

    public void setDatastream(DataInputStream in,DataOutputStream out) {
        this.ins[players] = in;
        this.outs[players] = out;
        players++;
    }

    public DataOutputStream[] getOuts() {
        return outs;
    }

    public int getplayers(){
        return players;
    }
}
