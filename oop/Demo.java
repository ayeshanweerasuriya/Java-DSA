package oop;

class Order {
    String id; // customer id
    double amount;

    Order(String id, double amount) {
        this.id = id;
        this.amount = amount;
    }
}

class Demo {
    public static void printOrders(Order[] orderArray) {
        System.out.print("[");
        for (int i = 0; i < orderArray.length; i++) {
            System.out.print(orderArray[i].id + "-" + orderArray[i].amount + ", ");
        }
        System.out.println("\b\b]");
    }

    public static void sortOrderArray(Order[] orderArray) {

        for (int i = 0; i < orderArray.length - 1; i++) {
            for (int j = 0; j < orderArray.length - i - 1; j++) {
                if (orderArray[j].amount > orderArray[j + 1].amount) {
                    double temp = orderArray[j].amount;
                    orderArray[j].amount = orderArray[j + 1].amount;
                    orderArray[j + 1].amount = temp;

                    String tempId = orderArray[j].id;
                    orderArray[j].id = orderArray[j + 1].id;
                    orderArray[j + 1].id = tempId;
                }
            }
        }
    }

    public static void main(String args[]) {
        Order[] orderArray = {
                new Order("C001", 4500),
                new Order("C002", 2500),
                new Order("C003", 6500),
                new Order("C004", 1500),
                new Order("C005", 3500),
                new Order("C005", 5500),
        };
        printOrders(orderArray);// [C001-4500, C002-2500, C003-6500,C004-1500,C005-3500,C005-5500]

        sortOrderArray(orderArray);

        printOrders(orderArray);// [C001-1500,C002-2500,C005-3500,C001-4500,C005-5500,C003-6500]
    }
}
