package X;

import android.app.Application;

/* renamed from: X.DAf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC4876DAf implements Runnable {
    public static final String __redex_internal_original_name = "StartupMetricAsyncRecorder$onBackgroundStartupModeKnown$1";
    public final /* synthetic */ Application A00;
    public final /* synthetic */ DBJ<ColdInfo> A01;

    /* JADX WARN: Incorrect types in method signature: (LX/DBJ<TColdInfo;>;Landroid/app/Application;)V */
    public RunnableC4876DAf(Application application, DBJ dbj) {
        this.A01 = dbj;
        this.A00 = application;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DBJ<ColdInfo> dbj = this.A01;
        DBQ.A00(C60O.A0g(), new EP6(4, this.A00, dbj), dbj.coldStartMarkerId);
    }
}
