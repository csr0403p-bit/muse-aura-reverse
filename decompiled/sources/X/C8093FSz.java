package X;

import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: X.FSz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8093FSz {
    public final WeakReference<View> A00;

    public static View A00(C8093FSz c8093FSz) {
        return c8093FSz.A00.get();
    }

    public C8093FSz(View view) {
        this.A00 = BV4.A0q(view);
    }

    public final void A01() {
        View viewA00 = A00(this);
        if (viewA00 != null) {
            viewA00.animate().cancel();
        }
    }

    public final void A02(float f) {
        View viewA00 = A00(this);
        if (viewA00 != null) {
            viewA00.animate().alpha(f);
        }
    }

    public final void A03(long j) {
        View viewA00 = A00(this);
        if (viewA00 != null) {
            viewA00.animate().setDuration(j);
        }
    }

    public final void A04(FT0 ft0) {
        View viewA00 = A00(this);
        if (viewA00 != null) {
            viewA00.animate().setListener(ft0 != null ? new I07(viewA00, this, ft0, 0) : null);
        }
    }
}
