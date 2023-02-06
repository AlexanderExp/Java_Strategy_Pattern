package org.example;

    //Класс Context хранит ссылку на объект IMovable
    // и связан с интерфейсом IMovable отношением агрегации.
public class Player {
    protected int level;
    protected String name;
    public IMovable Movable;
    public Player (int weight, String name, IMovable move) {
        Movable = move;
        this.name = name;
        this.level = weight;
    }
    public void Move(){
        Movable.Move();
    }

}
    // Интерфейс IMovable, который определяет метод Move().
    // Это общий интерфейс для всех реализующих его алгоритмов.
    // Вместо интерфейса здесь также можно было бы использовать абстрактный класс.
interface IMovable{
    void Move();
}
    // Классы RunningMove, WalkingMove, TeleportationMove, UndergroundMove,
    // которые реализуют интерфейс IMovable, предоставляя свою версию метода Move().
    // Подобных классов-реализаций может быть множество.
class RunningMove implements IMovable {
    public void Move() {
        System.out.println("Running");
    }
}
class WalkingMove implements IMovable {
    public void Move() {
        System.out.println("Walking");
    }
}
class TeleportationMove implements IMovable {
    public void Move() {
        System.out.println("Teleporting");
    }
}
class UndergroundMove implements IMovable {
    public void Move() {
        System.out.println("Moving under the ground");
    }
}