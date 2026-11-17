package X;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.util.Log;

/* renamed from: X.7cP, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7cP {
    public static final void A00(PendingIntent pendingIntent) throws PendingIntent.CanceledException {
        try {
            pendingIntent.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
        } catch (PendingIntent.CanceledException e) {
            Log.e("TextClassification", AnonymousClass006.A0y(e, " error: ", C3cG.A0f(pendingIntent, "error sending pendingIntent: ")));
        }
    }
}
