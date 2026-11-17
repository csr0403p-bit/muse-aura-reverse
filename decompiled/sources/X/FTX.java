package X;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public final class FTX extends AbstractC8109FTy implements InterfaceC8116FUg {
    public float A00;
    public float A01;
    public int A02;
    public int A04;
    public int A05;
    public int A09;
    public int A0A;
    public RecyclerView A0B;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final ValueAnimator A0K;
    public final Drawable A0L;
    public final Drawable A0M;
    public final StateListDrawable A0N;
    public final StateListDrawable A0O;
    public final FS5 A0P;
    public final Runnable A0Q;
    public static final int[] A0U = {R.attr.state_pressed};
    public static final int[] A0T = new int[0];
    public int A07 = 0;
    public int A06 = 0;
    public boolean A0D = false;
    public boolean A0C = false;
    public int A08 = 0;
    public int A03 = 0;
    public final int[] A0S = new int[2];
    public final int[] A0R = new int[2];

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(int r5) {
        /*
            r4 = this;
            r2 = 2
            if (r5 != r2) goto L3b
            int r0 = r4.A08
            if (r0 == r2) goto L15
            android.graphics.drawable.StateListDrawable r1 = r4.A0O
            int[] r0 = X.FTX.A0U
            r1.setState(r0)
            androidx.recyclerview.widget.RecyclerView r1 = r4.A0B
            java.lang.Runnable r0 = r4.A0Q
            r1.removeCallbacks(r0)
        L15:
            A00(r4)
        L18:
            int r0 = r4.A08
            if (r0 != r2) goto L35
            if (r5 == r2) goto L32
            android.graphics.drawable.StateListDrawable r1 = r4.A0O
            int[] r0 = X.FTX.A0T
            r1.setState(r0)
            r0 = 1200(0x4b0, float:1.682E-42)
        L27:
            androidx.recyclerview.widget.RecyclerView r3 = r4.A0B
            java.lang.Runnable r2 = r4.A0Q
            r3.removeCallbacks(r2)
            long r0 = (long) r0
            r3.postDelayed(r2, r0)
        L32:
            r4.A08 = r5
            return
        L35:
            r0 = 1
            if (r5 != r0) goto L32
            r0 = 1500(0x5dc, float:2.102E-42)
            goto L27
        L3b:
            if (r5 != 0) goto L15
            androidx.recyclerview.widget.RecyclerView r0 = r4.A0B
            r0.invalidate()
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FTX.A02(int):void");
    }

    public static final void A00(FTX ftx) {
        int i = ftx.A02;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                ftx.A0K.cancel();
            }
        }
        ftx.A02 = 1;
        ValueAnimator valueAnimator = ftx.A0K;
        valueAnimator.setFloatValues(AbstractC7609F5w.A03(valueAnimator), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    public static final boolean A01(FTX ftx, float f, float f2) {
        if (ftx.A0B.getLayoutDirection() != 1 ? f >= ftx.A07 - ftx.A0I : f <= ftx.A0I) {
            int i = ftx.A09;
            int i2 = ftx.A0A / 2;
            if (f2 >= i - i2 && f2 <= i + i2) {
                return true;
            }
        }
        return false;
    }

    public FTX(Drawable drawable, Drawable drawable2, StateListDrawable stateListDrawable, StateListDrawable stateListDrawable2, RecyclerView recyclerView, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.A0K = valueAnimatorOfFloat;
        this.A02 = 0;
        this.A0Q = new FTq(this);
        this.A0P = new I0J(this, 0);
        this.A0O = stateListDrawable;
        this.A0M = drawable;
        this.A0N = stateListDrawable2;
        this.A0L = drawable2;
        this.A0I = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.A0J = Math.max(i, drawable.getIntrinsicWidth());
        this.A0E = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.A0F = Math.max(i, drawable2.getIntrinsicWidth());
        this.A0H = i2;
        this.A0G = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new C8100FTn(this));
        valueAnimatorOfFloat.addUpdateListener(new FTj(this));
        RecyclerView recyclerView2 = this.A0B;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.A0z(this);
                RecyclerView recyclerView3 = this.A0B;
                recyclerView3.A19.remove(this);
                if (recyclerView3.A0J == this) {
                    recyclerView3.A0J = null;
                }
                this.A0B.A11(this.A0P);
                this.A0B.removeCallbacks(this.A0Q);
            }
            this.A0B = recyclerView;
            recyclerView.A0y(this);
            RecyclerView recyclerView4 = this.A0B;
            recyclerView4.A19.add(this);
            recyclerView4.A10(this.A0P);
        }
    }
}
