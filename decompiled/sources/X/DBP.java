package X;

import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class DBP implements Runnable {
    public static final String __redex_internal_original_name = "StartupMetricAsyncRecorder$onIntentLaunched$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ DBJ<ColdInfo> A02;
    public final /* synthetic */ String A03;

    /* JADX WARN: Incorrect types in method signature: (LX/DBJ<TColdInfo;>;ILjava/lang/String;J)V */
    public DBP(DBJ dbj, String str, int i, long j) {
        this.A02 = dbj;
        this.A00 = i;
        this.A03 = str;
        this.A01 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C60O.A0g().markerPoint(this.A00, DBJ.ON_INTENT_LAUNCHED_POINT, this.A03, this.A01, TimeUnit.MILLISECONDS);
    }
}
