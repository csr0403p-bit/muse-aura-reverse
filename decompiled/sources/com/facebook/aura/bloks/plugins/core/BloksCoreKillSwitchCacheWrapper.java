package com.facebook.aura.bloks.plugins.core;

import X.BrF;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class BloksCoreKillSwitchCacheWrapper {
    public static int sCacheId = -1;
    public static Boolean sIsNeeded;

    public static boolean isNeeded(int i, AtomicInteger atomicInteger, BrF brF) {
        Boolean bool = sIsNeeded;
        if (bool == null || sCacheId != i) {
            atomicInteger.getAndIncrement();
            try {
                bool = true;
                sIsNeeded = bool;
                sCacheId = i;
            } catch (Exception e) {
                throw e;
            }
        }
        return bool.booleanValue();
    }

    public static Boolean peekIsNeeded(int i) {
        if (sCacheId != i) {
            return null;
        }
        return sIsNeeded;
    }
}
