package X;

import android.graphics.Typeface;

/* loaded from: classes5.dex */
public abstract class CM9 {
    public abstract void A01(int i);

    public abstract void A02(Typeface typeface);

    public final void A00(final int i) {
        C60O.A02().post(new Runnable() { // from class: X.CME
            public static final String __redex_internal_original_name = "ResourcesCompat$FontCallback$$ExternalSyntheticLambda1";

            @Override // java.lang.Runnable
            public final void run() {
                this.A01.A01(i);
            }
        });
    }
}
