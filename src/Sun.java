public class Sun {
    private static Sun instance;

    private Sun() {
        System.out.println("������ ������ ������ ������");
    }

    public static Sun getInstance() {
        if (instance == null) {
            instance = new Sun();
        }
        return instance;
    }

    public void sunrise() {
        System.out.println("������ ������");
    }

    public void sunset() {
        System.out.println("������ �����");
    }
}
