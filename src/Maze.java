import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Maze {
    List<Room> roomList = new ArrayList<>();
    public List<Room> getRoomList() {
        return roomList;
    }
    public List<Room> createMaze() {
        int roomNumber = new Random().nextInt(4,10);
        Side sideN = null;
        Side sideE = null;
        Side sideW = null;
        Side sideS = null;

        for (int i = 0; i < roomNumber; i++) {
            for (int j = 0; j < 1; j++) {
                sideN = new Side();
                sideE = new Side();
                sideW = new Side();
                sideS = new Side();
                int random = new Random().nextInt(1,20);
                if (random <=5){
                    sideN.setSideType("Door");
                    sideE.setSideType("Wall");
                    sideW.setSideType("Wall");
                    sideS.setSideType("Wall");
                } else if (random <=10) {
                    sideE.setSideType("Door");
                    sideN.setSideType("Wall");
                    sideW.setSideType("Wall");
                    sideS.setSideType("Wall");
                } else if (random <=15) {
                    sideW.setSideType("Door");
                    sideN.setSideType("Wall");
                    sideE.setSideType("Wall");
                    sideS.setSideType("Wall");
                } else if (random <=20) {
                    sideS.setSideType("Door");
                    sideN.setSideType("Wall");
                    sideW.setSideType("Wall");
                    sideE.setSideType("Wall");
                }
            }
            Room room = new Room(sideN,sideE,sideW,sideS);
            roomList.add(room);
        }
        return roomList;
    }

    @Override
    public String toString() {
        return "Maze{" +
                "roomList=" + roomList +
                '}';
    }
}
