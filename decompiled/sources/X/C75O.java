package X;

import android.os.Build;
import android.text.SpannableString;
import android.util.Log;
import android.widget.RemoteViews;
import com.facebook.aura.localbrowser.LocalBrowserCapacityKt;
import java.util.Iterator;

/* renamed from: X.75O, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C75O {
    public static final void A00(RemoteViews remoteViews, C75P c75p, C058972i c058972i) {
        long jADo;
        C75T c75tA01 = C75c.A01(remoteViews, c058972i.A00, C75e.A0O, c75p);
        int i = c75tA01.A01;
        CharSequence charSequence = c058972i.A02;
        BHU bhu = c058972i.A01;
        int i2 = ((C72j) c058972i).A00;
        if (i2 != Integer.MAX_VALUE) {
            remoteViews.setInt(i, "setMaxLines", i2);
        }
        if (bhu == null) {
            remoteViews.setTextViewText(i, charSequence);
        } else {
            SpannableString spannableString = new SpannableString(charSequence);
            int length = spannableString.length();
            C1809ArT c1809ArT = bhu.A00;
            if (c1809ArT != null) {
                long j = c1809ArT.A00;
                if ((j & 1095216660480L) != LocalBrowserCapacityKt.BACKGROUND_WAKE_MIN_RAM_BYTES) {
                    throw C60O.A0i("Only Sp is currently supported for font sizes");
                }
                remoteViews.setTextViewTextSize(i, 2, C1809ArT.A00(j));
            }
            Iterator it = C3cG.A0h().iterator();
            while (it.hasNext()) {
                spannableString.setSpan(it.next(), 0, length, 17);
            }
            remoteViews.setTextViewText(i, spannableString);
            C76X c76x = bhu.A01;
            if (c76x instanceof C059272p) {
                jADo = ((C059272p) c76x).A00;
            } else if (c76x instanceof C063875u) {
                C063875u c063875u = (C063875u) c76x;
                if (Build.VERSION.SDK_INT >= 31) {
                    C75Y.A02(i, remoteViews, c063875u.A00);
                } else {
                    jADo = c063875u.ADo(c75p.A06);
                }
            } else if (c76x instanceof C059372q) {
                C059372q c059372q = (C059372q) c76x;
                if (Build.VERSION.SDK_INT >= 31) {
                    C75Y.A05(remoteViews, i, HxS.A01(c059372q.A00), HxS.A01(c059372q.A01));
                } else {
                    jADo = c059372q.ADo(c75p.A06);
                }
            } else {
                Log.w("GlanceAppWidget", AnonymousClass007.A0a("Unexpected text color: ", c76x));
            }
            remoteViews.setTextColor(i, HxS.A01(jADo));
        }
        C75L.A01(remoteViews, c058972i.A00, c75tA01, c75p);
    }
}
