package X;

import java.util.Iterator;

/* renamed from: X.Dop, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC5754Dop implements Runnable {
    public static final String __redex_internal_original_name = "ListenerDispatcher$22";
    public final /* synthetic */ C5631DmF A00;
    public final /* synthetic */ C5892DrZ A01;

    public RunnableC5754Dop(C5631DmF c5631DmF, C5892DrZ c5892DrZ) {
        this.A01 = c5892DrZ;
        this.A00 = c5631DmF;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator itA00 = C5631DmF.A00(this.A00);
        while (itA00.hasNext()) {
            BV6.A0a(itA00).ATa(this.A01);
        }
    }
}
