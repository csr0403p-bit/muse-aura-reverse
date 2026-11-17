package X;

import java.util.Iterator;

/* renamed from: X.DpE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC5772DpE implements Runnable {
    public static final String __redex_internal_original_name = "ListenerDispatcher$38";
    public final /* synthetic */ C5631DmF A00;
    public final /* synthetic */ Object A01;

    public RunnableC5772DpE(C5631DmF c5631DmF, Object obj) {
        this.A01 = obj;
        this.A00 = c5631DmF;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator itA00 = C5631DmF.A00(this.A00);
        while (itA00.hasNext()) {
            BV6.A0a(itA00).AUB(this.A01);
        }
    }
}
