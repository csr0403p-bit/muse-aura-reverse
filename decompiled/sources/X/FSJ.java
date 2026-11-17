package X;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* loaded from: classes6.dex */
public class FSJ extends AbstractC8094FTa {
    public float A00;
    public PointF A03;
    public final DisplayMetrics A05;
    public final LinearInterpolator A07 = new LinearInterpolator();
    public final DecelerateInterpolator A06 = new DecelerateInterpolator();
    public boolean A04 = false;
    public int A01 = 0;
    public int A02 = 0;

    @Override // X.AbstractC8094FTa
    public void A01() {
        this.A02 = 0;
        this.A01 = 0;
        this.A03 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0145  */
    @Override // X.AbstractC8094FTa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A03(android.view.View r16, X.C8101FTo r17) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FSJ.A03(android.view.View, X.FTo):void");
    }

    public int A06(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            throw C60O.A0i("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 >= 0) {
            return 0;
        }
        return i7;
    }

    @Override // X.AbstractC8094FTa
    public void A04(C8101FTo c8101FTo, C8097FTd c8097FTd, int i, int i2) {
        if (super.A03.A0H.A0h() != 0) {
            int i3 = this.A01;
            int i4 = i3 - i;
            if (i3 * i4 <= 0) {
                i4 = 0;
            }
            this.A01 = i4;
            int i5 = this.A02;
            int i6 = i5 - i2;
            if (i5 * i6 <= 0) {
                i6 = 0;
            }
            this.A02 = i6;
            if (i4 != 0 || i6 != 0) {
                return;
            }
            int i7 = super.A00;
            Object obj = super.A02;
            if (obj instanceof FSN) {
                PointF pointFA6k = ((FSN) obj).A6k(i7);
                if (pointFA6k != null) {
                    float f = pointFA6k.x;
                    if (f != 0.0f || pointFA6k.y != 0.0f) {
                        float f2 = pointFA6k.y;
                        float fSqrt = (float) Math.sqrt((f * f) + (f2 * f2));
                        float f3 = f / fSqrt;
                        pointFA6k.x = f3;
                        float f4 = f2 / fSqrt;
                        pointFA6k.y = f4;
                        this.A03 = pointFA6k;
                        this.A01 = (int) (f3 * 10000.0f);
                        this.A02 = (int) (f4 * 10000.0f);
                        int iA05 = A05(10000);
                        LinearInterpolator linearInterpolator = this.A07;
                        c8101FTo.A02 = (int) (this.A01 * 1.2f);
                        c8101FTo.A03 = (int) (this.A02 * 1.2f);
                        c8101FTo.A01 = (int) (iA05 * 1.2f);
                        c8101FTo.A05 = linearInterpolator;
                        c8101FTo.A06 = true;
                        return;
                    }
                }
            } else {
                Log.w("RecyclerView", FGI.A0M("You should override computeScrollVectorForPosition when the LayoutManager does not implement ", FSN.class.getCanonicalName()));
            }
            c8101FTo.A04 = super.A00;
        }
        A00();
    }

    public FSJ(Context context) {
        this.A05 = C60Q.A0B(context);
    }

    public int A05(int i) {
        float f;
        boolean z;
        float fAbs = Math.abs(i);
        if (!this.A04) {
            DisplayMetrics displayMetrics = this.A05;
            if (this instanceof FF2) {
                f = 25.0f / displayMetrics.densityDpi;
                z = ((FF2) this).A03;
            } else if (this instanceof FSK) {
                C7384Etj.A0Y(displayMetrics, 0);
                f = 25.0f / displayMetrics.densityDpi;
                z = ((FSK) this).A03;
            } else {
                f = (this instanceof I0I ? 100.0f : 25.0f) / displayMetrics.densityDpi;
                this.A00 = f;
                this.A04 = true;
            }
            if (!z) {
                f *= 0.1f;
            }
            this.A00 = f;
            this.A04 = true;
        }
        return AbstractC7607F5u.A08(fAbs * this.A00);
    }
}
