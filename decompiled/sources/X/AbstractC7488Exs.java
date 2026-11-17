package X;

import android.app.AlarmManager;
import android.content.Context;
import android.os.Build;

/* renamed from: X.Exs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7488Exs {
    public static final boolean A00(AlarmManager alarmManager, Context context) {
        C7384Etj.A0Y(alarmManager, 1);
        boolean zA1V = C8j4.A1V(context.getApplicationInfo().targetSdkVersion, 30);
        boolean zA1V2 = C8j4.A1V(Build.VERSION.SDK_INT, 30);
        if (!zA1V || !zA1V2) {
            return true;
        }
        try {
            return alarmManager.canScheduleExactAlarms();
        } catch (RuntimeException e) {
            CFK.A0J("AndroidCompat", e, "failed to check canScheduleExactAlarms. Reverting to false");
            return false;
        }
    }
}
