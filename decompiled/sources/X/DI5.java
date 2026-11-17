package X;

import com.facebook.quicklog.QuickEventImpl;

/* loaded from: classes5.dex */
public final class DI5 implements Runnable {
    public static final String __redex_internal_original_name = "DirectMarkerEditor$asBatch$1";
    public final /* synthetic */ DHt A00;
    public final /* synthetic */ DBT A01;

    public DI5(DHt dHt, DBT dbt) {
        this.A00 = dHt;
        this.A01 = dbt;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ADq aDq;
        DHt dHt = this.A00;
        dHt.A08 = true;
        try {
            ((DBS) this.A01).A00.invoke(dHt);
            int i = dHt.A04;
            if (i >= 0 || dHt.A03 >= 0) {
                DI1 di1 = dHt.A0A;
                QuickEventImpl quickEventImpl = dHt.A0B;
                int i2 = dHt.A03;
                ADq aDq2 = i2 >= 0 ? new ADq(i2, dHt.A00) : null;
                aDq = i >= 0 ? new ADq(i, dHt.A01) : null;
                C7384Etj.A0Y(quickEventImpl, 0);
                C4956DHw c4956DHw = di1.A03;
                if (c4956DHw != null) {
                    C4956DHw.A00(quickEventImpl, c4956DHw, aDq2, aDq, 8, -1, 0);
                }
                dHt.A04 = -1;
                dHt.A01 = -1;
                dHt.A03 = -1;
                dHt.A00 = -1;
            }
            dHt.A08 = false;
        } catch (Throwable th) {
            int i3 = dHt.A04;
            if (i3 >= 0 || dHt.A03 >= 0) {
                DI1 di12 = dHt.A0A;
                QuickEventImpl quickEventImpl2 = dHt.A0B;
                int i4 = dHt.A03;
                ADq aDq3 = i4 >= 0 ? new ADq(i4, dHt.A00) : null;
                aDq = i3 >= 0 ? new ADq(i3, dHt.A01) : null;
                C7384Etj.A0Y(quickEventImpl2, 0);
                C4956DHw c4956DHw2 = di12.A03;
                if (c4956DHw2 != null) {
                    C4956DHw.A00(quickEventImpl2, c4956DHw2, aDq3, aDq, 8, -1, 0);
                }
                dHt.A04 = -1;
                dHt.A01 = -1;
                dHt.A03 = -1;
                dHt.A00 = -1;
            }
            dHt.A08 = false;
            throw th;
        }
    }
}
