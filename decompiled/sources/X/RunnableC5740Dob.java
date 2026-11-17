package X;

import java.util.Iterator;

/* renamed from: X.Dob, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC5740Dob implements Runnable {
    public static final String __redex_internal_original_name = "ListenerDispatcher$7";
    public final /* synthetic */ long A00;
    public final /* synthetic */ C5631DmF A01;
    public final /* synthetic */ Dq8 A02;
    public final /* synthetic */ C5623Dm6 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public RunnableC5740Dob(C5631DmF c5631DmF, Dq8 dq8, C5623Dm6 c5623Dm6, String str, long j, boolean z, boolean z2) {
        this.A03 = c5623Dm6;
        this.A02 = dq8;
        this.A06 = z;
        this.A05 = z2;
        this.A00 = j;
        this.A04 = str;
        this.A01 = c5631DmF;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator itA00 = C5631DmF.A00(this.A01);
        while (itA00.hasNext()) {
            InterfaceC5756Dor interfaceC5756Dor = (InterfaceC5756Dor) itA00.next();
            C5623Dm6 c5623Dm6 = this.A03;
            Dq8 dq8 = this.A02;
            boolean z = this.A06;
            boolean z2 = this.A05;
            interfaceC5756Dor.AW9(dq8, c5623Dm6, this.A04, this.A00, z, z2);
        }
    }
}
