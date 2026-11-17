package X;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.Choreographer;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.FiI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ChoreographerFrameCallbackC8658FiI extends ValueAnimator implements Choreographer.FrameCallback {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public int A05;
    public long A06;
    public C6837Eap A07;
    public boolean A08;
    public boolean A09;
    public final Set<Animator.AnimatorListener> A0A;
    public final Set<Animator.AnimatorPauseListener> A0B;
    public final Set<ValueAnimator.AnimatorUpdateListener> A0C;

    public ChoreographerFrameCallbackC8658FiI() {
        this(0);
        this.A04 = 1.0f;
        this.A09 = false;
        this.A06 = 0L;
        this.A01 = 0.0f;
        this.A00 = 0.0f;
        this.A05 = 0;
        this.A03 = -2.14748365E9f;
        this.A02 = 2.14748365E9f;
        this.A08 = false;
    }

    public static final void A00(ChoreographerFrameCallbackC8658FiI choreographerFrameCallbackC8658FiI) {
        if (choreographerFrameCallbackC8658FiI.A08) {
            Choreographer.getInstance().removeFrameCallback(choreographerFrameCallbackC8658FiI);
            Choreographer.getInstance().postFrameCallback(choreographerFrameCallbackC8658FiI);
        }
    }

    public final float A01() {
        C6837Eap c6837Eap = this.A07;
        if (c6837Eap == null) {
            return 0.0f;
        }
        float f = this.A00;
        float f2 = c6837Eap.A03;
        return (f - f2) / (c6837Eap.A00 - f2);
    }

    public final float A02() {
        C6837Eap c6837Eap = this.A07;
        if (c6837Eap == null) {
            return 0.0f;
        }
        float f = this.A02;
        return f == 2.14748365E9f ? c6837Eap.A00 : f;
    }

    public final float A03() {
        C6837Eap c6837Eap = this.A07;
        if (c6837Eap == null) {
            return 0.0f;
        }
        float f = this.A03;
        return f == -2.14748365E9f ? c6837Eap.A03 : f;
    }

    public final void A04() {
        Iterator<ValueAnimator.AnimatorUpdateListener> it = this.A0C.iterator();
        while (it.hasNext()) {
            it.next().onAnimationUpdate(this);
        }
    }

    public final void A05(float f) {
        if (this.A01 != f) {
            float fA03 = A03();
            float fA02 = A02();
            PointF pointF = AbstractC8699Fiz.A00;
            float fA01 = BV7.A01(fA02, f, fA03);
            this.A01 = fA01;
            this.A00 = fA01;
            this.A06 = 0L;
            A04();
        }
    }

    public final void A06(boolean z) {
        Iterator<Animator.AnimatorListener> it = this.A0A.iterator();
        while (it.hasNext()) {
            it.next().onAnimationEnd(this, z);
        }
    }

    @Override // android.animation.Animator
    public final void addListener(Animator.AnimatorListener animatorListener) {
        this.A0A.add(animatorListener);
    }

    @Override // android.animation.Animator
    public final void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.A0B.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.A0C.add(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator<Animator.AnimatorListener> it = this.A0A.iterator();
        while (it.hasNext()) {
            it.next().onAnimationCancel(this);
        }
        A06(C8j3.A1R((this.A04 > 0.0f ? 1 : (this.A04 == 0.0f ? 0 : -1))));
        Choreographer.getInstance().removeFrameCallback(this);
        this.A08 = false;
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float fA02;
        float fA03;
        if (this.A07 == null) {
            return 0.0f;
        }
        if (this.A04 < 0.0f) {
            fA02 = A02();
            fA03 = this.A00;
        } else {
            fA02 = this.A00;
            fA03 = A03();
        }
        return (fA02 - fA03) / (A02() - A03());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        C6837Eap c6837Eap = this.A07;
        if (c6837Eap == null) {
            return 0L;
        }
        return (long) c6837Eap.A00();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getStartDelay() {
        throw C8j3.A18("LottieAnimator does not support getStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.A08;
    }

    @Override // android.animation.Animator
    public final void removeAllListeners() {
        this.A0A.clear();
    }

    @Override // android.animation.ValueAnimator
    public final void removeAllUpdateListeners() {
        this.A0C.clear();
    }

    @Override // android.animation.Animator
    public final void removeListener(Animator.AnimatorListener animatorListener) {
        this.A0A.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public final void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.A0B.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.A0C.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        throw C8j3.A18("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setStartDelay(long j) {
        throw C8j3.A18("LottieAnimator does not support setStartDelay.");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    @Override // android.view.Choreographer.FrameCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void doFrame(long r8) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ChoreographerFrameCallbackC8658FiI.doFrame(long):void");
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(A01());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ Animator setDuration(long j) {
        setDuration(j);
        throw F60.createAndThrow();
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.A09) {
            return;
        }
        this.A09 = false;
        this.A04 = -this.A04;
    }

    public ChoreographerFrameCallbackC8658FiI(int i) {
        this.A0C = new CopyOnWriteArraySet();
        this.A0A = new CopyOnWriteArraySet();
        this.A0B = new CopyOnWriteArraySet();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final ValueAnimator setDuration(long j) {
        throw C8j3.A18("LottieAnimator does not support setDuration.");
    }
}
