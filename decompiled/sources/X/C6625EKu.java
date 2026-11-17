package X;

import android.net.ConnectivityManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.EKu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6625EKu {
    public final List<ELZ> A00;

    public C6625EKu(ELC elc) {
        C7384Etj.A0Y(elc, 0);
        ArrayList arrayListA0y = AbstractC0885AGm.A0y(new C6636ELg(elc.A02), new C6637ELh(elc.A01), new C6638ELi(elc.A03));
        Object systemService = elc.A00.getSystemService("connectivity");
        C7384Etj.A0Z(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        arrayListA0y.add(new C6623EKs((ConnectivityManager) systemService));
        this.A00 = arrayListA0y;
    }
}
