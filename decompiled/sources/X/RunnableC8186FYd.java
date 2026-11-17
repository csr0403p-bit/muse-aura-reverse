package X;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.TextView;

/* renamed from: X.FYd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC8186FYd implements Runnable {
    public static final String __redex_internal_original_name = "AppCompatTextHelper$2";
    public final /* synthetic */ int A00;
    public final /* synthetic */ Typeface A01;
    public final /* synthetic */ TextView A02;
    public final /* synthetic */ C8163FXf A03;

    public RunnableC8186FYd(Typeface typeface, TextView textView, C8163FXf c8163FXf, int i) {
        this.A03 = c8163FXf;
        this.A02 = textView;
        this.A01 = typeface;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextView textView = this.A02;
        Typeface typeface = this.A01;
        int i = this.A00;
        String fontVariationSettings = textView.getFontVariationSettings();
        if (!TextUtils.isEmpty(fontVariationSettings)) {
            AbstractC8086FSr.A00(textView, null);
        }
        textView.setTypeface(typeface, i);
        if (TextUtils.isEmpty(fontVariationSettings)) {
            return;
        }
        AbstractC8086FSr.A00(textView, fontVariationSettings);
    }
}
