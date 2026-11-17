package X;

import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes4.dex */
public abstract class AOH<S> {
    public final MutableState A00 = new ParcelableSnapshotMutableState(AGE.A00, false);

    public abstract S A09();

    public abstract S A0A();

    public abstract void A0B(AOP<S> aop);

    public static boolean A00(AOP aop) {
        return C7384Etj.areEqual(aop.A07.getValue(), aop.A02.A09());
    }

    public final void A08(S s) {
        (this instanceof AOI ? ((AOI) this).A00 : ((SeekableTransitionState) this).A0B).Af8(s);
    }
}
