package X;

import android.content.res.ColorStateList;
import android.os.Build;
import android.util.Log;
import android.widget.RemoteViews;

/* renamed from: X.75Q, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C75Q {
    public static final void A00(RemoteViews remoteViews, C059072n c059072n, C75P c75p) {
        C75T c75tA01 = C75c.A01(remoteViews, c059072n.A00, C75e.A06, c75p);
        int i = c75tA01.A01;
        remoteViews.setProgressBar(i, 0, 0, true);
        if (Build.VERSION.SDK_INT >= 31) {
            C76X c76x = c059072n.A01;
            if (c76x instanceof C059272p) {
                C75Y.A04(ColorStateList.valueOf(HxS.A01(((C059272p) c76x).A00)), remoteViews, i);
            } else if (c76x instanceof C063875u) {
                C75Y.A01(i, remoteViews, ((C063875u) c76x).A00);
            } else if (c76x instanceof C059372q) {
                C059372q c059372q = (C059372q) c76x;
                C75Y.A03(ColorStateList.valueOf(HxS.A01(c059372q.A00)), ColorStateList.valueOf(HxS.A01(c059372q.A01)), remoteViews, i);
            } else {
                Log.w("GlanceAppWidget", AnonymousClass007.A0a("Unexpected progress indicator color: ", c76x));
            }
        }
        C75L.A01(remoteViews, c059072n.A00, c75tA01, c75p);
    }
}
