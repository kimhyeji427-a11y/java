public class Barista {
    private int money;
    private boolean hasCoffee;

    public Barista()
    {
        money = 0;
        hasCoffee = false;
    }

    public Barista(int money)
    {
        this.money = money;
        hasCoffee = false;
    }

    public Barista(int money, boolean hasCoffee)
    {
        this.money = money;
        this.hasCoffee = hasCoffee;
    }

    public void print()
    {
        System.out.println(money);
        System.out.println(hasCoffee);
    }

    public int pay(int coffeePrice) //원두가 없어 주문이 불가능한 상황
    {
        if( money <= coffeePrice )
        {
            coffeeBeans == 0 //커피빈을 확인한 결과 0인 상태
            System.out.println("[바리스타] 원두가 없어서 주문이 불가능합니다.");
            return -9;
        }

        money = money - coffeePrice;
        return 0;
    }

   public void refund(int price) //받은 돈(price)을 손님에게 다시 돌려줌
   {
       System.out.println("[바리스타]" + price + "원을 돌려드립니다.");
   }

    public void order(Barista barista, String menuName)
    {
        System.out.println("[손님]" + menuName + "를 한 잔 주세요.");
        int price = barista.getCoffeePrice();
        System.out.println("[바리스타] 커피 가격은 " + price + "원 입니다.");

        int paymentCheck = pay(price);
        if( paymentCheck == -9)
            return;

        System.out.println("[손님]" + price +"원을 지불했습니다.");
        String coffee = barista.takeOrder(menuName, price);
        takeCoffee(coffee);

    }

    public void takeCoffee(String coffee)
    {
        hasCoffee = true;
        System.out.println("[손님] " + coffee + "를 받았습니다");
    }
}
