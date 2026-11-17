package X;

import android.view.View;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes6.dex */
public final class FP1 implements FPU {
    public final Set<FPU> A00 = C3cG.A0k();

    @Override // X.FPU
    public final C8497Ff4 onApplyWindowInsets(View view, C8497Ff4 c8497Ff4) {
        AnonymousClass003.A0u(view, c8497Ff4);
        Iterator<FPU> it = this.A00.iterator();
        while (it.hasNext()) {
            it.next().onApplyWindowInsets(view, c8497Ff4);
        }
        return c8497Ff4;
    }
}
