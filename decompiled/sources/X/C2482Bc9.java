package X;

import android.util.Size;
import java.util.Comparator;

/* renamed from: X.Bc9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2482Bc9 implements Comparator<Size> {
    public boolean A00 = false;

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Size size, Size size2) {
        int iSignum = Long.signum(BV8.A0K(size) - BV8.A0K(size2));
        return this.A00 ? -iSignum : iSignum;
    }
}
