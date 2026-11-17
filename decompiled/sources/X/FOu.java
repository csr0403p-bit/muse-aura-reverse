package X;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class FOu implements FPH, FPU {
    public final List A00 = C3cG.A0h();

    @Override // X.FPU
    public final C8497Ff4 onApplyWindowInsets(View view, C8497Ff4 c8497Ff4) {
        C7384Etj.A0Y(c8497Ff4, 1);
        Iterator it = this.A00.iterator();
        if (!it.hasNext()) {
            return c8497Ff4;
        }
        it.next();
        throw BV4.A0a("onApplyWindowInsets");
    }

    @Override // X.FPH
    public final void ASw() {
        Iterator it = this.A00.iterator();
        if (it.hasNext()) {
            it.next();
            throw BV4.A0a("onEnd");
        }
    }

    @Override // X.FPH
    public final void AUs() {
        Iterator it = this.A00.iterator();
        if (it.hasNext()) {
            it.next();
            throw BV4.A0a("onPrepare");
        }
    }

    @Override // X.FPH
    public final void AV8() {
        Iterator it = this.A00.iterator();
        if (it.hasNext()) {
            it.next();
            throw BV4.A0a("onProgress");
        }
    }

    @Override // X.FPH
    public final void AW6() {
        Iterator it = this.A00.iterator();
        if (it.hasNext()) {
            it.next();
            throw BV4.A0a("onStart");
        }
    }
}
