package X;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.widget.TextView;

/* renamed from: X.FSr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8086FSr {
    public static Paint A00;
    public static final C7523EzA<C10484Hld, Typeface> A01 = new C7523EzA<>(30);

    public static void A00(TextView textView, String str) {
        if (C6xC.A00(textView.getFontVariationSettings(), str)) {
            textView.setFontVariationSettings("");
        }
        textView.setFontVariationSettings(str);
    }
}
