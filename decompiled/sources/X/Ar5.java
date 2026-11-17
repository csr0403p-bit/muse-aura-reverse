package X;

import kotlin.Unit;

/* loaded from: classes4.dex */
public final class Ar5 implements InterfaceC2266BNk {
    public final InterfaceC1740Apd A00;
    public final HzR<Unit> A01 = new GCV(0, null);
    public final /* synthetic */ Ar4 A02;

    public Ar5(Ar4 ar4, InterfaceC1740Apd interfaceC1740Apd) {
        this.A02 = ar4;
        this.A00 = interfaceC1740Apd;
    }

    @Override // X.InterfaceC2266BNk
    public final void close() {
        this.A01.AhZ(Unit.INSTANCE);
    }
}
