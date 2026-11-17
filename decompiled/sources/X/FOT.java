package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class FOT extends FrameLayout {
    public static final Interpolator A08 = new PathInterpolator(0.17f, 0.17f, 0.0f, 1.0f);
    public InterfaceC8013FPk A00;
    public boolean A01;
    public final ObjectAnimator A02;
    public final ObjectAnimator A03;
    public final ObjectAnimator A04;
    public final ObjectAnimator A05;
    public final List<View> A06;
    public final Animator.AnimatorListener A07;

    private final void A00(long j, long j2) {
        this.A04.setDuration(j);
        this.A05.setDuration(j2);
        this.A02.setDuration(j);
        this.A03.setDuration(j2);
    }

    public static final void A02(View view, FOT fot) {
        InterfaceC8013FPk interfaceC8013FPk = fot.A00;
        if (interfaceC8013FPk != null) {
            FOS fos = (FOS) interfaceC8013FPk;
            C7384Etj.A0Y(view, 0);
            Iterator<FNZ> it = fos.A0K.iterator();
            C7384Etj.A0U(it);
            while (it.hasNext()) {
                FNZ next = it.next();
                if (next.A00 == view) {
                    next.A03.A8v();
                    next.A00 = null;
                }
            }
            Iterator<FNZ> it2 = fos.A0M.iterator();
            while (it2.hasNext()) {
                FNZ next2 = it2.next();
                if (next2.A00 == view) {
                    it2.remove();
                    InterfaceC7992FOj interfaceC7992FOj = next2.A03;
                    interfaceC7992FOj.A8v();
                    next2.A00 = null;
                    interfaceC7992FOj.destroy();
                }
            }
        }
        fot.removeView(view);
    }

    public final void setOnViewRemovedListener(InterfaceC8013FPk interfaceC8013FPk) {
        this.A00 = interfaceC8013FPk;
    }

    public FOT(Context context) {
        super(context);
        I05 i05 = new I05(this, 2);
        this.A07 = i05;
        ObjectAnimator objectAnimator = new ObjectAnimator();
        Interpolator interpolator = A08;
        objectAnimator.setInterpolator(interpolator);
        objectAnimator.addListener(i05);
        this.A04 = objectAnimator;
        ObjectAnimator objectAnimator2 = new ObjectAnimator();
        objectAnimator2.setInterpolator(interpolator);
        this.A05 = objectAnimator2;
        ObjectAnimator objectAnimator3 = new ObjectAnimator();
        objectAnimator3.setInterpolator(interpolator);
        objectAnimator3.addListener(i05);
        this.A02 = objectAnimator3;
        ObjectAnimator objectAnimator4 = new ObjectAnimator();
        objectAnimator4.setInterpolator(interpolator);
        this.A03 = objectAnimator4;
        this.A06 = C3cG.A0h();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(android.view.View r9, X.HiG r10, X.FOT r11, boolean r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FOT.A01(android.view.View, X.HiG, X.FOT, boolean, boolean):void");
    }

    public final View getPrimaryChild() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        return getChildAt(childCount - 1);
    }
}
