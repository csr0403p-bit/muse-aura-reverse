package X;

import java.util.Iterator;

/* loaded from: classes5.dex */
public final class Do8 implements Runnable {
    public static final String __redex_internal_original_name = "ListenerDispatcher$9";
    public final /* synthetic */ C5631DmF A00;
    public final /* synthetic */ C6060Duv A01;
    public final /* synthetic */ Dq8 A02;
    public final /* synthetic */ C5623Dm6 A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    public Do8(C5631DmF c5631DmF, C6060Duv c6060Duv, Dq8 dq8, C5623Dm6 c5623Dm6, Integer num, String str, String str2, String str3, boolean z, boolean z2) {
        this.A03 = c5623Dm6;
        this.A05 = str;
        this.A06 = str2;
        this.A02 = dq8;
        this.A01 = c6060Duv;
        this.A04 = num;
        this.A09 = z;
        this.A08 = z2;
        this.A07 = str3;
        this.A00 = c5631DmF;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator itA00 = C5631DmF.A00(this.A00);
        while (itA00.hasNext()) {
            InterfaceC5756Dor interfaceC5756Dor = (InterfaceC5756Dor) itA00.next();
            C5623Dm6 c5623Dm6 = this.A03;
            String str = this.A05;
            String str2 = this.A06;
            Dq8 dq8 = this.A02;
            interfaceC5756Dor.AX4(this.A01, dq8, c5623Dm6, this.A04, str, str2, this.A07, this.A09, this.A08);
        }
    }
}
