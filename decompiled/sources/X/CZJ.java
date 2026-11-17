package X;

import java.util.List;

/* loaded from: classes5.dex */
public final class CZJ implements Runnable {
    public static final String __redex_internal_original_name = "AttributionLogger$reportEvents$1";
    public final /* synthetic */ List<CZ9> A00;
    public final /* synthetic */ CZF A01;

    /* JADX WARN: Incorrect types in method signature: (LX/CZF;Ljava/util/List<+LX/CZ9;>;)V */
    public CZJ(List list, CZF czf) {
        this.A01 = czf;
        this.A00 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CZF czf = this.A01;
        List<CZ9> list = this.A00;
        CZI czi = czf.A04;
        if (czi != null) {
            CZI.A01(CZI.A00("report_events_compliant", null, null, list), "info", czi);
        }
        czf.A00.getEventComplianceAction(new CZP(list, czf));
    }
}
