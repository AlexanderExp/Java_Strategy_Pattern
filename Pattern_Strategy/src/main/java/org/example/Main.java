package org.example;

    // Существуют различные игроки, которые могут перемещаться различными способами:
    // бег, ходьба, телепортация, перемещение под землей.
    // В целом игроки похожи и отличаются только прокачкой и доступными спосбами перемещения.
    // Игроки могут прокачиваться и открывать новые виды перемещения

public class Main {
    public static void main(String[] args) {
        Player player = new Player(70, "Player1", new RunningMove());
        player.Move();
        player.Movable = new TeleportationMove();
        player.Move();
        player.Movable = new UndergroundMove();
        player.Move();
        player.Movable = new WalkingMove();
        player.Move();
    }
}