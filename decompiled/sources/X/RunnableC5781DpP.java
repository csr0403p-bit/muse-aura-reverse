package X;

import java.util.Iterator;

/* renamed from: X.DpP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC5781DpP implements Runnable {
    public static final String __redex_internal_original_name = "ListenerDispatcher$2";
    public final /* synthetic */ C5631DmF A00;

    public RunnableC5781DpP(C5631DmF c5631DmF) {
        this.A00 = c5631DmF;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator itA00 = C5631DmF.A00(this.A00);
        while (itA00.hasNext()) {
            BV6.A0a(itA00).ATQ();
        }
    }
}
