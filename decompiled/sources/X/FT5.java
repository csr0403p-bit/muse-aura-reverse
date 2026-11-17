package X;

import android.animation.ValueAnimator;
import android.view.animation.AnimationUtils;

/* loaded from: classes6.dex */
public class FT5 extends ValueAnimator {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public final I05 A07;

    public static final void A01(FT5 ft5) {
        ft5.A06 = -1L;
        ft5.A04 = -1L;
        ft5.A05 = 0L;
        ft5.A02 = -1L;
        ft5.A00 = 0L;
        super.setStartDelay(ft5.A03);
        ft5.A01 = 0L;
    }

    @Override // android.animation.ValueAnimator
    public final long getCurrentPlayTime() {
        long j;
        if (this.A06 == -1) {
            long j2 = this.A05;
            if (j2 == -1) {
                return 0L;
            }
            return j2;
        }
        if (isPaused() && this.A04 > this.A02) {
            return this.A05;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        long j3 = this.A01;
        if (j3 == 0) {
            long j4 = (this.A05 + jCurrentAnimationTimeMillis) - this.A06;
            boolean zIsPaused = isPaused();
            long jCurrentAnimationTimeMillis2 = this.A00;
            if (zIsPaused) {
                jCurrentAnimationTimeMillis2 = (jCurrentAnimationTimeMillis2 + AnimationUtils.currentAnimationTimeMillis()) - this.A02;
            }
            j = j4 - jCurrentAnimationTimeMillis2;
        } else {
            j = this.A03 + j3;
        }
        long duration = this.A03 + getDuration();
        return j <= duration ? j : duration;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getStartDelay() {
        return this.A03;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getTotalDuration() {
        return this.A03 + getDuration();
    }

    @Override // android.animation.ValueAnimator
    public final void setCurrentPlayTime(long j) {
        long jA07 = ATD.A07(j, 0L, this.A03 + getDuration());
        this.A04 = AnimationUtils.currentAnimationTimeMillis();
        this.A05 = jA07;
        long j2 = this.A03;
        if (jA07 >= j2) {
            super.setStartDelay(0L);
            super.setCurrentPlayTime(jA07 - j2);
            return;
        }
        super.setStartDelay(j2 - jA07);
        if (isPaused()) {
            super.setCurrentPlayTime(0L);
        } else if (this.A01 > 0) {
            start();
        }
    }

    public FT5() {
        I05 i05 = new I05(this, 6);
        this.A07 = i05;
        this.A06 = -1L;
        this.A02 = -1L;
        this.A04 = -1L;
        super.addListener(i05);
        super.addUpdateListener(new C8919Ftb(this, 3));
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void pause() {
        boolean zIsPaused = isPaused();
        super.pause();
        if (zIsPaused || !isPaused()) {
            return;
        }
        this.A02 = AnimationUtils.currentAnimationTimeMillis();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void resume() {
        boolean zIsPaused = isPaused();
        super.resume();
        if (!zIsPaused || isPaused()) {
            return;
        }
        this.A00 += AnimationUtils.currentAnimationTimeMillis() - this.A02;
        this.A02 = -1L;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setStartDelay(long j) {
        super.setStartDelay(j);
        this.A03 = j;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void start() {
        super.start();
        this.A06 = AnimationUtils.currentAnimationTimeMillis();
        this.A02 = -1L;
        this.A00 = 0L;
        this.A01 = 0L;
    }
}
