package X;

import java.util.Iterator;

/* loaded from: classes5.dex */
public final class Dp8 implements Runnable {
    public static final String __redex_internal_original_name = "ListenerDispatcher$26";
    public final /* synthetic */ long A00;
    public final /* synthetic */ C5631DmF A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public Dp8(C5631DmF c5631DmF, String str, long j, boolean z) {
        this.A02 = str;
        this.A03 = z;
        this.A00 = j;
        this.A01 = c5631DmF;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator itA00 = C5631DmF.A00(this.A01);
        while (itA00.hasNext()) {
            BV6.A0a(itA00).ASV(this.A02, this.A03, this.A00);
        }
    }
}
