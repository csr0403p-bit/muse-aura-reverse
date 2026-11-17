package X;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class F8B extends Animator {
    public int A00;
    public boolean A01;
    public long A02;
    public final int A03;
    public final long A04;
    public final Animator A05;

    public F8B(Animator animator, FBB fbb, int i) {
        C7384Etj.A0Y(animator, 1);
        FBA.A07(animator, fbb);
        this.A05 = animator;
        this.A04 = animator.getTotalDuration();
        this.A03 = i;
        if (i > 0 || i == -1) {
            animator.addListener(new F8C(this, i));
        }
    }

    @Override // android.animation.Animator
    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        C7384Etj.A0Y(timeInterpolator, 0);
        this.A05.setInterpolator(timeInterpolator);
    }

    @Override // android.animation.Animator
    public final void start() {
        this.A00 = 0;
        this.A01 = false;
        long j = this.A02;
        if (j != 0) {
            F87.A02(this.A05, j);
        }
        this.A05.start();
    }

    @Override // android.animation.Animator
    public final void cancel() {
        this.A05.cancel();
    }

    @Override // android.animation.Animator
    public final void end() {
        this.A05.end();
    }

    @Override // android.animation.Animator
    public final long getDuration() {
        int i = this.A03;
        if (i == -1) {
            return -1L;
        }
        long j = this.A04;
        if (j != -1) {
            return j * i;
        }
        return -1L;
    }

    @Override // android.animation.Animator
    public final long getStartDelay() {
        return this.A02;
    }

    @Override // android.animation.Animator
    public final long getTotalDuration() {
        int i = this.A03;
        if (i == -1) {
            return -1L;
        }
        long j = this.A04;
        if (j != -1) {
            return (j * i) + this.A02;
        }
        return -1L;
    }

    @Override // android.animation.Animator
    public final boolean isPaused() {
        return this.A05.isPaused();
    }

    @Override // android.animation.Animator
    public final boolean isRunning() {
        return this.A05.isRunning();
    }

    @Override // android.animation.Animator
    public final void pause() {
        this.A05.pause();
    }

    @Override // android.animation.Animator
    public final void resume() {
        this.A05.resume();
    }

    @Override // android.animation.Animator
    public final Animator setDuration(long j) {
        return this;
    }

    @Override // android.animation.Animator
    public final void setStartDelay(long j) {
        this.A02 = j;
    }

    public static final void A00(F8B f8b, G0U g0u) {
        List listA0X;
        ArrayList<Animator.AnimatorListener> listeners = f8b.getListeners();
        if (listeners == null || (listA0X = AbstractC0878AGe.A0X(listeners)) == null) {
            return;
        }
        for (Object obj : listA0X) {
            C7384Etj.A0X(obj);
            g0u.invoke(obj);
        }
    }
}
