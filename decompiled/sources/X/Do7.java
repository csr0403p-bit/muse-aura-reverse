package X;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class Do7 implements Runnable {
    public static final String __redex_internal_original_name = "ListenerDispatcher$17";
    public final /* synthetic */ long A00;
    public final /* synthetic */ C5631DmF A01;
    public final /* synthetic */ C5723DoI A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ boolean A05;

    public Do7(C5631DmF c5631DmF, C5723DoI c5723DoI, String str, List list, long j, boolean z) {
        this.A02 = c5723DoI;
        this.A00 = j;
        this.A03 = str;
        this.A04 = list;
        this.A05 = z;
        this.A01 = c5631DmF;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator itA00 = C5631DmF.A00(this.A01);
        while (itA00.hasNext()) {
            InterfaceC5756Dor interfaceC5756Dor = (InterfaceC5756Dor) itA00.next();
            C5723DoI c5723DoI = this.A02;
            long j = this.A00;
            String str = this.A03;
            List<String> listA0h = this.A04;
            if (listA0h == null) {
                listA0h = C3cG.A0h();
            }
            interfaceC5756Dor.ASc(c5723DoI, j, str, listA0h, this.A05);
        }
    }
}
