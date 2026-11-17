package X;

import android.app.Activity;

/* loaded from: classes5.dex */
public final class DBI implements Runnable {
    public static final String __redex_internal_original_name = "StartupMetricAsyncRecorder$onTrackHotStart$1";
    public final /* synthetic */ long A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ DBJ<ColdInfo> A02;

    /* JADX WARN: Incorrect types in method signature: (LX/DBJ<TColdInfo;>;JLandroid/app/Activity;)V */
    public DBI(Activity activity, DBJ dbj, long j) {
        this.A02 = dbj;
        this.A00 = j;
        this.A01 = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DBJ<ColdInfo> dbj = this.A02;
        dbj.onTrackStartCommon();
        DBQ.A00(C60O.A0g(), new EP6(5, this.A01, dbj), dbj.startHotStart(this.A00));
    }
}
