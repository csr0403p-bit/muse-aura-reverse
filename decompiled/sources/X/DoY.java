package X;

import java.util.Iterator;

/* loaded from: classes5.dex */
public final class DoY implements Runnable {
    public static final String __redex_internal_original_name = "ListenerDispatcher$13";
    public final /* synthetic */ long A00;
    public final /* synthetic */ C5631DmF A01;
    public final /* synthetic */ Dq8 A02;
    public final /* synthetic */ C5623Dm6 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;

    public DoY(C5631DmF c5631DmF, Dq8 dq8, C5623Dm6 c5623Dm6, String str, String str2, String str3, String str4, long j, boolean z) {
        this.A03 = c5623Dm6;
        this.A02 = dq8;
        this.A05 = str;
        this.A06 = str2;
        this.A04 = str3;
        this.A00 = j;
        this.A08 = z;
        this.A07 = str4;
        this.A01 = c5631DmF;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator itA00 = C5631DmF.A00(this.A01);
        while (itA00.hasNext()) {
            InterfaceC5756Dor interfaceC5756Dor = (InterfaceC5756Dor) itA00.next();
            C5623Dm6 c5623Dm6 = this.A03;
            interfaceC5756Dor.AX3(this.A02, c5623Dm6, this.A05, this.A06, this.A04, this.A07, this.A00, this.A08);
        }
    }
}
