package X;

import android.widget.RemoteViews;

/* renamed from: X.75Z, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C75Z {
    public static final void A00(RemoteViews remoteViews, C75P c75p, C76X c76x, int i) {
        if (c76x instanceof C059372q) {
            C059372q c059372q = (C059372q) c76x;
            AbstractC063775t.A04(remoteViews, "setColorFilter", i, HxS.A01(c059372q.A00), HxS.A01(c059372q.A01));
            return;
        }
        if (c76x instanceof C063875u) {
            AbstractC063775t.A02(remoteViews, "setColorFilter", i, ((C063875u) c76x).A00);
        } else {
            remoteViews.setInt(i, "setColorFilter", HxS.A01(c76x.ADo(c75p.A06)));
        }
    }
}
