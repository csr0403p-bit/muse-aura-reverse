package X;

import android.app.PendingIntent;
import android.os.Build;

/* renamed from: X.7dh, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7dh {
    public static final C7dh A00 = new C7dh();

    public static final void A00(PendingIntent pendingIntent) throws PendingIntent.CanceledException {
        if (Build.VERSION.SDK_INT >= 34) {
            C7cP.A00(pendingIntent);
        } else {
            pendingIntent.send();
        }
    }
}
