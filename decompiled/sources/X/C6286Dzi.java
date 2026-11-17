package X;

import java.io.Serializable;

/* renamed from: X.Dzi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6286Dzi implements Serializable {
    public final C6288Dzk prefetch;
    public final C6291Dzn prefetchFeedDistance;
    public final C6288Dzk startup;
    public final boolean usePlayerStartThreshold;

    /* JADX WARN: Multi-variable type inference failed */
    public C6286Dzi() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, false);
    }

    public /* synthetic */ C6286Dzi(C6291Dzn c6291Dzn, C6288Dzk c6288Dzk, C6288Dzk c6288Dzk2, C06H c06h, int i, boolean z) {
        C6288Dzk c6288Dzk3 = new C6288Dzk(null, 7, 0L, 0L, 0L);
        C6288Dzk c6288Dzk4 = new C6288Dzk(null, 7, 0L, 0L, 0L);
        C6291Dzn c6291Dzn2 = new C6291Dzn(3L, "3,200; 4,600; 5,1200", false, 5L);
        this.startup = c6288Dzk3;
        this.prefetch = c6288Dzk4;
        this.prefetchFeedDistance = c6291Dzn2;
        this.usePlayerStartThreshold = false;
    }
}
