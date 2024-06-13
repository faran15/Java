import java.util.TreeSet;

class ExamRoom {
    private int n;
    private TreeSet<Integer> seats;

    public ExamRoom(int n) {
        this.n = n;
        this.seats = new TreeSet<>();
    }

    public int seat() {
        int studentSeat = 0;
        if (seats.size() > 0) {
            int maxDist = seats.first();
            Integer prev = null;
            for (Integer seat : seats) {
                if (prev != null) {
                    int dist = (seat - prev) / 2;
                    if (dist > maxDist) {
                        maxDist = dist;
                        studentSeat = prev + dist;
                    }
                }
                prev = seat;
            }
            if (n - 1 - seats.last() > maxDist) {
                studentSeat = n - 1;
            }
        }
        seats.add(studentSeat);
        return studentSeat;
    }

    public void leave(int p) {
        seats.remove(p);
    }

    public static void main(String[] args) {
        ExamRoom examRoom = new ExamRoom(10);
        System.out.println(examRoom.seat());
        System.out.println(examRoom.seat());
        System.out.println(examRoom.seat()); 
        System.out.println(examRoom.seat());
        examRoom.leave(4);
        System.out.println(examRoom.seat());
    }
}
