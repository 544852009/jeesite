package com.thinkgem.jeesite.TheadYinHang;

public class Bank implements Runnable{

    static int deposit = 1000;

    Person person;

    public Bank(Person person) {
        this.person = person;
    }

    public synchronized void quMoney(Person person){
        while (deposit>0) {
            if (deposit > 100) {
                System.out.println(person.getUserName() + "取走了100元。还剩下"+deposit+"元");
                deposit -= 100;
            } else {
                System.out.println("用户余额不足。"+person.getUserName());
            }
        }
    }

    @Override
    public void run() {
        quMoney(person);
    }
}
