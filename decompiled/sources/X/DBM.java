package X;

import android.app.Activity;
import com.facebook.aura.qpl.AuraQuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class DBM implements Runnable {
    public static final String __redex_internal_original_name = "StartupMetricAsyncRecorder$onEndStart$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ Activity A04;
    public final /* synthetic */ DKP A05;
    public final /* synthetic */ DKP A06;
    public final /* synthetic */ DBJ<ColdInfo> A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ CopyOnWriteArrayList<DBJ<ColdInfo>.NavEventRecord> A0A;
    public final /* synthetic */ CopyOnWriteArrayList<DBJ<ColdInfo>.ActivityRecord> A0B;
    public final /* synthetic */ short A0C;
    public final /* synthetic */ boolean A0D;
    public final /* synthetic */ boolean A0E;
    public final /* synthetic */ boolean A0F;

    /* JADX WARN: Incorrect types in method signature: (LX/DBJ<TColdInfo;>;ILX/DKP;LX/DKP;SJLjava/lang/String;ZLjava/util/concurrent/CopyOnWriteArrayList<LX/DBJ<TColdInfo;>.ActivityRecord;>;Ljava/util/concurrent/CopyOnWriteArrayList<LX/DBJ<TColdInfo;>.NavEventRecord;>;ZZLjava/lang/String;IILandroid/app/Activity;)V */
    public DBM(Activity activity, DKP dkp, DKP dkp2, DBJ dbj, String str, String str2, CopyOnWriteArrayList copyOnWriteArrayList, CopyOnWriteArrayList copyOnWriteArrayList2, int i, int i2, int i3, long j, short s, boolean z, boolean z2, boolean z3) {
        this.A07 = dbj;
        this.A00 = i;
        this.A05 = dkp;
        this.A06 = dkp2;
        this.A0C = s;
        this.A03 = j;
        this.A09 = str;
        this.A0E = z;
        this.A0B = copyOnWriteArrayList;
        this.A0A = copyOnWriteArrayList2;
        this.A0F = z2;
        this.A0D = z3;
        this.A08 = str2;
        this.A02 = i2;
        this.A01 = i3;
        this.A04 = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DBJ<ColdInfo> dbj = this.A07;
        AuraQuickPerformanceLogger auraQuickPerformanceLogger = AuraQuickPerformanceLogger.INSTANCE;
        QuickPerformanceLogger auraQuickPerformanceLogger2 = auraQuickPerformanceLogger.getInstance();
        int i = this.A00;
        if (auraQuickPerformanceLogger2.isMarkerOn(i)) {
            QuickPerformanceLogger auraQuickPerformanceLogger3 = auraQuickPerformanceLogger.getInstance();
            String str = this.A09;
            boolean z = this.A0E;
            CopyOnWriteArrayList<DBJ<ColdInfo>.ActivityRecord> copyOnWriteArrayList = this.A0B;
            CopyOnWriteArrayList<DBJ<ColdInfo>.NavEventRecord> copyOnWriteArrayList2 = this.A0A;
            boolean z2 = this.A0F;
            boolean z3 = this.A0D;
            String str2 = this.A08;
            short s = this.A0C;
            DBQ.A00(auraQuickPerformanceLogger3, new DBL(this.A04, dbj, str, str2, copyOnWriteArrayList, copyOnWriteArrayList2, i, this.A02, this.A01, s, z, z2, z3), i);
            DKP dkp = this.A05;
            if (dkp != null) {
                dkp.A00(auraQuickPerformanceLogger.getInstance());
            }
            DKP dkp2 = this.A06;
            if (dkp2 != null) {
                dkp2.A00(auraQuickPerformanceLogger.getInstance());
            }
        }
        auraQuickPerformanceLogger.getInstance().markerEnd(i, this.A0C, this.A03, TimeUnit.MILLISECONDS);
    }
}
