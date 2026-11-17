package X;

import android.transition.Transition;
import androidx.fragment.app.Fragment;
import androidx.transition.FragmentTransitionSupport;

/* renamed from: X.Ffx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8544Ffx extends AbstractC8538Ffr {
    public final Object A00;
    public final Object A01;
    public final boolean A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8544Ffx(C8542Ffv c8542Ffv, boolean z, boolean z2) {
        super(c8542Ffv);
        C7384Etj.A0Y(c8542Ffv, 0);
        Integer num = c8542Ffv.A00;
        Integer num2 = C79.A01;
        Fragment fragment = c8542Ffv.A07;
        this.A01 = num == num2 ? z ? fragment.getReenterTransition() : fragment.getEnterTransition() : z ? fragment.getReturnTransition() : fragment.getExitTransition();
        this.A02 = num == num2 ? z ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap() : true;
        this.A00 = z2 ? z ? fragment.getSharedElementReturnTransition() : fragment.getSharedElementEnterTransition() : null;
    }

    private final AbstractC8522FfX A01(Object obj) {
        if (obj == null) {
            return null;
        }
        AbstractC8522FfX abstractC8522FfX = AbstractC8545Ffy.A00;
        boolean z = obj instanceof Transition;
        if (z) {
            return abstractC8522FfX;
        }
        AbstractC8522FfX abstractC8522FfX2 = AbstractC8545Ffy.A01;
        if (abstractC8522FfX2 != null) {
            if (abstractC8522FfX2 instanceof FragmentTransitionSupport) {
                z = obj instanceof AbstractC8429Fds;
            }
            if (z) {
                return abstractC8522FfX2;
            }
        }
        StringBuilder sbA0f = C3cG.A0f(obj, "Transition ");
        sbA0f.append(" for fragment ");
        sbA0f.append(super.A00.A07);
        throw C8j3.A0w(" is not a valid framework Transition or AndroidX Transition", sbA0f);
    }

    public final AbstractC8522FfX A03() {
        Object obj = this.A01;
        AbstractC8522FfX abstractC8522FfXA01 = A01(obj);
        Object obj2 = this.A00;
        AbstractC8522FfX abstractC8522FfXA012 = A01(obj2);
        if (abstractC8522FfXA01 == null) {
            return abstractC8522FfXA012;
        }
        if (abstractC8522FfXA012 == null || abstractC8522FfXA01 == abstractC8522FfXA012) {
            return abstractC8522FfXA01;
        }
        StringBuilder sbA0x = C60O.A0x("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
        sbA0x.append(super.A00.A07);
        sbA0x.append(" returned Transition ");
        sbA0x.append(obj);
        throw BV5.A0P(obj2, " which uses a different Transition  type than its shared element transition ", sbA0x);
    }
}
