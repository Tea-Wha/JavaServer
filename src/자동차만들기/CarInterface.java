package 자동차만들기;

public interface CarInterface {
    void name (String name);
    void option (boolean isON);
    void distance (int dis);
    void passenger (int pas);
    void price ();
    void fuelNumber ();
    void time (int weather);
    void calc ();
    int FUEL = 2000;

    class SportsCar implements CarInterface{
        double speed = 250; int fe = 8; int amount = 30; int seat = 2;
        int distance; int passenger; int trial; int totalDistance;
        double totalTime; int totalHour; double totalMinute; int fuelNumber;
        int fuelLiter; int wt; int totalPrice; String name = "Ferrari";
        @Override
        public void name(String name) {this.name = name;}
        @Override
        public void option(boolean isON) {
            if (isON) this.speed = 250*1.2;
            else this.speed = speed;
        }
        @Override
        public void distance(int dis) {
            this.distance = dis;
            totalDistance = distance * trial;
        }
        @Override
        public void passenger(int pas) {
            this.passenger = pas;
            if (passenger % seat == 0) trial = passenger / seat;
            else if (passenger % seat != 0) trial = (passenger / seat)+1;
        }
        @Override
        public void price() {
            if (totalDistance%fe == 0) fuelLiter = totalDistance/fe;
            else if (totalDistance%fe != 0) fuelLiter = (totalDistance/fe)+1;
            totalPrice = fuelLiter * FUEL;
        }
        @Override
        public void fuelNumber() {
            int x = fe * amount;
            if (totalDistance%x == 0) fuelNumber = totalDistance/x;
            else if (totalDistance%x != 0) fuelNumber = (totalDistance/x)+1;
        }
        @Override
        public void time(int weather) {
            this.wt = weather;
            totalTime = totalDistance / speed;
            if (wt == 1){
            totalHour = (int) totalTime;
            totalMinute = (Math.round((totalTime-(int)totalTime)*60));
            }
            else if (wt == 2){
            totalTime *= 1.2;
            totalHour = (int) totalTime;
            totalMinute = (Math.round((totalTime-(int)totalTime)*60));
            }
            else if (wt == 3){
            totalTime *= 1.4;
            totalHour = (int) totalTime;
            totalMinute = (Math.round((totalTime-(int)totalTime)*60));
            }
        }
        @Override
        public void calc() {
            String formmattedNumber = String.format("%,d", totalPrice);
            System.out.println("====="+name+"=====");
            System.out.println("총 비용 : "+formmattedNumber+"원");
            System.out.println("총 주유 횟수 : "+fuelNumber+"회");
            System.out.println("총 이동 시간 : "+totalHour+"시간 "+(int)totalMinute+"분");
        }
    }
    class Sedan implements CarInterface{
        int speed = 200; int fe = 12; int amount = 45; int seat = 4;
        int distance; int passenger; int trial; int totalDistance;
        double totalTime; int totalHour; double totalMinute; int fuelNumber;
        int fuelLiter; int wt; int totalPrice; String name = "GV80";
        @Override
        public void name(String name) {this.name = name;}
        @Override
        public void option(boolean isON) {
            if (isON) this.seat = 5;
            else this.seat = seat;
        }
        @Override
        public void distance(int dis) {
            this.distance = dis;
            totalDistance = distance * trial;
        }
        @Override
        public void passenger(int pas) {
            this.passenger = pas;
            if (passenger % seat == 0) trial = passenger / seat;
            else if (passenger % seat != 0) trial = (passenger / seat)+1;
        }
        @Override
        public void price() {
            if (totalDistance%fe == 0) fuelLiter = totalDistance/fe;
            else if (totalDistance%fe != 0) fuelLiter = (totalDistance/fe)+1;
            totalPrice = fuelLiter * FUEL;
        }
        @Override
        public void fuelNumber() {
            int x = fe * amount;
            if (totalDistance%x == 0) fuelNumber = totalDistance/x;
            else if (totalDistance%x != 0) fuelNumber = (totalDistance/x)+1;
        }
        @Override
        public void time(int weather) {
            this.wt = weather;
            totalTime = totalDistance / speed;
            if (wt == 1){
                totalHour = (int) totalTime;
                totalMinute = (Math.round((totalTime-(int)totalTime)*60));
            }
            else if (wt == 2){
                totalTime *= 1.2;
                totalHour = (int) totalTime;
                totalMinute = (Math.round((totalTime-(int)totalTime)*60));
            }
            else if (wt == 3){
                totalTime *= 1.4;
                totalHour = (int) totalTime;
                totalMinute = (Math.round((totalTime-(int)totalTime)*60));
            }
        }
        @Override
        public void calc() {
            String formmattedNumber = String.format("%,d", totalPrice);
            System.out.println("====="+name+"=====");
            System.out.println("총 비용 : "+formmattedNumber+"원");
            System.out.println("총 주유 횟수 : "+fuelNumber+"회");
            System.out.println("총 이동 시간 : "+totalHour+"시간 "+(int)totalMinute+"분");
        }
    }
    class Bus implements CarInterface{
        int speed = 150; int fe = 5; int amount = 100; int seat = 20;
        int distance; int passenger; int trial; int totalDistance;
        double totalTime; int totalHour; double totalMinute; int fuelNumber;
        int fuelLiter; int wt; int totalPrice; String name = "관광버스";
        @Override
        public void name(String name) {this.name = name;}
        @Override
        public void option(boolean isON) {
        if (isON) this.amount = 130;
        else this.amount = amount;
        }
        @Override
        public void distance(int dis) {
            this.distance = dis;
            totalDistance = distance * trial;
        }
        @Override
        public void passenger(int pas) {
            this.passenger = pas;
            if (passenger % seat == 0) trial = passenger / seat;
            else if (passenger % seat != 0) trial = (passenger / seat)+1;
        }
        @Override
        public void price() {
            if (totalDistance%fe == 0) fuelLiter = totalDistance/fe;
            else if (totalDistance%fe != 0) fuelLiter = (totalDistance/fe)+1;
            totalPrice = fuelLiter * FUEL;
        }
        @Override
        public void fuelNumber() {
            int x = fe * amount;
            if (totalDistance%x == 0) fuelNumber = totalDistance/x;
            else if (totalDistance%x != 0) fuelNumber = (totalDistance/x)+1;
        }
        @Override
        public void time(int weather) {
            this.wt = weather;
            totalTime = totalDistance / speed;
            if (wt == 1){
                totalHour = (int) totalTime;
                totalMinute = (Math.round((totalTime-(int)totalTime)*60));
            }
            else if (wt == 2){
                totalTime *= 1.2;
                totalHour = (int) totalTime;
                totalMinute = (Math.round((totalTime-(int)totalTime)*60));
            }
            else if (wt == 3){
                totalTime *= 1.4;
                totalHour = (int) totalTime;
                totalMinute = (Math.round((totalTime-(int)totalTime)*60));
            }
        }
        @Override
        public void calc() {
            String formmattedNumber = String.format("%,d", totalPrice);
            System.out.println("====="+name+"=====");
            System.out.println("총 비용 : "+formmattedNumber+"원");
            System.out.println("총 주유 횟수 : "+fuelNumber+"회");
            System.out.println("총 이동 시간 : "+totalHour+"시간 "+(int)totalMinute+"분");
        }
    }
}
