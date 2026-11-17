package X;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import com.facebook.aura.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class F8D extends Animator {
    public long A00;
    public long A01;
    public final List<Animator> A02;
    public final Integer A03;

    @Override // android.animation.Animator
    public final void cancel() {
        Iterator<Animator> it = this.A02.iterator();
        while (it.hasNext()) {
            AbstractC7607F5u.A0S(it).cancel();
        }
        A00(this, FZS.A02(this, 12));
    }

    @Override // android.animation.Animator
    public final void end() {
        Iterator<Animator> it = this.A02.iterator();
        while (it.hasNext()) {
            AbstractC7607F5u.A0S(it).end();
        }
    }

    @Override // android.animation.Animator
    public final long getDuration() {
        return this.A00;
    }

    @Override // android.animation.Animator
    public final long getStartDelay() {
        return this.A01;
    }

    @Override // android.animation.Animator
    public final long getTotalDuration() {
        long j = this.A00;
        return j != -1 ? j + this.A01 : j;
    }

    @Override // android.animation.Animator
    public final boolean isRunning() {
        Iterator<Animator> it = this.A02.iterator();
        while (it.hasNext()) {
            if (AbstractC7607F5u.A0S(it).isRunning()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.animation.Animator
    public final boolean isStarted() {
        Iterator<Animator> it = this.A02.iterator();
        while (it.hasNext()) {
            if (AbstractC7607F5u.A0S(it).isStarted()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.animation.Animator
    public final Animator setDuration(long j) {
        return this;
    }

    @Override // android.animation.Animator
    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        Iterator<Animator> it = this.A02.iterator();
        while (it.hasNext()) {
            AbstractC7607F5u.A0S(it).setInterpolator(timeInterpolator);
        }
    }

    @Override // android.animation.Animator
    public final void setStartDelay(long j) {
        this.A01 = j;
        Iterator<Animator> it = this.A02.iterator();
        while (it.hasNext()) {
            Animator animatorA0S = AbstractC7607F5u.A0S(it);
            if (animatorA0S instanceof F8D) {
                animatorA0S.setStartDelay(j);
            } else {
                F87.A02(animatorA0S, j);
            }
        }
    }

    @Override // android.animation.Animator
    public final void start() {
        List<Animator> list = this.A02;
        Iterator<Animator> it = list.iterator();
        while (it.hasNext()) {
            AbstractC7607F5u.A0S(it).start();
        }
        A00(this, FZS.A02(this, 13));
        if (list.isEmpty()) {
            A00(this, FZS.A02(this, 14));
        }
    }

    public F8D(Integer num, List list) {
        Animator animator;
        this.A03 = num;
        this.A02 = list;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Animator animatorA0S = AbstractC7607F5u.A0S(it);
            C7384Etj.A0Y(animatorA0S, 0);
            long totalDuration = animatorA0S.getTotalDuration();
            if (totalDuration == -1) {
                this.A00 = -1L;
                break;
            }
            this.A00 = Math.max(this.A00, totalDuration);
        }
        if (this.A00 == -1 || this.A02.isEmpty()) {
            return;
        }
        int iIntValue = this.A03.intValue();
        if (iIntValue == 0 || iIntValue == 2) {
            Iterator<Animator> it2 = this.A02.iterator();
            animator = null;
            long j = 0;
            while (it2.hasNext()) {
                Animator animatorA0S2 = AbstractC7607F5u.A0S(it2);
                C7384Etj.A0Y(animatorA0S2, 0);
                long totalDuration2 = animatorA0S2.getTotalDuration();
                if (totalDuration2 >= j) {
                    animator = animatorA0S2;
                    j = totalDuration2;
                }
            }
            if (animator == null) {
                throw BV4.A0U();
            }
        } else {
            if (iIntValue != 1) {
                throw C3cG.A0q();
            }
            animator = (Animator) AbstractC0878AGe.A0H(this.A02);
        }
        I05.A00(animator, this, 5);
    }

    public static final void A00(F8D f8d, G0U g0u) {
        List listA0X;
        ArrayList<Animator.AnimatorListener> listeners = f8d.getListeners();
        if (listeners == null || (listA0X = AbstractC0878AGe.A0X(listeners)) == null) {
            return;
        }
        for (Object obj : listA0X) {
            C7384Etj.A0X(obj);
            g0u.invoke(obj);
        }
    }

    public static final void A01(FBB fbb, List<? extends Animator> list) {
        if (C3cG.A1P(FBB.A01(fbb, R.id.bk_context_key_disable_animations), true)) {
            Iterator<? extends Animator> it = list.iterator();
            while (it.hasNext()) {
                AbstractC7607F5u.A0S(it).setDuration(0L);
            }
        }
    }

    @Override // android.animation.Animator
    public final void pause() {
        super.pause();
        if (isPaused()) {
            Iterator<Animator> it = this.A02.iterator();
            while (it.hasNext()) {
                AbstractC7607F5u.A0S(it).pause();
            }
        }
    }

    @Override // android.animation.Animator
    public final void resume() {
        super.resume();
        if (isPaused()) {
            return;
        }
        Iterator<Animator> it = this.A02.iterator();
        while (it.hasNext()) {
            AbstractC7607F5u.A0S(it).resume();
        }
    }
}
