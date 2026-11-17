package X;

import android.content.Context;
import java.util.Set;

/* renamed from: X.CDh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3308CDh implements CDU {
    public final /* synthetic */ C3302CDa A00;
    public final /* synthetic */ CDH A01;

    @Override // X.CDU
    public final void ATy(String str) {
        boolean zA06;
        Object[] array;
        C7384Etj.A0Y(str, 0);
        CDH cdh = this.A01;
        C3302CDa c3302CDa = this.A00;
        Context context = c3302CDa.A00;
        CDI cdi = cdh.A00;
        synchronized (cdi) {
            cdi.A05(context);
            zA06 = cdi.A06(str);
        }
        if (zA06) {
            CFK.A0I("AppModuleManager", "Loaded disabled module: %s", str);
            return;
        }
        Set<HgZ> set = c3302CDa.A01;
        synchronized (set) {
            array = set.toArray(new HgZ[0]);
        }
        if (0 < ((HgZ[]) array).length) {
            throw BV4.A0a("notifyModuleLoaded");
        }
    }

    public C3308CDh(C3302CDa c3302CDa, CDH cdh) {
        this.A01 = cdh;
        this.A00 = c3302CDa;
    }
}
