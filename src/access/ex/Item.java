package access.ex;

/**
 * fileName : Item
 * author : handabin
 * date : 2025-02-21
 * description :
 * ===========================================================
 * DATE           AUTHOR       NOTE
 * -----------------------------------------------------------
 * 2025-02-21     handabin      New
 */
public class Item {
    /**
     * 클래스 내부 -> field + method 조합
     * 클래스에 존재하는 field, field에 저장된 값은 HEAP 영역에서 다른 메모리가 할당됨
     */
    private String name;
    private int price;
    private int quantity;

    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    /**
     * 클래스에 존재하는 method,
     */
    public String getName() {
        return name;
    }

    public int getTotalPrice() {
        return price * quantity;
    }

}
