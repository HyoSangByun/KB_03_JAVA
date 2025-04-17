package ch07.sec12;

public class AnimalExample {

    public static void main(String[] args) {

        Animal[] animals = new Animal[3];

        animals[0] = new Animal();
        animals[1] = new Dog();
        animals[2] = new Cat();

        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                ((Dog) animal).sound();
            } else if (animal instanceof Cat) {
                ((Cat) animal).sound();
            } else {
                animal.sound();
            }
        }

        System.out.println("\n== 동적 바인딩 사용 ==");
        for (Animal animal : animals) {
            animal.sound(); //동적 바인딩
            // animal은 부모 타입 참조 변수
            // -> 1번, 2번 인덱스가 참조하는 객체는 자식(Dog, Cat)
            // -> 실행 중 sound() 메서드가 실제 참조하는 객체인 Dog, Cat의
            // 오버라이딩된 sound() 메서드와 연결되어 호출된다!
        }
    }
}
