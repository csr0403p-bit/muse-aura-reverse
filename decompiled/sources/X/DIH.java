package X;

import com.facebook.quicklog.QuickEventImpl;

/* loaded from: classes5.dex */
public final class DIH implements Runnable {
    public static final String __redex_internal_original_name = "QuickEventListenersList$notifyLater$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ COt A04;
    public final /* synthetic */ C4956DHw A05;
    public final /* synthetic */ ADq A06;
    public final /* synthetic */ ADq A07;

    public DIH(COt cOt, C4956DHw c4956DHw, ADq aDq, ADq aDq2, int i, int i2, int i3, long j) {
        this.A04 = cOt;
        this.A05 = c4956DHw;
        this.A03 = j;
        this.A01 = i;
        this.A00 = i2;
        this.A06 = aDq;
        this.A07 = aDq2;
        this.A02 = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        COt cOt = this.A04;
        C4956DHw c4956DHw = this.A05;
        long j = this.A03;
        DII dii = new DII(cOt, c4956DHw, this.A06, this.A07, this.A01, this.A00, j);
        DHr dHr = ((QuickEventImpl) cOt).A0S;
        dHr.A01();
        try {
            dii.run();
        } finally {
            dHr.A02();
        }
    }
}
