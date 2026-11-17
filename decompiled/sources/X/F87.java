package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import com.facebook.aura.R;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class F87 {
    public static final F87 A00 = new F87();

    public static final long A00(Animator animator) {
        C7384Etj.A0Y(animator, 0);
        if (animator instanceof F8B) {
            F8B f8b = (F8B) animator;
            return (f8b.A04 * f8b.A00) + A00(f8b.A05);
        }
        if (!(animator instanceof F8D)) {
            if (animator instanceof FT5) {
                return ((ValueAnimator) animator).getCurrentPlayTime();
            }
            return 0L;
        }
        List<Animator> list = ((F8D) animator).A02;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        Iterator<Animator> it = list.iterator();
        while (it.hasNext()) {
            BV6.A1R(arrayListA0i, A00(AbstractC7607F5u.A0S(it)));
        }
        return C60P.A01((Number) AbstractC0878AGe.A07(arrayListA0i));
    }

    public static final Animator A01(FBB fbb, String str) {
        C7384Etj.A0Y(str, 1);
        return (Animator) ((AbstractMap) fbb.A03(R.id.bk_context_key_animations)).get(str);
    }

    public static final void A02(Animator animator, long j) {
        C7384Etj.A0Y(animator, 0);
        animator.setStartDelay(animator.getStartDelay() + j);
    }

    public static final void A03(Animator animator, long j) {
        C7384Etj.A0Y(animator, 0);
        if (animator instanceof F8B) {
            F8B f8b = (F8B) animator;
            long jA07 = ATD.A07(j, 0L, f8b.getDuration());
            long j2 = f8b.A04;
            f8b.A00 = (int) (jA07 / j2);
            A03(f8b.A05, jA07 % j2);
            return;
        }
        if (animator instanceof F8D) {
            Iterator<Animator> it = ((F8D) animator).A02.iterator();
            while (it.hasNext()) {
                A03(AbstractC7607F5u.A0S(it), j);
            }
        } else if (animator instanceof FT5) {
            ((ValueAnimator) animator).setCurrentPlayTime(j);
        }
    }

    public final void A05(FBB fbb, String str, boolean z) {
        C7384Etj.A0Y(str, 1);
        Animator animator = (Animator) ((AbstractMap) fbb.A03(R.id.bk_context_key_animations)).get(str);
        if (animator != null) {
            if (!animator.isStarted()) {
                animator.addListener(new F88(fbb, str, z));
                animator.addPauseListener(new F89());
            }
            animator.start();
        }
    }

    public static final void A04(Animator animator, FBB fbb, String str) {
        AnonymousClass003.A0x(animator, str);
        Animator animator2 = (Animator) ((AbstractMap) fbb.A03(R.id.bk_context_key_animations)).put(str, animator);
        if (animator2 != null) {
            animator2.cancel();
            FFI.A01(null, String.format("Found previously started animator with key %s. Canceling it.", str), null);
        }
    }
}
