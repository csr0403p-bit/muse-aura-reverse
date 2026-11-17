package com.facebook.aura.gateway;

/* loaded from: classes5.dex */
public final class ConnectionPointTracker {
    public static final int $stable = 8;
    public boolean wasLogged;

    public final Long consumeTimestamp(Long l, Long l2) {
        long jLongValue;
        if (this.wasLogged) {
            return null;
        }
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            if (l2 == null) {
                return null;
            }
            jLongValue = l2.longValue();
        }
        this.wasLogged = true;
        return Long.valueOf(jLongValue);
    }
}
