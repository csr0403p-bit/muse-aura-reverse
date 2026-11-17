package X;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes6.dex */
public final class FY7 extends CM9 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C8163FXf A02;
    public final /* synthetic */ WeakReference A03;

    public FY7(C8163FXf c8163FXf, WeakReference weakReference, int i, int i2) {
        this.A02 = c8163FXf;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = weakReference;
    }

    @Override // X.CM9
    public final void A01(int i) {
    }

    @Override // X.CM9
    public final void A02(Typeface typeface) {
        int i = this.A00;
        if (i != -1) {
            typeface = Typeface.create(typeface, i, AnonymousClass002.A1L(this.A01 & 2));
        }
        C8163FXf c8163FXf = this.A02;
        WeakReference weakReference = this.A03;
        if (c8163FXf.A0B) {
            c8163FXf.A02 = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                boolean zIsAttachedToWindow = textView.isAttachedToWindow();
                int i2 = c8163FXf.A01;
                if (zIsAttachedToWindow) {
                    textView.post(new RunnableC8186FYd(typeface, textView, c8163FXf, i2));
                    return;
                }
                String fontVariationSettings = textView.getFontVariationSettings();
                if (!TextUtils.isEmpty(fontVariationSettings)) {
                    AbstractC8086FSr.A00(textView, null);
                }
                textView.setTypeface(typeface, i2);
                if (TextUtils.isEmpty(fontVariationSettings)) {
                    return;
                }
                AbstractC8086FSr.A00(textView, fontVariationSettings);
            }
        }
    }
}
