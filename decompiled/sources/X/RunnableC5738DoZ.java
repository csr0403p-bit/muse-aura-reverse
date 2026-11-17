package X;

import java.util.Iterator;

/* renamed from: X.DoZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC5738DoZ implements Runnable {
    public static final String __redex_internal_original_name = "ListenerDispatcher$33";
    public final /* synthetic */ float A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C5631DmF A02;
    public final /* synthetic */ C5623Dm6 A03;

    public RunnableC5738DoZ(C5631DmF c5631DmF, C5623Dm6 c5623Dm6, float f, long j) {
        this.A00 = f;
        this.A01 = j;
        this.A03 = c5623Dm6;
        this.A02 = c5631DmF;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator itA00 = C5631DmF.A00(this.A02);
        while (itA00.hasNext()) {
            BV6.A0a(itA00).AUg(this.A03, this.A00, this.A01);
        }
    }
}
