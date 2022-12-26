class BankAccount {
    String owner;
    int money;

    BankAccount(String owner, int moneyAmount) {
        this.money = moneyAmount;
        this.owner = owner;
    }

    String getOwner() {
        return this.owner;
    }

    int getMoney() {
        return this.money;
    }
}
