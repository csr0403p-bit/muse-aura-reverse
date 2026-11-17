package X;

import java.util.Iterator;

/* renamed from: X.DpH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC5775DpH implements Runnable {
    public static final String __redex_internal_original_name = "ListenerDispatcher$6";
    public final /* synthetic */ C5631DmF A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    public RunnableC5775DpH(C5631DmF c5631DmF, boolean z, boolean z2) {
        this.A02 = z;
        this.A01 = z2;
        this.A00 = c5631DmF;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator itA00 = C5631DmF.A00(this.A00);
        while (itA00.hasNext()) {
            BV6.A0a(itA00).AXL(this.A02, this.A01);
        }
    }
}
