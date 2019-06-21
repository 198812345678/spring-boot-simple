package com.will.example.spring.jiemi;

import com.will.example.spring.jiemi.IFXNewsListener;
import com.will.example.spring.jiemi.IFXNewsPersister;

public class FXNewsProvider implements IFXNewsListenerCallable{

    private IFXNewsListener newsListener;
    private IFXNewsPersister newsPersister;
    private String listenerName;

    public FXNewsProvider() {
//        this.newsListener = newsListener = new DowJonesNewsListener();
//        this.newsPersister = newsPersister = new DowJonesNewsPersister();
    }

    public FXNewsProvider(IFXNewsListener newsListener, IFXNewsPersister newsPersister) {
        this.newsListener = newsListener;
        this.newsPersister = newsPersister;
    }

    public IFXNewsListener getNewsListener() {
        return newsListener;
    }

    public void setNewsListener(IFXNewsListener newsListener) {
        this.newsListener = newsListener;
    }

    public IFXNewsPersister getNewsPersister() {
        return newsPersister;
    }

    public void setNewsPersister(IFXNewsPersister newsPersister) {
        this.newsPersister = newsPersister;
    }

    public void getAndPersistNews() {
        System.out.println(this.getClass().getSimpleName() + "getAndPersistNews");
    }

    public String getListenerName() {
        return listenerName;
    }

    public void setListenerName(String listenerName) {
        this.listenerName = listenerName;
    }

    @Override
    public void injectNewsListener(IFXNewsListener listener) {
        this.newsListener = listener;
    }
}
