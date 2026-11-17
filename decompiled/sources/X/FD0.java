package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.ViewTreeObserver;
import java.util.Map;

/* loaded from: classes6.dex */
public final class FD0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ FHQ A00;
    public final /* synthetic */ FBB A01;
    public final /* synthetic */ String A02;

    public FD0(FHQ fhq, FBB fbb, String str) {
        this.A00 = fhq;
        this.A02 = str;
        this.A01 = fbb;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Object objA00;
        Object objA002;
        Animator animator;
        FHQ fhq = this.A00;
        fhq.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        C7747FCz c7747FCzA00 = AbstractC7724FCa.A00(this.A02, true);
        if (c7747FCzA00 != null) {
            FBB fbb = this.A01;
            String str = c7747FCzA00.A05;
            Map<String, C7633F7q> map = F9P.A00;
            C7633F7q c7633F7q = map.get(str);
            if (c7633F7q == null || (objA00 = c7633F7q.A00(Hj6.A02, null)) == null) {
                objA00 = C9jH.A00;
            }
            C7633F7q c7633F7q2 = map.get(c7747FCzA00.A03);
            if (c7633F7q2 == null || (objA002 = c7633F7q2.A00(Hj6.A02, null)) == null) {
                objA002 = C9jH.A00;
            }
            Hj6 hj6A03 = C9115Fyg.A03(C9115Fyg.A02(objA00), objA002, 1);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            try {
                Object objA003 = c7747FCzA00.A01.A00(hj6A03, null);
                if (!(objA003 instanceof Animator) || (animator = (Animator) objA003) == null) {
                    FFI.A01(null, FGI.A0h("Failed to create transition animator from ", c7747FCzA00.A04, " to ", c7747FCzA00.A02, ". The expression returned null."), null);
                    animator = valueAnimatorOfFloat;
                }
                C7384Etj.A0X(animator);
            } catch (RuntimeException e) {
                String strA0h = FGI.A0h("Failed to create transition animator from ", c7747FCzA00.A04, " to ", c7747FCzA00.A02, " due to exception.");
                F6D f6d = c7747FCzA00.A01.A00;
                FFI.A01(f6d != null ? f6d.A02 : null, strA0h, e);
                C7384Etj.A0X(valueAnimatorOfFloat);
                animator = valueAnimatorOfFloat;
            }
            c7747FCzA00.A00 = animator;
            animator.addListener(new I07(c7747FCzA00, null, fbb, 3));
            fhq.postOnAnimation(new FD2(c7747FCzA00));
        }
    }
}
