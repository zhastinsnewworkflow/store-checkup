void main() {
    Scanner input = new Scanner(System.in);
    int nextaction = 0;
    double totally = 0;
    int quantity = 0, quantity1 = 0, quantity2 = 0, quantity3 = 0;
    while (nextaction != 5) {
        double tototal = 0, keyboard = 40, headphones = 50, lapstand = 30;
        double mousesum = 20;
        double discount;
        double discount2;
        double finaltotal;
        double finaltotalhundert;
        int sumquan;
        System.out.println("==== SIMPLE STORE ====");
        System.out.println("1. Mouse - $" + mousesum);
        System.out.println("2. Keyboard - $" + keyboard);
        System.out.println("3. Headphones - $" + headphones);
        System.out.println("4. Laptop Stand - $" + lapstand);
        System.out.println("5. Checkout\n");
        System.out.print("Choose a product: ");
        switch (nextaction = input.nextInt()) {
            case 1:
                System.out.println("You selected: Mouse");
                System.out.println("Price: $" + mousesum);
                System.out.print("Enter the quantity: ");
                quantity = input.nextInt();
                System.out.println("");
                if (quantity <= 0) {
                    System.out.println("invalid quantity");
                    System.out.println("Quantity must be greater than 0");
                    System.out.println("");
                    break;
                }
                if (quantity >= 5) {
                    mousesum *= 0.95;
                    tototal = mousesum * quantity;
                    totally += tototal;
                    System.out.println("You got discount 5% on this product!");
                    System.out.println("Current total: $" + totally + "\n");
                } else {
                    System.out.println("");
                    System.out.println("Added to cart!");
                    tototal = mousesum * quantity;
                    totally += tototal;
                    System.out.println("Current total: $" + totally + "\n");
                }
                break;
            case 2:
                System.out.println("You selected: Keyboard");
                System.out.println("Price: $" + keyboard);
                System.out.print("Enter the quantity: ");
                quantity1 = input.nextInt();
                System.out.println("");
                if (quantity1 <= 0) {
                    System.out.println("invalid quantity");
                    System.out.println("Quantity must be greater than 0");
                    break;
                }
                if (quantity1 >= 5) {
                    keyboard *= 0.95;
                    tototal = keyboard * quantity1;
                    totally += tototal;
                    System.out.println("You got discount 5% on this product!");
                    System.out.println("Current total: $" + totally + "\n");
                } else {
                    System.out.println("");
                    System.out.println("Added to cart!");
                    tototal = keyboard * quantity1;
                    totally += tototal;
                    System.out.println("Current total: $" + totally + "\n");
                }
                break;
            case 3:
                System.out.println("You selected: Headphones");
                System.out.println("Price: $" + headphones);
                System.out.print("Enter the quantity: ");
                quantity2 = input.nextInt();
                System.out.println("");
                if (quantity2 <= 0) {
                    System.out.println("invalid quantity");
                    System.out.println("Quantity must be greater than 0");
                    System.out.println("");
                    break;
                }
                if (quantity2 >= 5) {
                    headphones *= 0.95;
                    tototal = headphones * quantity2;
                    totally += tototal;
                    System.out.println("You got discount 5% on this product!");
                    System.out.println("Current total: $" + totally + "\n");
                } else {
                    System.out.println("");
                    System.out.println("Added to cart!");
                    tototal = headphones * quantity2;
                    totally += tototal;
                    System.out.println("Current total: $" + totally + "\n");
                }
                break;
            case 4:
                System.out.println("You selected: Laptop Stand");
                System.out.println("Price: $" + lapstand);
                System.out.print("Enter the quantity: ");
                quantity3 = input.nextInt();
                System.out.println("");
                if (quantity3 <= 0) {
                    System.out.println("invalid quantity");
                    System.out.println("Quantity must be greater than 0");
                    System.out.println("\n");
                    System.out.println("");
                    break;
                }
                if (quantity3 >= 5) {
                    lapstand *= 0.95;
                    tototal = lapstand * quantity3;
                    totally += tototal;
                    System.out.println("You got discount 5% on this product!");
                    System.out.println("Current total: $" + totally + "\n");
                } else {
                    System.out.println("");
                    System.out.println("Added to cart!");
                    tototal = lapstand * quantity3;
                    totally += tototal;
                    System.out.println("Current total: $" + totally + "\n");
                }
                break;
            case 5:
                discount = totally * 0.10;
                discount2 = totally * 0.85;
                finaltotal = totally - discount;
                if (totally >= 100 && totally < 200) {
                    discount = totally * 0.10;
                    finaltotal = totally - discount;
                    System.out.println("Subtotal: $" + totally);
                    System.out.println("Discount: $" + discount);
                    System.out.println("Final total: $" + finaltotal);
                } else if (totally < 100) {
                    System.out.println("Subtotal: $" + totally);
                    System.out.println("Discount: $0");
                    System.out.println("Final total: $" + totally);
                } else if (totally >= 200) {
                    discount2 = totally * 0.15;
                    finaltotal = totally - discount2;
                    System.out.println("Subtotal: $" + totally);
                    System.out.println("Discount: $" + discount2);
                    System.out.println("Final total: $" + finaltotal);
                }
                sumquan = quantity + quantity1 + quantity2 + quantity3;
                finaltotalhundert = totally;
                int cycle = 0;
                while (cycle < 5) {
                    System.out.print("Enter payment amount: ");
                    int payment = input.nextInt();
                    if (payment < finaltotal && totally >= 100 && totally < 200) {
                        discount = totally * 0.10;
                        finaltotal = totally - discount;
                        System.out.println("");
                        System.out.println("Insufficient payment");
                        System.out.println("You still need to pay: $" + (finaltotal - payment));
                        System.out.println("");
                    } else if (payment < finaltotalhundert && totally < 100) {
                        finaltotalhundert = totally;
                        System.out.println("You still need to pay: $" + (finaltotalhundert - payment));
                    } else if (payment > finaltotal && totally < 100) {
                        finaltotalhundert = totally;
                        System.out.println("");
                        System.out.println("====================");
                        System.out.println("\tSIMPLE STORE");
                        System.out.println("====================");
                        System.out.println("");
                        System.out.println("Items purchased: " + sumquan);
                        System.out.println("Subtotal: $" + totally);
                        System.out.println("Discount: 0");
                        System.out.println("Payment: $" + payment);
                        System.out.println("Change: $" + (payment - finaltotalhundert));
                        System.out.println("");
                        if (sumquan >= 10) {
                            System.out.println("You earned a $10 coupon for your next visit!");
                        }
                        if (quantity > quantity1 && quantity > quantity2 && quantity > quantity3) {
                            System.out.println("Most purchased product: Mouse");
                            System.out.println("Quantity: " + quantity);
                        } else if (quantity1 > quantity && quantity1 > quantity2 && quantity1 > quantity3) {
                            System.out.println("Most purchased product: Keyboard");
                            System.out.println("Quantity: " + quantity1);
                        } else if (quantity2 > quantity && quantity2 > quantity1 && quantity2 > quantity3) {
                            System.out.println("Most purchased product: Headphones");
                            System.out.println("Quantity: " + quantity2);
                        } else if (quantity3 > quantity && quantity3 > quantity1 && quantity3 > quantity2) {
                            System.out.println("Most purchased product: Laptop Stand");
                            System.out.println("Quantity: " + quantity3);
                        }
                        System.out.println("==== ITEMS PURCHASED ====");
                        System.out.println("1. Mouse:" + quantity);
                        System.out.println("2. Keyboard: " + quantity1);
                        System.out.println("3. Headphones:" + quantity2);
                        System.out.println("4. Laptop Stand:" + quantity3);
                        System.out.println("====================");
                        System.out.println("Thank you for shopping!");
                        System.out.println("====================");
                        break;
                    } else if (payment < finaltotal && totally >= 200) {
                        discount2 = totally * 0.15;
                        finaltotal = totally - discount2;
                        System.out.println("");
                        System.out.println("Insufficient payment");
                        System.out.println("You still need to pay: $" + (finaltotal - payment));
                        System.out.println("");
                    } else if (payment > finaltotal && totally >= 100 && totally < 200) {
                        discount = totally * 0.10;
                        finaltotal = totally - discount;
                        System.out.println("");
                        System.out.println("====================");
                        System.out.println("\tSIMPLE STORE");
                        System.out.println("====================");
                        System.out.println("");
                        System.out.println("Items purchased: " + sumquan);
                        System.out.println("Subtotal: $" + totally);
                        System.out.println("Discount: $" + discount);
                        System.out.println("Final total: $" + finaltotal);
                        System.out.println("Payment: $" + payment);
                        System.out.println("Change: $" + (payment - finaltotal));
                        System.out.println("");
                        if (sumquan >= 10) {
                            System.out.println("You earned a $10 coupon for your next visit!");
                        }
                        if (quantity > quantity1 && quantity > quantity2 && quantity > quantity3) {
                            System.out.println("Most purchased product: Mouse");
                            System.out.println("Quantity: " + quantity);
                        } else if (quantity1 > quantity && quantity1 > quantity2 && quantity1 > quantity3) {
                            System.out.println("Most purchased product: Keyboard");
                            System.out.println("Quantity: " + quantity1);
                        } else if (quantity2 > quantity && quantity2 > quantity1 && quantity2 > quantity3) {
                            System.out.println("Most purchased product: Headphones");
                            System.out.println("Quantity: " + quantity2);
                        } else if (quantity3 > quantity && quantity3 > quantity1 && quantity3 > quantity2) {
                            System.out.println("Most purchased product: Laptop Stand");
                            System.out.println("Quantity: " + quantity3);
                        }
                        System.out.println("==== ITEMS PURCHASED ====");
                        System.out.println("1. Mouse:" + quantity);
                        System.out.println("2. Keyboard: " + quantity1);
                        System.out.println("3. Headphones:" + quantity2);
                        System.out.println("4. Laptop Stand:" + quantity3);
                        System.out.println("====================");
                        System.out.println("Thank you for shopping!");
                        System.out.println("====================");
                        break;
                    } else if (payment > finaltotal && totally >= 200) {
                        discount2 = totally * 0.15;
                        finaltotal = totally - discount2;
                        System.out.println("");
                        System.out.println("====================");
                        System.out.println("\tSIMPLE STORE");
                        System.out.println("====================");
                        System.out.println("");
                        System.out.println("Items purchased: " + sumquan);
                        System.out.println("Subtotal: $" + totally);
                        System.out.println("Discount: $" + discount2);
                        System.out.println("Final total: $" + finaltotal);
                        System.out.println("Payment: $" + payment);
                        System.out.println("Change: $" + (payment - finaltotal));
                        System.out.println("");
                        if (sumquan >= 10) {
                            System.out.println("You earned a $10 coupon for your next visit!");
                        }
                        if (quantity > quantity1 && quantity > quantity2 && quantity > quantity3) {
                            System.out.println("Most purchased product: Mouse");
                            System.out.println("Quantity: " + quantity);
                        } else if (quantity1 > quantity && quantity1 > quantity2 && quantity1 > quantity3) {
                            System.out.println("Most purchased product: Keyboard");
                            System.out.println("Quantity: " + quantity1);
                        } else if (quantity2 > quantity && quantity2 > quantity1 && quantity2 > quantity3) {
                            System.out.println("Most purchased product: Headphones");
                            System.out.println("Quantity: " + quantity2);
                        } else if (quantity3 > quantity && quantity3 > quantity1 && quantity3 > quantity2) {
                            System.out.println("Most purchased product: Laptop Stand");
                            System.out.println("Quantity: " + quantity3);
                        }
                        System.out.println("");
                        System.out.println("==== ITEMS PURCHASED ====");
                        System.out.println("1. Mouse:" + quantity);
                        System.out.println("2. Keyboard: " + quantity1);
                        System.out.println("3. Headphones:" + quantity2);
                        System.out.println("4. Laptop Stand:" + quantity3);
                        System.out.println("====================");
                        System.out.println("Thank you for shopping!");
                        System.out.println("====================");
                        break;
                    } else if (payment == finaltotal && totally >= 100 && totally < 200) {
                        System.out.println("");
                        System.out.println("====================");
                        System.out.println("\tSIMPLE STORE");
                        System.out.println("====================");
                        System.out.println("");
                        System.out.println("Items purchased: " + sumquan);
                        System.out.println("Subtotal: $" + totally);
                        System.out.println("Discount: $" + discount);
                        System.out.println("Final total: $" + finaltotal);
                        System.out.println("Payment: $" + payment);
                        System.out.println("Change: $" + (payment - finaltotal));
                        System.out.println("");
                        if (sumquan >= 10) {
                            System.out.println("You earned a $10 coupon for your next visit!");
                        }
                        if (quantity > quantity1 && quantity > quantity2 && quantity > quantity3) {
                            System.out.println("Most purchased product: Mouse");
                            System.out.println("Quantity: " + quantity);
                        } else if (quantity1 > quantity && quantity1 > quantity2 && quantity1 > quantity3) {
                            System.out.println("Most purchased product: Keyboard");
                            System.out.println("Quantity: " + quantity1);
                        } else if (quantity2 > quantity && quantity2 > quantity1 && quantity2 > quantity3) {
                            System.out.println("Most purchased product: Headphones");
                            System.out.println("Quantity: " + quantity2);
                        } else if (quantity3 > quantity && quantity3 > quantity1 && quantity3 > quantity2) {
                            System.out.println("Most purchased product: Laptop Stand");
                            System.out.println("Quantity: " + quantity3);
                        }
                        System.out.println("==== ITEMS PURCHASED ====");
                        System.out.println("1. Mouse:" + quantity);
                        System.out.println("2. Keyboard: " + quantity1);
                        System.out.println("3. Headphones:" + quantity2);
                        System.out.println("4. Laptop Stand:" + quantity3);
                        System.out.println("====================");
                        System.out.println("Thank you for shopping!");
                        System.out.println("====================");
                        break;
                    } else if (payment == finaltotal && totally >= 200) {
                        System.out.println("");
                        System.out.println("====================");
                        System.out.println("\tSIMPLE STORE");
                        System.out.println("====================");
                        System.out.println("");
                        System.out.println("Items purchased: " + sumquan);
                        System.out.println("Subtotal: $" + totally);
                        System.out.println("Discount: $" + discount2);
                        System.out.println("Final total: $" + finaltotal);
                        System.out.println("Payment: $" + payment);
                        System.out.println("Change: $" + (payment - finaltotal));
                        System.out.println("");
                        if (sumquan >= 10) {
                            System.out.println("You earned a $10 coupon for your next visit!");
                        }
                        if (quantity > quantity1 && quantity > quantity2 && quantity > quantity3) {
                            System.out.println("Most purchased product: Mouse");
                            System.out.println("Quantity: " + quantity);
                        } else if (quantity1 > quantity && quantity1 > quantity2 && quantity1 > quantity3) {
                            System.out.println("Most purchased product: Keyboard");
                            System.out.println("Quantity: " + quantity1);
                        } else if (quantity2 > quantity && quantity2 > quantity1 && quantity2 > quantity3) {
                            System.out.println("Most purchased product: Headphones");
                            System.out.println("Quantity: " + quantity2);
                        } else if (quantity3 > quantity && quantity3 > quantity1 && quantity3 > quantity2) {
                            System.out.println("Most purchased product: Laptop Stand");
                            System.out.println("Quantity: " + quantity3);
                        }
                        System.out.println("==== ITEMS PURCHASED ====");
                        System.out.println("1. Mouse:" + quantity);
                        System.out.println("2. Keyboard: " + quantity1);
                        System.out.println("3. Headphones:" + quantity2);
                        System.out.println("4. Laptop Stand:" + quantity3);
                        System.out.println("====================");
                        System.out.println("Thank you for shopping!");
                        System.out.println("====================");
                        break;
                    }
                }
                break;
            default:
                System.out.println("");
                System.out.println("Invalid option");
                System.out.println("Please choose a number from 1 to 5");
                System.out.println("\n");
        }
    }
}
