package X;

import java.util.Iterator;

/* renamed from: X.Doa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC5739Doa implements Runnable {
    public static final String __redex_internal_original_name = "ListenerDispatcher$5";
    public final /* synthetic */ long A00;
    public final /* synthetic */ C5631DmF A01;
    public final /* synthetic */ Dq8 A02;
    public final /* synthetic */ C5623Dm6 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;

    public RunnableC5739Doa(C5631DmF c5631DmF, Dq8 dq8, C5623Dm6 c5623Dm6, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, boolean z, boolean z2) {
        this.A03 = c5623Dm6;
        this.A04 = str;
        this.A05 = str2;
        this.A02 = dq8;
        this.A0C = z;
        this.A0B = z2;
        this.A0A = str3;
        this.A06 = str4;
        this.A00 = j;
        this.A07 = str5;
        this.A08 = str6;
        this.A09 = str7;
        this.A01 = c5631DmF;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator itA00 = C5631DmF.A00(this.A01);
        while (itA00.hasNext()) {
            InterfaceC5756Dor interfaceC5756Dor = (InterfaceC5756Dor) itA00.next();
            C5623Dm6 c5623Dm6 = this.A03;
            String str = this.A04;
            String str2 = this.A05;
            Dq8 dq8 = this.A02;
            boolean z = this.A0C;
            boolean z2 = this.A0B;
            interfaceC5756Dor.AXI(dq8, c5623Dm6, str, str2, this.A0A, this.A06, this.A07, this.A08, this.A09, this.A00, z, z2);
        }
    }
}
