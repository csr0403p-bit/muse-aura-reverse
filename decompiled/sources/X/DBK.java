package X;

import android.app.Activity;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class DBK implements Runnable {
    public static final String __redex_internal_original_name = "StartupMetricAsyncRecorder$onLifecycleEvent$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ Activity A03;
    public final /* synthetic */ DBJ<ColdInfo> A04;

    /* JADX WARN: Incorrect types in method signature: (ILX/DBJ<TColdInfo;>;ILandroid/app/Activity;J)V */
    public DBK(Activity activity, DBJ dbj, int i, int i2, long j) {
        this.A00 = i;
        this.A04 = dbj;
        this.A01 = i2;
        this.A03 = activity;
        this.A02 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        String str;
        switch (this.A00) {
            case 1:
                DBJ<ColdInfo> dbj = this.A04;
                i = dbj.activityOnCreatePointIndex;
                dbj.activityOnCreatePointIndex = i + 1;
                dbj.activitiesCreated++;
                str = DBJ.ACTIVITY_ON_CREATE_POINT;
                break;
            case 2:
                DBJ<ColdInfo> dbj2 = this.A04;
                i = dbj2.activityOnDestroyPointIndex;
                dbj2.activityOnDestroyPointIndex = i + 1;
                str = DBJ.ACTIVITY_ON_DESTROY_POINT;
                break;
            case 3:
                DBJ<ColdInfo> dbj3 = this.A04;
                i = dbj3.activityOnStartPointIndex;
                dbj3.activityOnStartPointIndex = i + 1;
                str = DBJ.ACTIVITY_ON_START_POINT;
                break;
            case 4:
                DBJ<ColdInfo> dbj4 = this.A04;
                i = dbj4.activityOnStopPointIndex;
                dbj4.activityOnStopPointIndex = i + 1;
                str = DBJ.ACTIVITY_ON_STOP_POINT;
                break;
            case 5:
                DBJ<ColdInfo> dbj5 = this.A04;
                i = dbj5.activityOnResumePointIndex;
                dbj5.activityOnResumePointIndex = i + 1;
                str = DBJ.ACTIVITY_ON_RESUME_POINT;
                break;
            case 6:
                DBJ<ColdInfo> dbj6 = this.A04;
                i = dbj6.activityOnPausePointIndex;
                dbj6.activityOnPausePointIndex = i + 1;
                str = DBJ.ACTIVITY_ON_PAUSE_POINT;
                break;
            case 7:
                DBJ<ColdInfo> dbj7 = this.A04;
                i = dbj7.activityOnFinishPointIndex;
                dbj7.activityOnFinishPointIndex = i + 1;
                str = DBJ.ACTIVITY_ON_FINISH_POINT;
                break;
            case 8:
                DBJ<ColdInfo> dbj8 = this.A04;
                i = dbj8.activityOnBackPressedPointIndex;
                dbj8.activityOnBackPressedPointIndex = i + 1;
                str = DBJ.ACTIVITY_ON_BACK_PRESSED_POINT;
                break;
            default:
                throw BV4.A0P();
        }
        if (i < 5) {
            C60O.A0g().markerPoint(this.A01, AnonymousClass006.A0y(i == 0 ? "" : Integer.valueOf(i), str, C60O.A0w()), C60Q.A0e(this.A03), this.A02, TimeUnit.MILLISECONDS);
        }
    }
}
