package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.CHi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3364CHi {
    public static final AtomicInteger A00 = BV5.A17();

    public static long A00() {
        long jCurrentTimeMillis;
        synchronized (C3364CHi.class) {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        return jCurrentTimeMillis / 86400000;
    }

    public static long A01() {
        long jCurrentTimeMillis;
        synchronized (C3364CHi.class) {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        return jCurrentTimeMillis / 3600000;
    }
}
