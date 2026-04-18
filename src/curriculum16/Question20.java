package curriculum16;

interface IFVendingMachineFinal {
    void showStock();
    void refillStock(int amount);
    void buy();
}

class VendingMachineFinal {
    private String name;
    private int stock;
    private int price;

    public VendingMachineFinal() {}

    public VendingMachineFinal(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public int getStock() { return this.stock; }
    public void setStock(int stock) { this.stock = stock; }

    public void showStock() {
        System.out.println("在庫" + stock + "個");
    }
}

class DrinkVendingMachineFinal extends VendingMachineFinal implements IFVendingMachineFinal {
    private String drinkType;
    public DrinkVendingMachineFinal(int stock, int price, String drinkType) {
        super(drinkType, price, stock);
        this.drinkType = drinkType;
    }
    @Override
    public void showStock() {
        System.out.println("飲み物自販機 - 在庫" + getStock() + "個");
    }
    @Override
    public void buy() {
        int s = getStock();
        if (s > 0) {
            setStock(--s);
            System.out.println("飲み物自販機 - 商品(" + drinkType + ")を購入しました");
        }
    }
    @Override
    public void refillStock(int amount) {
        setStock(getStock() + amount);
    }
}

class SnackVendingMachineFinal extends VendingMachineFinal implements IFVendingMachineFinal {
    private String snackType;
    public SnackVendingMachineFinal(int stock, int price, String snackType) {
        super(snackType, price, stock);
        this.snackType = snackType;
    }
    @Override
    public void showStock() {
        System.out.println("スナック自販機 - 在庫" + getStock() + "個");
    }
    @Override
    public void buy() {
        int s = getStock();
        if (s > 0) {
            setStock(--s);
            System.out.println("スナック自販機 - 商品(" + snackType + ")を購入しました");
        }
    }
    @Override
    public void refillStock(int amount) {
        setStock(getStock() + amount);
    }
}

public class Question20 {
    public static void main(String[] args) {
        IFVendingMachineFinal snack = new SnackVendingMachineFinal(10, 150, "ポテトチップス");
        IFVendingMachineFinal drink = new DrinkVendingMachineFinal(20, 120, "コーラ");
        IFVendingMachineFinal[] machines = {snack, drink};
        for (IFVendingMachineFinal m : machines) {
            m.showStock();
            m.buy();
            m.showStock();
        }
    }
}






