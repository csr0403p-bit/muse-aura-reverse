package X;

import java.util.Iterator;

/* renamed from: X.Dp3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC5767Dp3 implements Runnable {
    public static final String __redex_internal_original_name = "ListenerDispatcher$8";
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C5631DmF A02;
    public final /* synthetic */ C5623Dm6 A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public RunnableC5767Dp3(C5631DmF c5631DmF, C5623Dm6 c5623Dm6, long j, long j2, boolean z, boolean z2, boolean z3) {
        this.A03 = c5623Dm6;
        this.A01 = j;
        this.A00 = j2;
        this.A04 = z;
        this.A06 = z2;
        this.A05 = z3;
        this.A02 = c5631DmF;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator itA00 = C5631DmF.A00(this.A02);
        while (itA00.hasNext()) {
            ((InterfaceC5756Dor) itA00.next()).AWG(this.A03, this.A01, this.A00, this.A04, this.A06, this.A05);
        }
    }
}
