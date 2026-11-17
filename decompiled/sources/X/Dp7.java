package X;

import java.util.Iterator;

/* loaded from: classes5.dex */
public final class Dp7 implements Runnable {
    public static final String __redex_internal_original_name = "ListenerDispatcher$21";
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C5631DmF A02;

    public Dp7(C5631DmF c5631DmF, long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
        this.A02 = c5631DmF;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator itA00 = C5631DmF.A00(this.A02);
        while (itA00.hasNext()) {
            BV6.A0a(itA00).AVg(this.A01, this.A00);
        }
    }
}
