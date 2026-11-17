package X;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.Service;
import android.util.Log;
import androidx.work.impl.foreground.SystemForegroundService;

/* loaded from: classes5.dex */
public abstract class EKy {
    public static void A00(Notification service, Service id, int notification, int foregroundServiceType) {
        try {
            id.startForeground(notification, service, foregroundServiceType);
        } catch (ForegroundServiceStartNotAllowedException | SecurityException e) {
            EK9.A00();
            Log.w(SystemForegroundService.A04, "Unable to start foreground service", e);
        }
    }
}
