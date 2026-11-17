package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ApF implements InterfaceC1725ApE {
    public static final ApF A00 = new ApF();

    @Override // X.InterfaceC1725ApE
    public final Function0<Unit> ANo(AbstractC1718Ap2 abstractC1718Ap2) {
        BSC bsc = new BSC(abstractC1718Ap2, 1);
        abstractC1718Ap2.addOnAttachStateChangeListener(bsc);
        return new C2335BUj(9, bsc, abstractC1718Ap2);
    }
}
