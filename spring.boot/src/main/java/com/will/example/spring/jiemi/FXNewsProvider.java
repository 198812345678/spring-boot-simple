package com.will.example.spring.jiemi;

import com.will.example.spring.jiemi.IFXNewsListener;
import com.will.example.spring.jiemi.IFXNewsPersister;

public class FXNewsProvider implements IFXNewsListenerCallable{

    private IFXNewsListener newsListener;
    private IFXNewsPersister newsPersister;

    public FXNewsProvider() {
        this.newsListener = newsListener = new DowJonesNewsListener();
        this.newsPersister = newsPersister = new DowJonesNewsPersister();
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

    @Override
    public void injectNewsListener(IFXNewsListener listener) {
        this.newsListener = listener;
    }
}
