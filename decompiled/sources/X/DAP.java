package X;

import com.facebook.aura.qpl.AuraQuickPerformanceLogger;
import com.facebook.aura.qpl.startup.HatchStartupQpl;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class DAP implements Runnable {
    public static final String __redex_internal_original_name = "StartupMetricAsyncRecorder$onTrackColdStart$1";
    public final /* synthetic */ long A00;
    public final /* synthetic */ DBJ<ColdInfo> A01;
    public final /* synthetic */ ColdInfo A02;
    public final /* synthetic */ F1E A03;
    public final /* synthetic */ boolean A04;

    /* JADX WARN: Incorrect types in method signature: (LX/DBJ<TColdInfo;>;ZLX/F1E;JTColdInfo;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public DAP(DBJ dbj, Object obj, F1E f1e, long j, boolean z) {
        this.A01 = dbj;
        this.A04 = z;
        this.A03 = f1e;
        this.A00 = j;
        this.A02 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DBJ<ColdInfo> dbj = this.A01;
        dbj.onTrackStartCommon();
        if (!this.A04) {
            F1E f1e = this.A03;
            HatchStartupQpl.Companion.markerStart(this.A00);
            f1e.element = 734857510;
        }
        F1E f1e2 = this.A03;
        dbj.coldStartMarkerId = f1e2.element;
        long j = this.A00;
        if (j != CCR.A01()) {
            AuraQuickPerformanceLogger auraQuickPerformanceLogger = AuraQuickPerformanceLogger.INSTANCE;
            auraQuickPerformanceLogger.getInstance().markerAnnotate(f1e2.element, DBJ.PROCESS_START_REQUESTED_TIME, CCR.A01());
            auraQuickPerformanceLogger.getInstance().markerAnnotate(f1e2.element, DBJ.PROCESS_START_TIME, CCR.A00());
            auraQuickPerformanceLogger.getInstance().markerAnnotate(f1e2.element, DBJ.PROCESS_REQUESTED_TO_START_TIME, CCR.A01() - CCR.A00());
        } else if (j != CCR.A00()) {
            C60O.A0g().markerPoint(f1e2.element, DBJ.PROCESS_START_TIME, CCR.A00(), TimeUnit.MILLISECONDS);
        }
        QuickPerformanceLogger quickPerformanceLoggerA0g = C60O.A0g();
        int i = f1e2.element;
        long j2 = CCR.A01;
        if (j2 <= 0) {
            j2 = CCR.A02;
        }
        quickPerformanceLoggerA0g.markerPoint(i, DBJ.FIRST_LINE_OF_CODE_POINT, j2, TimeUnit.MILLISECONDS);
    }
}
