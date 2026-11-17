package X;

import android.animation.AnimatorSet;
import android.os.Build;
import android.util.Log;

/* renamed from: X.Ffo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8535Ffo extends C8552Fg5 {
    public AnimatorSet A00;
    public final C8533Ffm A01;

    @Override // X.C8552Fg5
    public final void A04(C2194B9z c2194B9z) {
        C8542Ffv c8542Ffv = ((AbstractC8538Ffr) this.A01).A00;
        AnimatorSet animatorSet = this.A00;
        if (animatorSet == null) {
            c8542Ffv.A04(this);
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || !c8542Ffv.A07.mTransitioning) {
            return;
        }
        if (AbstractC8571FgQ.A0N(2)) {
            Log.v("FragmentManager", AnonymousClass007.A0a("Adding BackProgressCallbacks for Animators to operation ", c8542Ffv));
        }
        long totalDuration = animatorSet.getTotalDuration();
        long j = (long) (c2194B9z.A00 * totalDuration);
        if (j == 0) {
            j = 1;
        }
        if (j == totalDuration) {
            j = totalDuration - 1;
        }
        if (AbstractC8571FgQ.A0N(2)) {
            StringBuilder sbA0z = C60O.A0z("Setting currentPlayTime to ", j);
            sbA0z.append(" for Animator ");
            sbA0z.append(animatorSet);
            AbstractC7610F5x.A1M(c8542Ffv, " on operation ", sbA0z);
        }
        animatorSet.setCurrentPlayTime(j);
    }

    public C8535Ffo(C8533Ffm c8533Ffm) {
        this.A01 = c8533Ffm;
    }
}
