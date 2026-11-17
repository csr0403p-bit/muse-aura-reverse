package X;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* loaded from: classes6.dex */
public final class FK4 extends AbstractC8109FTy {
    public float A00;
    public FK5 A01;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final Rect A0A;
    public final FK3 A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final Paint A09 = AbstractC7607F5u.A0T();
    public final RectF A0C = AbstractC7607F5u.A0Y();
    public final RectF A0B = AbstractC7607F5u.A0Y();
    public boolean A02 = false;

    public FK4(Rect rect, FK3 fk3, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        this.A03 = i2;
        this.A05 = i;
        this.A08 = Color.alpha(i);
        this.A04 = Color.alpha(i2);
        this.A07 = i3;
        this.A06 = i4;
        this.A0E = z;
        if (z) {
            this.A00 = 1.0f;
        }
        this.A0A = rect;
        this.A0F = z2;
        this.A0D = fk3;
    }
}
