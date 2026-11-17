package X;

import android.content.res.ColorStateList;
import android.os.Build;
import android.widget.RemoteViews;

/* renamed from: X.75Y, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C75Y {
    public static final void A00(int i, RemoteViews remoteViews) {
        if (Build.VERSION.SDK_INT < 31) {
            throw C60O.A0i(FGI.A0X("setClipToOutline", " is only available on SDK ", " and higher", 31));
        }
        remoteViews.setBoolean(i, "setClipToOutline", true);
    }

    public static final void A01(int i, RemoteViews remoteViews, int i2) {
        AbstractC063775t.A03(remoteViews, "setIndeterminateTintList", i, i2);
    }

    public static final void A02(int i, RemoteViews remoteViews, int i2) {
        AbstractC063775t.A03(remoteViews, "setTextColor", i, i2);
    }

    public static final void A05(RemoteViews remoteViews, int i, int i2, int i3) {
        AbstractC063775t.A04(remoteViews, "setTextColor", i, i2, i3);
    }

    public static final void A06(RemoteViews remoteViews, int i, int i2, int i3) {
        AbstractC063775t.A04(remoteViews, "setBackgroundColor", i, i2, i3);
    }

    public static final void A04(ColorStateList colorStateList, RemoteViews remoteViews, int i) {
        AbstractC063775t.A01(colorStateList, remoteViews, i);
    }

    public static final void A03(ColorStateList colorStateList, ColorStateList colorStateList2, RemoteViews remoteViews, int i) {
        AbstractC063775t.A00(colorStateList, colorStateList2, remoteViews, i);
    }
}
