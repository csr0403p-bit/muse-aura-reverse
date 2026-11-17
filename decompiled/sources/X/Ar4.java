package X;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class Ar4 implements InterfaceC1084AXr {
    public final G2k<InterfaceC2266BNk, InterfaceC1740Apd, Function0<? extends InterfaceC1497Ak4>, BFM, Integer, Unit> A02;
    public final C5WW A01 = new C5WW();
    public final MutableState A00 = AbstractC1798ArH.A03();

    @Override // X.InterfaceC1084AXr
    public final Object Afg(InterfaceC1740Apd interfaceC1740Apd, HtJ<? super Unit> htJ) {
        Object objA01 = this.A01.A01(C3UY.A02, htJ, new BU7(this, new Ar5(this, interfaceC1740Apd), null, 3));
        return objA01 != EnumC10460Hji.A02 ? Unit.INSTANCE : objA01;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Ar4(G2k<? super InterfaceC2266BNk, ? super InterfaceC1740Apd, ? super Function0<? extends InterfaceC1497Ak4>, ? super BFM, ? super Integer, Unit> g2k) {
        this.A02 = g2k;
    }

    public final void A00(Function0<? extends InterfaceC1497Ak4> function0, BFM bfm, int i) {
        BBb bBbAAc;
        int i2;
        bfm.AgG(723898654);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, this);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0T), bfm, iA0T)) {
            Ar5 ar5 = (Ar5) this.A00.getValue();
            if (ar5 == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    i2 = 10;
                    BBb.A00(bBbAAc, this, function0, i, i2);
                }
                return;
            }
            this.A02.invoke(ar5, ar5.A00, function0, bfm, Integer.valueOf((iA0T << 6) & 896));
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            i2 = 11;
            BBb.A00(bBbAAc, this, function0, i, i2);
        }
    }
}
