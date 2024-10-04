package 다운캐스팅;

public class Animal {
    public void move(){
        System.out.println("동물이 움직입니다.");
    }
}

class Human extends Animal{ // 일반 상속
    @Override
    public void move(){
        System.out.println("사람이 두 발로 걷습니다.");
    }
    public void readBook(){ // Animal 변수로 Human 참조 시 안보임
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal{
    @Override
    public void move(){
        System.out.println("호랑이가 네 발로 뜁니다.");
    }
    public void hunting(){
        System.out.println("호랑이가 사냥을 합니다.");
    }
}

class Eagle extends Animal{
    @Override
    public void move(){
        System.out.println("독수리가 하늘을 납니다.");
    }
    public void flying(){
        System.out.println("독수리가 날개를 쭉 펴고 하늘을 납니다.");
    }
}

