package X;

import android.os.Build;
import android.util.TypedValue;
import android.widget.TextView;

/* loaded from: classes6.dex */
public abstract class FMI {
    public static void A00(TextView textView, float f, int i) {
        if (Build.VERSION.SDK_INT >= 34) {
            FMJ.A00(textView, f, i);
        } else {
            A01(textView, Math.round(TypedValue.applyDimension(i, f, AbstractC7609F5w.A0S(textView))));
        }
    }

    public static void A01(TextView textView, int i) {
        if (i < 0) {
            throw BV4.A0P();
        }
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }
}
