package X;

import android.text.Layout;
import java.util.Comparator;

/* renamed from: X.E1x, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6347E1x {
    public static final Comparator<C6347E1x> A02 = new C7572F4l(13);
    public final int A00;
    public final E0J A01;

    public C6347E1x(Layout.Alignment alignment, CharSequence charSequence, float f, float f2, int i, int i2, int i3, int i4, boolean z) {
        boolean z2 = false;
        int i5 = -16777216;
        if (z) {
            i5 = i3;
            z2 = true;
        }
        this.A01 = new E0J(null, alignment, null, charSequence, f, f2, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, 0.0f, 0, i, i2, Integer.MIN_VALUE, i5, Integer.MIN_VALUE, 0, z2);
        this.A00 = i4;
    }
}
