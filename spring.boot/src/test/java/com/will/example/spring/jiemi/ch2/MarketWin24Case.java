package com.will.example.spring.jiemi.ch2;

import com.will.example.spring.jiemi.DowJonesNewsListener;
import com.will.example.spring.jiemi.DowJonesNewsPersister;
import com.will.example.spring.jiemi.FXNewsProvider;
import com.will.example.spring.jiemi.MarketWin24NewsListener;
import org.junit.Test;

import static org.junit.Assert.*;

public class MarketWin24Case {

    @Test
    public void test1() {
        FXNewsProvider dowJonesNewsProvider = new FXNewsProvider(new DowJonesNewsListener(),new DowJonesNewsPersister());

        FXNewsProvider marketWin24NewsProvider = new FXNewsProvider(new MarketWin24NewsListener(),new DowJonesNewsPersister());
    }
}