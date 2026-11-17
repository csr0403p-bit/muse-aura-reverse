package X;

import android.app.Activity;

/* loaded from: classes5.dex */
public final class DBN implements Runnable {
    public static final String __redex_internal_original_name = "StartupMetricAsyncRecorder$onTrackWarmStart$1";
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ Activity A02;
    public final /* synthetic */ DBJ<ColdInfo> A03;
    public final /* synthetic */ boolean A04;

    /* JADX WARN: Incorrect types in method signature: (LX/DBJ<TColdInfo;>;JJZLandroid/app/Activity;)V */
    public DBN(Activity activity, DBJ dbj, long j, long j2, boolean z) {
        this.A03 = dbj;
        this.A00 = j;
        this.A01 = j2;
        this.A04 = z;
        this.A02 = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DBJ<ColdInfo> dbj = this.A03;
        dbj.onTrackStartCommon();
        int iStartWarmStart = dbj.startWarmStart(this.A00);
        DBQ.A00(C60O.A0g(), new DBO(this.A02, dbj, this.A01, this.A04), iStartWarmStart);
    }
}
