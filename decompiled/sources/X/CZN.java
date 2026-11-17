package X;

import java.util.List;

/* loaded from: classes5.dex */
public final class CZN implements CZQ {
    public final /* synthetic */ List<CZ9> A00;
    public final /* synthetic */ CZF A01;

    @Override // X.CZQ
    public final void ATI(String str, Throwable th) {
        C7384Etj.A0Y(str, 0);
        CZI czi = this.A01.A04;
        if (czi != null) {
            CZI.A01(CZI.A00("report_events_failure", str, th, this.A00), "error", czi);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/CZF;Ljava/util/List<+LX/CZ9;>;)V */
    public CZN(List list, CZF czf) {
        this.A01 = czf;
        this.A00 = list;
    }
}
