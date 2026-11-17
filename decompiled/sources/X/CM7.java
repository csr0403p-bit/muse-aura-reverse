package X;

import android.graphics.Typeface;

/* loaded from: classes5.dex */
public final class CM7 implements Runnable {
    public static final String __redex_internal_original_name = "CallbackWrapper$1";
    public final /* synthetic */ Typeface A00;
    public final /* synthetic */ CMK A01;
    public final /* synthetic */ CM6 A02;

    public CM7(Typeface typeface, CMK cmk, CM6 cm6) {
        this.A02 = cm6;
        this.A01 = cmk;
        this.A00 = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CMK cmk = this.A01;
        Typeface typeface = this.A00;
        CM9 cm9 = cmk.A00;
        if (cm9 != null) {
            cm9.A02(typeface);
        }
    }
}
