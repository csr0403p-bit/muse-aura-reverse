package X;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.MutableState;

/* loaded from: classes4.dex */
public abstract class AbJ {
    public static final boolean A00(PagerState pagerState, float f) {
        boolean z = C8j4.A0V(pagerState.A0A).A0K;
        MutableState mutableState = pagerState.A0V;
        return ((((int) AnonymousClass003.A03(AWx.A07(mutableState))) != 0 || ((int) AnonymousClass004.A00(AWx.A07(mutableState))) != 0) ? C8j3.A05(C8j5.A0E(AWx.A07(mutableState), C8j4.A0V(pagerState.A0A).A09, EnumC1108AYu.A02)) : -f) <= 0.0f ? !z : z;
    }
}
