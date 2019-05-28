package com.league.pigeon.spi;

import java.util.ServiceLoader;

/**
 * Created by coraline on 2019/5/24.
 */
public class SPI {
    public static void main(String[] args) {
        ServiceLoader<Shout> serviceLoaders = ServiceLoader.load(Shout.class);
        for (Shout shout : serviceLoaders) {
            shout.shout();
        }
    }
}
