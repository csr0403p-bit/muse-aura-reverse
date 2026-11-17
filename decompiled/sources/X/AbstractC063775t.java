package X;

import android.content.res.ColorStateList;
import android.widget.RemoteViews;

/* renamed from: X.75t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC063775t {
    public static final void A00(ColorStateList colorStateList, ColorStateList colorStateList2, RemoteViews remoteViews, int i) {
        remoteViews.setColorStateList(i, "setIndeterminateTintList", colorStateList, colorStateList2);
    }

    public static final void A01(ColorStateList colorStateList, RemoteViews remoteViews, int i) {
        remoteViews.setColorStateList(i, "setIndeterminateTintList", colorStateList);
    }

    public static final void A02(RemoteViews remoteViews, String str, int i, int i2) {
        remoteViews.setColor(i, str, i2);
    }

    public static final void A03(RemoteViews remoteViews, String str, int i, int i2) {
        remoteViews.setColorStateList(i, str, i2);
    }

    public static final void A04(RemoteViews remoteViews, String str, int i, int i2, int i3) {
        remoteViews.setColorInt(i, str, i2, i3);
    }
}
