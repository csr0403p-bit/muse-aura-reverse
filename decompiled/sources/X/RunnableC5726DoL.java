package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.DoL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC5726DoL implements Runnable {
    public static final String __redex_internal_original_name = "ListenerDispatcher$40";
    public final /* synthetic */ long A00;
    public final /* synthetic */ C5631DmF A01;
    public final /* synthetic */ C5790DpZ A02;
    public final /* synthetic */ C5723DoI A03;
    public final /* synthetic */ C5723DoI A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ List A07;

    public RunnableC5726DoL(C5631DmF c5631DmF, C5790DpZ c5790DpZ, C5723DoI c5723DoI, C5723DoI c5723DoI2, String str, String str2, List list, long j) {
        this.A03 = c5723DoI;
        this.A04 = c5723DoI2;
        this.A00 = j;
        this.A06 = str;
        this.A07 = list;
        this.A05 = str2;
        this.A02 = c5790DpZ;
        this.A01 = c5631DmF;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator itA00 = C5631DmF.A00(this.A01);
        while (itA00.hasNext()) {
            InterfaceC5756Dor interfaceC5756Dor = (InterfaceC5756Dor) itA00.next();
            C5723DoI c5723DoI = this.A03;
            C5723DoI c5723DoI2 = this.A04;
            long j = this.A00;
            String str = this.A06;
            List list = this.A07;
            interfaceC5756Dor.AWc(this.A02, c5723DoI, c5723DoI2, str, this.A05, list, j);
        }
    }
}
