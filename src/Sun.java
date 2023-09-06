public class Sun {
    private static Sun instance;

    private Sun() {
        System.out.println("Создан объект класса Солнце");
    }

    public static Sun getInstance() {
        if (instance == null) {
            instance = new Sun();
        }
        return instance;
    }

    public void sunrise() {
        System.out.println("Солнце взошло");
    }

    public void sunset() {
        System.out.println("Солнце зашло");
    }
}
