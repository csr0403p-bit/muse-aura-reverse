package X;

import android.graphics.Typeface;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class CM6 {
    public final CMK A00;
    public final Executor A01;

    public final void A00(CMB cmb) {
        Executor executor;
        Runnable cm8;
        int i = cmb.A00;
        if (i == 0) {
            Typeface typeface = cmb.A01;
            CMK cmk = this.A00;
            executor = this.A01;
            cm8 = new CM7(typeface, cmk, this);
        } else {
            CMK cmk2 = this.A00;
            executor = this.A01;
            cm8 = new CM8(cmk2, this, i);
        }
        executor.execute(cm8);
    }

    public CM6(CMK cmk, Executor executor) {
        this.A00 = cmk;
        this.A01 = executor;
    }
}
