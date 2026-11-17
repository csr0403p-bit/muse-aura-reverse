package X;

import java.util.Iterator;

/* loaded from: classes5.dex */
public final class Dp5 implements Runnable {
    public static final String __redex_internal_original_name = "ListenerDispatcher$15";
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ C5631DmF A04;
    public final /* synthetic */ String A05;

    public Dp5(C5631DmF c5631DmF, String str, long j, long j2, long j3, long j4) {
        this.A00 = j;
        this.A03 = j2;
        this.A02 = j3;
        this.A01 = j4;
        this.A05 = str;
        this.A04 = c5631DmF;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator itA00 = C5631DmF.A00(this.A04);
        while (itA00.hasNext()) {
            ((InterfaceC5756Dor) itA00.next()).ATm(this.A05, this.A00, this.A03, this.A02, this.A01);
        }
    }
}
