package X;

import java.util.Iterator;

/* renamed from: X.DpB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC5769DpB implements Runnable {
    public static final String __redex_internal_original_name = "ListenerDispatcher$32";
    public final /* synthetic */ int A00;
    public final /* synthetic */ C5631DmF A01;

    public RunnableC5769DpB(C5631DmF c5631DmF, int i) {
        this.A00 = i;
        this.A01 = c5631DmF;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator itA00 = C5631DmF.A00(this.A01);
        while (itA00.hasNext()) {
            BV6.A0a(itA00).ARl(this.A00);
        }
    }
}
