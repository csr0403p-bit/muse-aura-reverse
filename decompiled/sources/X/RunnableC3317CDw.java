package X;

import java.util.List;

/* renamed from: X.CDw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC3317CDw implements Runnable {
    public static final String __redex_internal_original_name = "GooglePlayDownloader$refreshAppModuleCacheManagerFromSessionStates$1$1";
    public final /* synthetic */ C3313CDn A00;

    public RunnableC3317CDw(C3313CDn c3313CDn) {
        this.A00 = c3313CDn;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3313CDn c3313CDn = this.A00;
        CSA<List<CJN>> csaAKW = c3313CDn.A0A.AKW();
        C7384Etj.A0U(csaAKW);
        csaAKW.A09(new F4W(c3313CDn, 2), c3313CDn.A0D);
    }
}
