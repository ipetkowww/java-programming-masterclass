package abstract_classes_interface.interface_challenge;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Saveable player = new Player("Ivan", 100, 100);
        System.out.println(player);
        List<String> write = player.write();
    }

}
