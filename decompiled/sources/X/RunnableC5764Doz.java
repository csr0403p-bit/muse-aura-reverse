package X;

import java.util.Iterator;

/* renamed from: X.Doz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC5764Doz implements Runnable {
    public static final String __redex_internal_original_name = "ListenerDispatcher$41";
    public final /* synthetic */ long A00;
    public final /* synthetic */ C5631DmF A01;
    public final /* synthetic */ C5790DpZ A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public RunnableC5764Doz(C5631DmF c5631DmF, C5790DpZ c5790DpZ, String str, String str2, String str3, long j) {
        this.A00 = j;
        this.A05 = str;
        this.A02 = c5790DpZ;
        this.A03 = str2;
        this.A04 = str3;
        this.A01 = c5631DmF;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator itA00 = C5631DmF.A00(this.A01);
        while (itA00.hasNext()) {
            InterfaceC5756Dor interfaceC5756Dor = (InterfaceC5756Dor) itA00.next();
            long j = this.A00;
            interfaceC5756Dor.AT7(this.A02, this.A05, this.A03, this.A04, j);
        }
    }
}
