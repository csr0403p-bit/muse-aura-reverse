package X;

import android.app.Notification;
import android.graphics.drawable.Icon;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class EGC {
    public static void A04(Notification.ProgressStyle progressStyle, List<EGM> list) {
        for (EGM egm : list) {
            progressStyle.addProgressPoint(new Notification.ProgressStyle.Point(egm.A02).setColor(egm.A00).setId(egm.A01));
        }
    }

    public static void A05(Notification.ProgressStyle progressStyle, List<EGL> list) {
        for (EGL egl : list) {
            progressStyle.addProgressSegment(new Notification.ProgressStyle.Segment(egl.A02).setColor(egl.A00).setId(egl.A01));
        }
    }

    public static void A00(Notification.ProgressStyle progressStyle, int i) {
        progressStyle.setProgress(i);
    }

    public static void A01(Notification.ProgressStyle progressStyle, Icon icon) {
        progressStyle.setProgressEndIcon(icon);
    }

    public static void A02(Notification.ProgressStyle progressStyle, Icon icon) {
        progressStyle.setProgressStartIcon(icon);
    }

    public static void A03(Notification.ProgressStyle progressStyle, Icon icon) {
        progressStyle.setProgressTrackerIcon(icon);
    }

    public static void A06(Notification.ProgressStyle progressStyle, boolean z) {
        progressStyle.setProgressIndeterminate(z);
    }

    public static void A07(Notification.ProgressStyle progressStyle, boolean z) {
        progressStyle.setStyledByProgress(z);
    }
}
