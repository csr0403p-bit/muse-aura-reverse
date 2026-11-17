package X;

import android.os.Build;
import android.os.SystemClock;
import com.facebook.acra.constants.ErrorReportingConstants;
import java.io.File;
import java.util.Locale;

/* renamed from: X.C5y, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3256C5y implements InterfaceC3235C4s {
    public final C3267C6q A00;
    public final C3232C4p A01;
    public final C54 A02;
    public final F18<C61> A03;
    public final /* synthetic */ F4T A04;

    public C3256C5y(C3267C6q c3267C6q, C3232C4p c3232C4p, C54 c54, F4T f4t, F18 f18) {
        this.A04 = f4t;
        this.A02 = c54;
        this.A01 = c3232C4p;
        this.A03 = f18;
        this.A00 = c3267C6q;
    }

    @Override // X.InterfaceC3235C4s
    public final /* synthetic */ C3238C4v AH4() {
        return null;
    }

    @Override // X.InterfaceC3235C4s
    public final C5l AHs() {
        return C5l.A0D;
    }

    @Override // X.InterfaceC3235C4s
    public final void start() {
        String str;
        C6I c6iA00;
        C6w.A00("UnexplainedAppDeathDetector");
        C3232C4p.A0C.add("UnexplainedAppDeathDetector");
        C61 c61AMN = this.A03.AMN();
        if (c61AMN.A07) {
            C54 c54 = this.A02;
            File fileA01 = c54.A01(c54.A07);
            long jLastModified = C3cG.A0O(fileA01, "state.txt").lastModified();
            if (System.currentTimeMillis() - (SystemClock.uptimeMillis() - c54.A02) <= 15000 + jLastModified) {
                C3246C5d c3246C5d = C3246C5d.A03;
                if (c3246C5d == null) {
                    throw C3cG.A0Q("Did you call PreviousSessionHelper.init?");
                }
                int iA01 = c3246C5d.A01();
                if (Build.VERSION.SDK_INT >= 30 && iA01 != 0 && (c6iA00 = this.A00.A00(iA01)) != null) {
                    String strA09 = c6iA00.A09();
                    if (c6iA00.A03() == 10 && strA09 != null) {
                        strA09.toLowerCase(Locale.US).contains("remove task");
                    }
                }
            }
            String strA02 = AbstractC3459COf.A02(ErrorReportingConstants.REPORT_SOURCE_OVERRIDE_PROP);
            if ("jest_e2e".equals(strA02)) {
                str = "Ignore ufads on jest test runs.";
            } else {
                if (!"sapienz".equals(strA02) || c61AMN.A02 != 'f') {
                    boolean z = c61AMN.A06;
                    boolean zA03 = c61AMN.A03();
                    if (AbstractC3263C6j.A01(EnumC3254C5u.JAVA, c61AMN.A01) && !BV5.A1R(fileA01, "critical_suppl_java_detect_prop.txt") && !BV5.A1R(fileA01, "critical_java_prop.txt") && !BV5.A1R(fileA01, "critical_java_detect_prop.txt")) {
                        CFK.A06(C9Y.TAG, "Java state with no java report, reporting as fad");
                    } else if (!zA03) {
                        return;
                    }
                    C3228C4l c3228C4lA00 = C3228C4l.A00();
                    C3228C4l.A01(C6B.A1J, c3228C4lA00, 1L);
                    C3228C4l.A01(C6B.A3w, c3228C4lA00, jLastModified / 1000);
                    C3228C4l.A01(C6B.A1m, c3228C4lA00, System.currentTimeMillis() / 1000);
                    c3228C4lA00.A03(C6B.A5v, "unexplained");
                    C3232C4p c3232C4p = this.A01;
                    c3232C4p.A06(c3228C4lA00, EnumC3223C4g.CRITICAL_REPORT, this);
                    if (z) {
                        c3232C4p.A06(c3228C4lA00, EnumC3223C4g.LARGE_REPORT, this);
                        return;
                    }
                    return;
                }
                str = "Ignore f states on sapienz runs.";
            }
            CFK.A06(C9Y.TAG, str);
        }
    }

    @Override // X.InterfaceC3235C4s
    public final /* synthetic */ int AGC() {
        return 100000;
    }
}
