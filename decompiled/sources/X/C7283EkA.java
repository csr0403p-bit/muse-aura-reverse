package X;

import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: X.EkA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7283EkA {
    public int A00 = -1;
    public int A01 = -1;
    public int A02 = -1;
    public ColorFilter A03;
    public boolean A04;

    public final void A00(Drawable drawable) {
        int i = this.A00;
        if (i != -1) {
            drawable.setAlpha(i);
        }
        if (this.A04) {
            drawable.mutate();
            drawable.setColorFilter(this.A03);
        }
        int i2 = this.A01;
        if (i2 != -1) {
            drawable.setDither(AnonymousClass002.A1L(i2));
        }
        int i3 = this.A02;
        if (i3 != -1) {
            drawable.setFilterBitmap(i3 != 0);
        }
    }
}
