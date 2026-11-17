package X;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
public final class FQ6 {
    public static final WeakHashMap<View, FQ6> A01 = new WeakHashMap<>();
    public final WeakReference<View> A00;

    public final boolean equals(Object obj) {
        View view;
        return obj == this || (obj != null && BV5.A1T(obj, this) && (view = this.A00.get()) != null && view == ((FQ6) obj).A00.get());
    }

    public final int hashCode() {
        return C60R.A01(this.A00.get());
    }

    public FQ6(View view) {
        this.A00 = BV4.A0q(view);
    }
}
