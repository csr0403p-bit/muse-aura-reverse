package X;

import java.util.Iterator;

/* loaded from: classes5.dex */
public final class Do6 implements Runnable {
    public static final String __redex_internal_original_name = "ListenerDispatcher$14";
    public final /* synthetic */ C5631DmF A00;
    public final /* synthetic */ C6060Duv A01;
    public final /* synthetic */ C5790DpZ A02;
    public final /* synthetic */ Dq8 A03;
    public final /* synthetic */ C5623Dm6 A04;
    public final /* synthetic */ String A05;

    public Do6(C5631DmF c5631DmF, C6060Duv c6060Duv, C5790DpZ c5790DpZ, Dq8 dq8, C5623Dm6 c5623Dm6, String str) {
        this.A04 = c5623Dm6;
        this.A03 = dq8;
        this.A01 = c6060Duv;
        this.A02 = c5790DpZ;
        this.A05 = str;
        this.A00 = c5631DmF;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator itA00 = C5631DmF.A00(this.A00);
        while (itA00.hasNext()) {
            ((InterfaceC5756Dor) itA00.next()).AUc(this.A04, this.A03, this.A01, this.A02, this.A05);
        }
    }
}
