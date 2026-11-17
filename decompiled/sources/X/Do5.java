package X;

import java.util.Iterator;

/* loaded from: classes5.dex */
public final class Do5 implements Runnable {
    public static final String __redex_internal_original_name = "ListenerDispatcher$11";
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C5631DmF A02;
    public final /* synthetic */ C6060Duv A03;
    public final /* synthetic */ Dq8 A04;
    public final /* synthetic */ C5623Dm6 A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;

    public Do5(C5631DmF c5631DmF, C6060Duv c6060Duv, Dq8 dq8, C5623Dm6 c5623Dm6, Integer num, String str, String str2, String str3, String str4, String str5, long j, long j2, boolean z, boolean z2) {
        this.A05 = c5623Dm6;
        this.A07 = str;
        this.A08 = str2;
        this.A04 = dq8;
        this.A03 = c6060Duv;
        this.A01 = j;
        this.A06 = num;
        this.A00 = j2;
        this.A09 = str3;
        this.A0A = str4;
        this.A0C = z;
        this.A0D = z2;
        this.A0B = str5;
        this.A02 = c5631DmF;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator itA00 = C5631DmF.A00(this.A02);
        while (itA00.hasNext()) {
            InterfaceC5756Dor interfaceC5756Dor = (InterfaceC5756Dor) itA00.next();
            C5623Dm6 c5623Dm6 = this.A05;
            String str = this.A07;
            String str2 = this.A08;
            Dq8 dq8 = this.A04;
            C6060Duv c6060Duv = this.A03;
            long j = this.A01;
            Integer num = this.A06;
            long j2 = this.A00;
            interfaceC5756Dor.AXD(c6060Duv, dq8, c5623Dm6, num, str, str2, this.A09, this.A0A, this.A0B, j, j2, this.A0C, this.A0D);
        }
    }
}
