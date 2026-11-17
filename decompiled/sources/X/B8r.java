package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class B8r implements InterfaceC1799ArI {
    public final C1726ApH A00 = new C1726ApH(0);
    public final Function0<Unit> A01;

    @Override // X.InterfaceC1799ArI
    public final void cancel() {
        if (this.A00.compareAndSet(1, 1)) {
            return;
        }
        this.A01.invoke();
    }

    public B8r(Function0<Unit> function0) {
        this.A01 = function0;
    }
}
