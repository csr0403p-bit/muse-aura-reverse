package X;

import java.util.Iterator;

/* loaded from: classes5.dex */
public final class Dp6 implements Runnable {
    public static final String __redex_internal_original_name = "ListenerDispatcher$20";
    public final /* synthetic */ long A00;
    public final /* synthetic */ C5631DmF A01;
    public final /* synthetic */ String A02;

    public Dp6(C5631DmF c5631DmF, String str, long j) {
        this.A00 = j;
        this.A02 = str;
        this.A01 = c5631DmF;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator itA00 = C5631DmF.A00(this.A01);
        while (itA00.hasNext()) {
            BV6.A0a(itA00).AVh(this.A00, this.A02);
        }
    }
}
