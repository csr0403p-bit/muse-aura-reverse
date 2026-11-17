package X;

import android.content.Context;
import android.os.Looper;

/* loaded from: classes5.dex */
public final class DXS {
    public final C6464E7e A00;

    public DXS(Context context, Looper looper, Looper looper2, final Runnable runnable) {
        this.A00 = new C6464E7e(context, looper, looper2, E7C.A00, new E80() { // from class: X.DXT
            @Override // X.E80
            public final void ARk() {
                runnable.run();
            }
        });
    }
}
