package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class I07 extends AnimatorListenerAdapter {
    public final int $t;
    public final Object A00;
    public final Object A01;
    public final Object A02;

    public I07(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.A00 = obj2;
        this.A01 = obj3;
        this.A02 = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (this.$t != 0) {
            super.onAnimationCancel(animator);
        } else {
            ((FT0) this.A01).onAnimationCancel((View) this.A02);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                ((FT0) this.A01).onAnimationEnd((View) this.A02);
                break;
            case 1:
                C8490Fex c8490Fex = (C8490Fex) this.A01;
                c8490Fex.A00.A09(1.0f);
                C8487Feu.A02((View) this.A02, c8490Fex);
                break;
            case 2:
                FDW fdw = (FDW) this.A01;
                HsM hsM = (HsM) this.A02;
                Hj6 hj6 = Hj6.A02;
                FBB fbb = (FBB) this.A00;
                List listAsList = Arrays.asList(fdw, fbb);
                Hj6 hj62 = new Hj6();
                Object[] array = listAsList.toArray();
                hj62.A01 = array;
                hj62.A00 = array.length;
                F6D.A03(fbb, fdw, hj62, hsM);
                break;
            default:
                C7384Etj.A0Y(animator, 0);
                C7747FCz c7747FCz = (C7747FCz) this.A02;
                List<Function0<Unit>> list = c7747FCz.A06;
                Iterator<Function0<Unit>> it = list.iterator();
                while (it.hasNext()) {
                    BV7.A1M(it);
                }
                c7747FCz.A00 = null;
                c7747FCz.A07.clear();
                list.clear();
                animator.removeListener(this);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                ((FT0) this.A01).onAnimationStart((View) this.A02);
                break;
            case 1:
            case 2:
            default:
                super.onAnimationStart(animator);
                break;
            case 3:
                Iterator<Function0<Unit>> it = ((C7747FCz) this.A02).A07.iterator();
                while (it.hasNext()) {
                    BV7.A1M(it);
                }
                break;
        }
    }
}
