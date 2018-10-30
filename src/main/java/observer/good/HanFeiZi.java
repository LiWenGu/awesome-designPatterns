package observer.good;

import java.util.ArrayList;

public class HanFeiZi implements Observable, IHanFeiZi {

    private ArrayList<Observer> observerList = new ArrayList<Observer>();

    // 增加观察者
    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    // 删除观察者
    public void deleteObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    // 通知所有的观察者
    public void notifyObservers(String context) {
        for (Observer observer : observerList) {
            observer.update(context);
        }
    }

    // 韩非子要吃饭了
    public void haveBreakfast() {
        System.out.println("韩非子:开始吃饭了...");
        // 通知所有的观察者
        this.notifyObservers("韩非子在吃饭");
    }

    // 韩非子开始娱乐了
    public void haveFun() {
        System.out.println("韩非子:开始娱乐了...");
        this.notifyObservers("韩非子在娱乐");
    }
}
