package X;

import android.app.Application;
import com.facebook.acra.anr.IANRDetector;
import com.facebook.acra.anr.processmonitor.detector.ProcessErrorMonitorANRDetector;

/* loaded from: classes5.dex */
public final class C64 implements InterfaceC3235C4s {
    public static IANRDetector A09;
    public static C3272C6z A0A;
    public static volatile boolean A0B;
    public int A00 = 0;
    public boolean A01;
    public boolean A02;
    public final C6D A03;
    public final InterfaceC3236C4t A04;
    public final C3232C4p A05;
    public final C58 A06;
    public final C54 A07;
    public final String A08;

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (r14v0 X.C64) */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void A00(X.C64 r14, X.C6N r15) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64.A00(X.C64, X.C6N):void");
    }

    @Override // X.InterfaceC3235C4s
    public final /* synthetic */ C3238C4v AH4() {
        return null;
    }

    @Override // X.InterfaceC3235C4s
    public final C5l AHs() {
        return C5l.A01;
    }

    @Override // X.InterfaceC3235C4s
    public final void start() {
        C6w.A00("AnrDetector");
        C3272C6z c3272C6z = new C3272C6z(this);
        A0A = c3272C6z;
        C58 c58 = this.A06;
        String str = this.A08;
        C6D c6d = this.A03;
        Application application = c58.A01;
        ProcessErrorMonitorANRDetector processErrorMonitorANRDetector = ProcessErrorMonitorANRDetector.getInstance(new C8f(application, C60O.A02(), c3272C6z, c6d, str, application.getDir("traces", 0).getPath()), c58.A00);
        processErrorMonitorANRDetector.setANRReportProvider(new C3247C5e(c58));
        A09 = processErrorMonitorANRDetector;
        this.A02 = true;
        CFK.A0H(C9Y.TAG, "Start AnrDetector... %s", C60Q.A0e(processErrorMonitorANRDetector));
        A09.start();
        C67.A02(new C3261C6e(this));
    }

    public C64(InterfaceC3236C4t interfaceC3236C4t, C3232C4p c3232C4p, C58 c58, C54 c54, String str, F18 f18, F18 f182, F18 f183) {
        this.A07 = c54;
        this.A05 = c3232C4p;
        this.A06 = c58;
        this.A08 = str;
        this.A04 = interfaceC3236C4t;
        this.A03 = new C6D(c54, f18, f182, f183);
    }

    @Override // X.InterfaceC3235C4s
    public final /* synthetic */ int AGC() {
        return 100000;
    }
}
