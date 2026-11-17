package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class BDU implements InterfaceC1725ApE {
    public static final BDU A00 = new BDU();

    @Override // X.InterfaceC1725ApE
    public final Function0<Unit> ANo(AbstractC1718Ap2 abstractC1718Ap2) {
        BSC bsc = new BSC(abstractC1718Ap2, 2);
        abstractC1718Ap2.addOnAttachStateChangeListener(bsc);
        BDX bdx = new BDX(abstractC1718Ap2);
        BDV.A00(abstractC1718Ap2).A00.add(bdx);
        return new C8188FYf(abstractC1718Ap2, bsc, bdx, 0);
    }
}
