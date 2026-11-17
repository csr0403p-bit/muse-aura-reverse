package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class GD0 implements GD7<GD4> {
    public static final ConcurrentHashMap<GD8, GD0> A09 = C60O.A1C();
    public GD4 A00;
    public final String A01;
    public final GD3 A02;
    public final GD3 A03;
    public final GD2 A04;
    public final GD9 A05;
    public final GD4 A06;
    public final String A07;
    public final ReentrantReadWriteLock A08;

    /* JADX WARN: Removed duplicated region for block: B:48:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0165 A[PHI: r4
  0x0165: PHI (r4v3 long) = (r4v2 long), (r4v6 long) binds: [B:55:0x012f, B:62:0x0161] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A00(int r37, java.lang.String r38, java.lang.Throwable r39) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GD0.A00(int, java.lang.String, java.lang.Throwable):void");
    }

    @Override // X.GD1
    public final void A8B(Function0<String> function0) {
        GD4 gd4 = this.A00;
        if (!gd4.isActive() || 3 < gd4.getMinLogLevel()) {
            return;
        }
        A00(3, function0.invoke(), null);
    }

    @Override // X.GD1
    public final void A9n(Throwable th, Function0<String> function0) {
        GD4 gd4 = this.A00;
        if (!gd4.isActive() || 6 < gd4.getMinLogLevel()) {
            return;
        }
        A00(6, function0.invoke(), th);
    }

    @Override // X.GD1
    public final void A9o(Function0<String> function0) {
        GD4 gd4 = this.A00;
        if (!gd4.isActive() || 6 < gd4.getMinLogLevel()) {
            return;
        }
        A00(6, function0.invoke(), null);
    }

    @Override // X.GD1
    public final void ANP(Function0<String> function0) {
        GD4 gd4 = this.A00;
        if (!gd4.isActive() || 4 < gd4.getMinLogLevel()) {
            return;
        }
        A00(4, function0.invoke(), null);
    }

    public GD0(GD9 gd9, GD4 gd4, GD4 gd42, String str) {
        this.A01 = str;
        this.A06 = gd4;
        this.A05 = gd9;
        this.A00 = gd42;
        boolean zIsMarkerOn = false;
        QuickPerformanceLogger qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
        if (qPLInstance != null) {
            int iHashCode = FGI.A0M("probe_", str).hashCode();
            qPLInstance.markerStartWithSamplingBasis(722350912, iHashCode, str);
            zIsMarkerOn = qPLInstance.isMarkerOn(722350912, iHashCode);
            qPLInstance.markerDrop(722350912, iHashCode);
        }
        GD3 gd3 = new GD3(gd9, this.A00.getBufferSize(), zIsMarkerOn);
        this.A02 = gd3;
        this.A03 = gd3;
        GD2 gd2 = gd3.A02;
        this.A04 = gd2 != null ? gd2 : null;
        this.A08 = new ReentrantReadWriteLock();
        this.A07 = FGI.A0M("PLog-", this.A01);
    }
}
