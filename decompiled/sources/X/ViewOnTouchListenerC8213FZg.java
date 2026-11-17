package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.ListView;

/* renamed from: X.FZg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnTouchListenerC8213FZg implements View.OnTouchListener {
    public static final int A0G = ViewConfiguration.getTapTimeout();
    public int A00;
    public Runnable A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final View A0C;
    public final ListView A0E;
    public final C8221FZo A0F = new C8221FZo();
    public final Interpolator A0D = new AccelerateInterpolator();
    public float[] A0A = {0.0f, 0.0f};
    public float[] A07 = {Float.MAX_VALUE, Float.MAX_VALUE};
    public float[] A0B = {0.0f, 0.0f};
    public float[] A09 = {0.0f, 0.0f};
    public float[] A08 = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX WARN: Code restructure failed: missing block: B:35:0x006e, code lost:
    
        if (r1 == 0.0f) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078 A[PHI: r4
  0x0078: PHI (r4v1 float) = (r4v0 float), (r4v6 float) binds: [B:3:0x000c, B:5:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private float A00(float r7, float r8, float r9, int r10) {
        /*
            r6 = this;
            float[] r0 = r6.A0A
            r1 = r0[r10]
            float[] r0 = r6.A07
            r4 = r0[r10]
            float r1 = r1 * r8
            r3 = 0
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 > 0) goto L78
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r4 = r1
            if (r0 >= 0) goto L78
            r4 = 0
        L14:
            r1 = 0
        L15:
            float r8 = r8 - r7
            r5 = 0
            int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r0 == 0) goto L76
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 >= 0) goto L76
            r2 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 < 0) goto L71
            float r8 = r8 / r4
            float r2 = r2 - r8
        L27:
            float r2 = r2 - r1
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 >= 0) goto L61
            android.view.animation.Interpolator r1 = r6.A0D
            float r0 = -r2
            float r0 = r1.getInterpolation(r0)
            float r1 = -r0
        L34:
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L5a
            r1 = 1065353216(0x3f800000, float:1.0)
        L3e:
            float[] r0 = r6.A0B
            r4 = r0[r10]
            float[] r0 = r6.A09
            r3 = r0[r10]
            float[] r0 = r6.A08
            r2 = r0[r10]
            float r4 = r4 * r9
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L90
            float r1 = r1 * r4
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 > 0) goto L8f
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = r1
            if (r0 >= 0) goto L8f
            return r3
        L5a:
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 >= 0) goto L6c
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L3e
        L61:
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 <= 0) goto L70
            android.view.animation.Interpolator r0 = r6.A0D
            float r1 = r0.getInterpolation(r2)
            goto L34
        L6c:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L3e
        L70:
            return r3
        L71:
            boolean r0 = r6.A03
            if (r0 == 0) goto L76
            goto L27
        L76:
            r2 = 0
            goto L27
        L78:
            int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r0 == 0) goto L14
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 >= 0) goto L14
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 < 0) goto L8a
            float r0 = r7 / r4
            float r1 = r1 - r0
            goto L15
        L8a:
            boolean r0 = r6.A03
            if (r0 == 0) goto L14
            goto L15
        L8f:
            return r2
        L90:
            float r1 = -r1
            float r1 = r1 * r4
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 > 0) goto L9c
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = r1
            if (r0 >= 0) goto L9c
            r2 = r3
        L9c:
            float r2 = -r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC8213FZg.A00(float, float, float, int):float");
    }

    public static void A01(ViewOnTouchListenerC8213FZg viewOnTouchListenerC8213FZg) {
        if (viewOnTouchListenerC8213FZg.A06) {
            viewOnTouchListenerC8213FZg.A03 = false;
            return;
        }
        C8221FZo c8221FZo = viewOnTouchListenerC8213FZg.A0F;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i = (int) (jCurrentAnimationTimeMillis - c8221FZo.A06);
        int i2 = c8221FZo.A03;
        if (i <= i2) {
            i2 = i;
            if (i < 0) {
                i2 = 0;
            }
        }
        c8221FZo.A02 = i2;
        c8221FZo.A00 = C8221FZo.A00(c8221FZo, jCurrentAnimationTimeMillis);
        c8221FZo.A07 = jCurrentAnimationTimeMillis;
    }

    public final boolean A02() {
        ListView listView;
        int count;
        float f = this.A0F.A01;
        int iAbs = (int) (f / Math.abs(f));
        if (iAbs == 0 || (count = (listView = this.A0E).getCount()) == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        return iAbs > 0 ? firstVisiblePosition + childCount < count || listView.getChildAt(childCount - 1).getBottom() > listView.getHeight() : firstVisiblePosition > 0 || listView.getChildAt(0).getTop() < 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0012, code lost:
    
        if (r1 != 3) goto L11;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r7, android.view.MotionEvent r8) {
        /*
            r6 = this;
            boolean r0 = r6.A04
            r5 = 0
            if (r0 == 0) goto L14
            int r1 = r8.getActionMasked()
            r4 = 1
            if (r1 == 0) goto L15
            if (r1 == r4) goto L6a
            r0 = 2
            if (r1 == r0) goto L19
            r0 = 3
            if (r1 == r0) goto L6a
        L14:
            return r5
        L15:
            r6.A05 = r4
            r6.A02 = r5
        L19:
            float r2 = r8.getX()
            float r1 = X.AbstractC7607F5u.A02(r7)
            android.view.View r3 = r6.A0C
            float r0 = X.AbstractC7607F5u.A02(r3)
            r6.A00(r2, r1, r0, r5)
            float r2 = r8.getY()
            float r1 = X.AbstractC7607F5u.A03(r7)
            float r0 = X.AbstractC7607F5u.A03(r3)
            float r1 = r6.A00(r2, r1, r0, r4)
            X.FZo r0 = r6.A0F
            r0.A01 = r1
            boolean r0 = r6.A03
            if (r0 != 0) goto L14
            boolean r0 = r6.A02()
            if (r0 == 0) goto L14
            java.lang.Runnable r2 = r6.A01
            if (r2 != 0) goto L53
            X.FZh r2 = new X.FZh
            r2.<init>(r6)
            r6.A01 = r2
        L53:
            r6.A03 = r4
            r6.A06 = r4
            boolean r0 = r6.A02
            if (r0 != 0) goto L66
            int r0 = r6.A00
            if (r0 <= 0) goto L66
            long r0 = (long) r0
            r3.postOnAnimationDelayed(r2, r0)
        L63:
            r6.A02 = r4
            return r5
        L66:
            r2.run()
            goto L63
        L6a:
            A01(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC8213FZg.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public ViewOnTouchListenerC8213FZg(ListView listView) {
        this.A0C = listView;
        float f = (int) ((1575.0f * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
        float[] fArr = this.A08;
        float f2 = f / 1000.0f;
        fArr[0] = f2;
        fArr[1] = f2;
        float[] fArr2 = this.A09;
        float f3 = ((int) ((r3 * 315.0f) + 0.5f)) / 1000.0f;
        fArr2[0] = f3;
        fArr2[1] = f3;
        float[] fArr3 = this.A07;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.A0A;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.A0B;
        float f4 = 1.0f / 1000.0f;
        fArr5[0] = f4;
        fArr5[1] = f4;
        this.A00 = A0G;
        C8221FZo c8221FZo = this.A0F;
        c8221FZo.A04 = 500;
        c8221FZo.A03 = 500;
        this.A0E = listView;
    }
}
