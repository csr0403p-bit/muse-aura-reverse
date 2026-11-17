package X;

import java.util.Iterator;

/* renamed from: X.Dp1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC5765Dp1 implements Runnable {
    public static final String __redex_internal_original_name = "ListenerDispatcher$45";
    public final /* synthetic */ C5631DmF A00;
    public final /* synthetic */ C5841DqX A01;

    public RunnableC5765Dp1(C5631DmF c5631DmF, C5841DqX c5841DqX) {
        this.A01 = c5841DqX;
        this.A00 = c5631DmF;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator itA00 = C5631DmF.A00(this.A00);
        while (itA00.hasNext()) {
            BV6.A0a(itA00).ATs(this.A01);
        }
    }
}
